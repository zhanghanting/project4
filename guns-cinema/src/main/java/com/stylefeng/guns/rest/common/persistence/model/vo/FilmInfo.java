package com.stylefeng.guns.rest.common.persistence.model.vo;

import java.io.Serializable;

public class FilmInfo implements Serializable
{
    int filmId;//电影编号
    String filmName;//电影名称
    int filmLength;//电影时长
    int filmType;//片源类型
    String filmCats;//电影类别
    String actors;//演员表
    String imgAddress;//影片主图地址
    FilmField[] filmFields;//电影对应的所有放映场次信息
    public FilmInfo()
    {
    }

    public FilmInfo(int filmId,String filmName,int filmLength,int filmType,String filmCats,String actors,String imgAddress,FilmField[] filmFields)
    {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmLength = filmLength;
        this.filmType = filmType;
        this.filmCats = filmCats;
        this.actors = actors;
        this.imgAddress = imgAddress;
        this.filmFields = filmFields;
    }

    public FilmField[] getFilmFields()
    {
        return filmFields;
    }

    public void setFilmFields(FilmField[] filmFields)
    {
        this.filmFields = filmFields;
    }

    public int getFilmId()
    {
        return filmId;
    }

    public void setFilmId(int filmId)
    {
        this.filmId = filmId;
    }

    public String getFilmName()
    {
        return filmName;
    }

    public void setFilmName(String filmName)
    {
        this.filmName = filmName;
    }

    public int getFilmLength()
    {
        return filmLength;
    }

    public void setFilmLength(int filmLength)
    {
        this.filmLength = filmLength;
    }

    public int getFilmType()
    {
        return filmType;
    }

    public void setFilmType(int filmType)
    {
        this.filmType = filmType;
    }

    public String getFilmCats()
    {
        return filmCats;
    }

    public void setFilmCats(String filmCats)
    {
        this.filmCats = filmCats;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

    public String getImgAddress()
    {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress)
    {
        this.imgAddress = imgAddress;
    }
}
