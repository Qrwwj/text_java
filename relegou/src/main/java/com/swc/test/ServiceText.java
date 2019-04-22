package com.swc.test;

import com.swc.pojo.User;
import com.swc.service.Userservice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
//让单元测试运行在spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//测试的是applicationcontext.xml
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ServiceText {
//    依赖注入，控制反转
    @Resource
    private UserService service;
//    利用单元测试
    @Test
    public void a(){
        List<User> list = service.getusers();
        for (User u:list
             ) {
            System.out.println(u);
        }
    }
}
