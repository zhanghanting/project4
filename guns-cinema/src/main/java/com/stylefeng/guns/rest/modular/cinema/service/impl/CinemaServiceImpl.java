package com.stylefeng.guns.rest.modular.cinema.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stylefeng.guns.rest.common.persistence.model.vo.*;
import com.stylefeng.guns.rest.cinema.service.CinemaService;
import com.stylefeng.guns.rest.common.persistence.dao.MtimeCinemaTMapper;
import com.stylefeng.guns.rest.common.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Service(interfaceClass = CinemaService.class)
public class CinemaServiceImpl implements CinemaService
{
    @Autowired
    MtimeCinemaTMapper cinemaTMapper;
    @Override
    public JsonUtil getCinemas(CinemaQueryVO cinemaQueryVO)
    {
        PageHelper.startPage(cinemaQueryVO.getNowPage(),cinemaQueryVO.getPageSize());
        List<CinemaVO> cinemaVOList = cinemaTMapper.getCinemaVO(cinemaQueryVO);
        PageInfo<CinemaVO> cinemaVOPageInfo = new PageInfo<>(cinemaVOList);
        JsonUtil jsonUtil = new JsonUtil();
        if(cinemaVOList != null)
        {
            jsonUtil.setData(cinemaVOList);
            jsonUtil.setNowPage(cinemaVOPageInfo.getPageNum());
            jsonUtil.setTotalPage(cinemaVOPageInfo.getPages());
            jsonUtil.setStatus(0);
        }
        return jsonUtil;
    }

    @Override
    public CinemaInfoResponseVO getFields(int cinemaId)
    {
        CinemaInfoResponseVO responseVO = new CinemaInfoResponseVO();
        //获取电影院的详细信息
        CinemaInfo cinemaInfo = cinemaTMapper.getCinemaInfo(cinemaId);
        CinemaInfoVO cinemaInfoVO = new CinemaInfoVO();
        if(cinemaInfo != null)
            cinemaInfoVO.setCinemaInfo(cinemaInfo);
        //获取该电影院所有的电影信息及电影的放映信息
        List<FilmInfo> filmInfos = cinemaTMapper.getFilmInfo(cinemaId);
        FilmInfo[] filmList = null;
        if(filmInfos != null)
        {
            filmList = new FilmInfo[filmInfos.size()];
            for(int i = 0;i < filmInfos.size(); ++i)
                filmList[i] = filmInfos.get(i);
        }
        cinemaInfoVO.setFilmList(filmList);
        responseVO.setData(cinemaInfoVO);
        return responseVO;
    }
}
