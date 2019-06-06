package com.stylefeng.guns.rest.common.persistence.model.vo;

import java.io.Serializable;
import java.util.List;

/*
包含影院的详细信息和影院所有的电影信息，以及电影的放映场次信息
 */
public class CinemaInfoVO implements Serializable
{
    CinemaInfo cinemaInfo;//影院详细信息
    FilmInfo[] filmList;//该影院所有的电影信息和电影的放映场次信息

    public CinemaInfoVO()
    {
    }

    public CinemaInfoVO(CinemaInfo cinemaInfo,FilmInfo[] filmList)
    {
        this.cinemaInfo = cinemaInfo;
        this.filmList = filmList;
    }

    public CinemaInfo getCinemaInfo()
    {
        return cinemaInfo;
    }

    public void setCinemaInfo(CinemaInfo cinemaInfo)
    {
        this.cinemaInfo = cinemaInfo;
    }

    public FilmInfo[] getFilmList()
    {
        return filmList;
    }

    public void setFilmList(FilmInfo[] filmList)
    {
        this.filmList = filmList;
    }
}
