package com.stylefeng.guns.rest.modular.cinema.controller;
import com.stylefeng.guns.rest.cinema.service.CinemaService;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaInfoResponseVO;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.common.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 影院信息表 前端控制器
 * </p>
 *
 * @author zhang
 * @since 2019-06-04
 */
@RestController
@RequestMapping("/cinema")
public class MtimeCinemaTController
{
//    @Autowired
//    CinemaService cinemaService;
//    /**
//     *
//     * @param cinemaQueryVO 封装查询条件的JavaBean
//     * @return 返回影院列表
//     */
//    @RequestMapping("/getCinemas")
//    public JsonUtil getCinemas(CinemaQueryVO cinemaQueryVO)
//    {
//        JsonUtil jsonUtil = cinemaService.getCinemas(cinemaQueryVO);
//        return jsonUtil;
//    }
//
//    @RequestMapping("/getFields")
//    public CinemaInfoResponseVO getFields(int cinemaId)
//    {
//        CinemaInfoResponseVO responseVO = cinemaService.getFields(cinemaId);
//        return responseVO;
//    }

}

