package com.stylefeng.guns.rest.cinema.service;

import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaInfoResponseVO;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.common.util.JsonUtil;

public interface CinemaService
{
    JsonUtil getCinemas(CinemaQueryVO cinemaQueryVO);
    CinemaInfoResponseVO getFields(int cinemaId);
}
