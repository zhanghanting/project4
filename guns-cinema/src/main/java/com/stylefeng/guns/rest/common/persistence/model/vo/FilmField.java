package com.stylefeng.guns.rest.common.persistence.model.vo;

import java.io.Serializable;

public class FilmField implements Serializable
{
    int field;//电影播放场次编号
    String beginTime;//放映开始时间
    String endTime;//放映结束时间
    String language;//电影语言
    String hallName;//放映厅名称
    int price;

    public FilmField()
    {
    }

    public FilmField(int field,String beginTime,String endTime,String language,String hallName,int price)
    {
        this.field = field;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.language = language;
        this.hallName = hallName;
        this.price = price;
    }

    public int getField()
    {
        return field;
    }

    public void setField(int field)
    {
        this.field = field;
    }

    public String getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(String beginTime)
    {
        this.beginTime = beginTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getHallName()
    {
        return hallName;
    }

    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
