package com.dianshang.front;


import com.dianshang.commons.Const;
import com.dianshang.pojo.User;
import com.dianshang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class FrontWeb {
    @Resource
    private IUserService service;

    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping("/userdologin.do")
    public String userdologin(String username, String password) {

        if (username != null && !username.equals("")) {
            User user = service.getUserByUsername(username);
            if (user != null) {
                User user1 = service.getUserByUsernameAndPassword(username, password);
                if (user1 == null) {
                    /*密码错误*/
                    return "1";
                } else {
                    /*用户信息正确 跳转功能页面*/
                    return "2";
                }
            } else {
                /*用户不存在*/
                return "3";
            }
        } else {
            /*未输入用户名*/
            return "4";
        }
    }

    /*注册用户*/
    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping(value = "/getuser.do", method = RequestMethod.POST)
    public String getuser(String uname) {
        User user = service.getUserByUsername(uname);
        if (uname != null && !uname.equals("")) {
            if (user != null) {
//                说明账号已经存在
                return "1";
            } else {
//                账号不存在 可以注册
                return "2";
            }
        } else {
//           账号为空  请输入账号
            return "3";
        }
    }

    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping("/doregister.do")
    public String doregister(User user) {
        int result = 0;
        if (user != null) {
            result = service.insert(user);
        } else {
            result = 0;
        }
        return result + "";
    }

    /*验证问题答案*/
    @ResponseBody
    /*跨域*/
    @CrossOrigin("*")
    @RequestMapping("/doforget.do")
    public String doforget(User user) {
        if (user != null) {
            User u = service.getUserByUsername(user.getUsername());
            if (u.getQuestion().equals(user.getQuestion())) {
                if (u.getAnswer().equals(user.getAnswer())) {
//                     跳转修改页面
                    return "1";
                } else {
//                    输入有误
                    return "2";
                }
            } else {
//                 问题错误
                return "3";
            }

        } else {
//             账号不存在
            return "4";
        }

    }

    /*修改密码*/
    @ResponseBody
    @CrossOrigin("*")
    @RequestMapping("/updatepassword1.do")
    public String updatepassword(String username, String password, String psd) {
        if (username != null && !username.equals("")) {
            User user = service.getUserByUsername(username);
            if (user != null) {

                if (user.getPassword().equals(password)) {
//                        新密码与旧密码一样
                    return "1";
                } else {
                    if (password!=null&&!password.equals("")&&psd!=null&&!psd.equals("")){
                        if (password.equals(psd)) {
                            user.setPassword(password);
                            User user1=new User();
                            user1.setId(user.getId());
                            user1.setUsername(user.getUsername());
                            user1.setPassword(password);
                            int update = service.update(user1);
//                            修改成功
                            return "2";
                        } else {
//                            两次密码输入不一致
                            return "3";
                        }
                    }else {
                        return "5";
                    }

                }

            } else {
//                账号不存在
                return "4";
            }


        }
        /*账号不存在*/
        return "0";
    }


}
