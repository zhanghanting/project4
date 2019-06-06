package com.stylefeng.guns.rest.common.util;

import java.io.Serializable;

public class JsonUtil implements Serializable
{
    int status;
    int nowPage = 1;
    int totalPage;
    Object data;

    public JsonUtil()
    {
    }

    public JsonUtil(int status,int nowPage,int totalPage,Object data)
    {
        this.status = status;
        this.nowPage = nowPage;
        this.totalPage = totalPage;
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

    public int getNowPage()
    {
        return nowPage;
    }

    public void setNowPage(int nowPage)
    {
        this.nowPage = nowPage;
    }

    public int getTotalPage()
    {
        return totalPage;
    }

    public void setTotalPage(int totalPage)
    {
        this.totalPage = totalPage;
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
