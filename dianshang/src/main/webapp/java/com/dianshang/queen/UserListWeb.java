package com.dianshang.queen;

import com.dianshang.pojo.User;
import com.dianshang.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class UserListWeb {
    @Autowired
    private IUserService service;
/*查询用户信息*/
    @RequestMapping("/userlist.do")
    public String userlist(ModelMap map, Integer id, String pageNum,String username){
//        获取所有用户

        if (id!=null){
            int delete = service.delete(id);
        }
        if (pageNum==null){
            pageNum="1";
        }
        PageHelper.startPage(Integer.parseInt(pageNum),10);
        List <User> users=service.getuser(username);
        PageInfo<User> pageInfo = new PageInfo<>(users);
        map.addAttribute("pageInfo",pageInfo);
        map.addAttribute("users",users);
        map.addAttribute("username",username);
        return "queen/userlist";
    }


}
