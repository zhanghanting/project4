package com.stylefeng.guns.rest.modular.cinema.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.rest.cinema.service.IMtimeAreaDictTService;
import com.stylefeng.guns.rest.persistence.model.MtimeAreaDictT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController
{
    @RequestMapping("/test")
    public String getResult()
    {
        return "ok";
    }
    @Reference
    IMtimeAreaDictTService areaDictTService;
    @RequestMapping("/getAreaById")
    public MtimeAreaDictT getAreaById(int id)
    {
        return null;
    }

}
