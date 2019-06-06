package com.stylefeng.guns.rest.common.persistence.dao;

import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaInfo;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.common.persistence.model.MtimeCinemaT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.guns.rest.common.persistence.model.vo.CinemaVO;
import com.stylefeng.guns.rest.common.persistence.model.vo.FilmInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 影院信息表 Mapper 接口
 * </p>
 *
 * @author zhang
 * @since 2019-06-04
 */
public interface MtimeCinemaTMapper extends BaseMapper<MtimeCinemaT>
{
    List<CinemaVO> getCinemaVO(@Param("cinemaQueryVO") CinemaQueryVO cinemaQueryVO);

    CinemaInfo getCinemaInfo(@Param("cinemaId") int cinemaId);

    List<FilmInfo> getFilmInfo(@Param("cinemaId") int cinemaId);
}
