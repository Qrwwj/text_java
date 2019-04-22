package com.swc.front.FrontUserweb;

import com.swc.commons.conts;
import com.swc.pojo.User;
import com.swc.service.Userservice.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserWeb {

    @Resource
    private UserService service;
    @RequestMapping("/dologinfront.do")
    public String a(String username, String password){
        if(username!=null&&!username.equals("")){
            User user = service.getUserByUsername(username);
            if(user!=null){
                User user1 = service.getUserByUsernameAndPassword(username, password);
                if(user1==null) {
//                    密码错误
                    return "1";
                }else {
//                    成功登录
                    return "2";
                }
            }else {
//                输入用户名不存在
                return "3";
            }
        }else {
//            未输入
            return "4";
        }
    }

}
