package com.stylefeng.guns.rest.common.persistence.model.vo;

import java.io.Serializable;

public class CinemaInfo implements Serializable
{
    int cinemaId;
    String imgUrl;//影院图片地址
    String cinemaName;//影院名称
    String cinemaAddress;//影院地址
    String cinemaPhone;//影院电话

    public CinemaInfo()
    {
    }

    public CinemaInfo(int cinemaId,String imgUrl,String cinemaName,String cinemaAddress,String cinemaPhone)
    {
        this.cinemaId = cinemaId;
        this.imgUrl = imgUrl;
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
        this.cinemaPhone = cinemaPhone;
    }

    public int getCinemaId()
    {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId)
    {
        this.cinemaId = cinemaId;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public String getCinemaName()
    {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName)
    {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddress()
    {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress)
    {
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaPhone()
    {
        return cinemaPhone;
    }

    public void setCinemaPhone(String cinemaPhone)
    {
        this.cinemaPhone = cinemaPhone;
    }
}
