package com.stylefeng.guns.rest.common.persistence.model.vo;


import java.io.Serializable;

public class CinemaInfoResponseVO implements Serializable
{
    int status;
    String imgPre;
    Object data;

    public CinemaInfoResponseVO()
    {
    }

    public CinemaInfoResponseVO(int status,String imgPre,Object data)
    {
        this.status = status;
        this.imgPre = imgPre;
        this.data = data;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }

    public String getImgPre()
    {
        return imgPre;
    }

    public void setImgPre(String imgPre)
    {
        this.imgPre = imgPre;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }
}
