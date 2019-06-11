package com.stylefeng.guns.rest.modular.cinema.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.cinema.service.CinemaService;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaInfoResponseVO;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.common.util.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/cinema")
@RestController
public class CinemaController
{
    @Reference
    CinemaService cinemaService;
    /**
     *
     * @param cinemaQueryVO 封装查询条件的JavaBean
     * @return 返回影院列表
     */
    @RequestMapping("/getCinemas")
    public JsonUtil getCinemas(CinemaQueryVO cinemaQueryVO)
    {
        JsonUtil jsonUtil = cinemaService.getCinemas(cinemaQueryVO);
        return jsonUtil;
    }
    @RequestMapping("/getFields")
    public CinemaInfoResponseVO getFields(int cinemaId)
    {
        CinemaInfoResponseVO responseVO = cinemaService.getFields(cinemaId);
        return responseVO;
    }
}
