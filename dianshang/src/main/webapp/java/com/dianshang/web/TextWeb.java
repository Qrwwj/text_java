package com.dianshang.web;

import com.alibaba.fastjson.JSONObject;
import com.dianshang.dao.UserDao;
import com.dianshang.pojo.User;
import com.dianshang.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class TextWeb {
    /*依赖注入*/
    /*要输出的内容 做一个封装   返回封装的类型    1 状态码 2 对象 3 message*/
    @Resource
    private IUserService service;
    /*@ResponseBody
    @RequestMapping(name = "/a.do",produces = "text/html;charset=utf-8")
    public String a(){
        return JSONObject.toJSONString(service.getUsers());
    }*/
    @ResponseBody
    @RequestMapping(value = "/b.do")
    public String b(){
//        System.out.println(JSONObject.toJSONString(service.getuser(username)));;
        return "a";
    }

}
