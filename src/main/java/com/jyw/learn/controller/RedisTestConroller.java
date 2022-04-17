package com.jyw.learn.controller;

import com.jyw.learn.dao.IRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("redistest")
public class RedisTestConroller {
    @Autowired
    IRedisDao dao;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        dao.setKey("testkey","------");
        return "success";

    }
}
