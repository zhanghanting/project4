package com.stylefeng.guns.rest.common.persistence.model.vo;

import java.io.Serializable;

public class CinemaQueryVO implements Serializable
{
    int brandId = 99;
    int hallType = 99;
    int districtId = 99;
    int nowPage = 1;//默认当前页数为第一页
    int pageSize = 12;//默认每页条数为12条

    public CinemaQueryVO()
    {
    }

    public CinemaQueryVO(int brandId,int hallType,int districtId,int nowPage,int pageSize)
    {
        this.brandId = brandId;
        this.hallType = hallType;
        this.districtId = districtId;
        this.nowPage = nowPage;
        this.pageSize = pageSize;
    }

    public int getBrandId()
    {
        return brandId;
    }

    public void setBrandId(int brandId)
    {
        this.brandId = brandId;
    }

    public int getHallType()
    {
        return hallType;
    }

    public void setHallType(int hallType)
    {
        this.hallType = hallType;
    }

    public int getDistrictId()
    {
        return districtId;
    }

    public void setDistrictId(int districtId)
    {
        this.districtId = districtId;
    }

    public int getNowPage()
    {
        return nowPage;
    }

    public void setNowPage(int nowPage)
    {
        this.nowPage = nowPage;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }
}
