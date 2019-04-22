package com.swc.web;

import com.alibaba.fastjson.JSONObject;
import com.swc.service.Userservice.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserWeb222 {
    @Resource
    private UserService service;
    @ResponseBody
    @RequestMapping(value = "a.do",produces = "text/html;charset=utf-8")
    public String aa(){
        return JSONObject.toJSONString(service.getusers());
    }
}
