package com.dianshang.queen;

import com.dianshang.commons.Const;
import com.dianshang.pojo.User;
import com.dianshang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Controller
public class QueenWeb {
    @Autowired
    private IUserService service;

    @RequestMapping("/login.do")
    public String login() {
        return "queen/backlogin";
    }

    @RequestMapping("/index.do")
    public String index() {
        return "queen/index";
    }
    /*超级管理员 数据库中设置好的数据信息*/

    @RequestMapping("/dologin.do")
    public String a(HttpSession session, ModelMap map, String username, String password) {
        if (username != null && !username.equals("")) {
            User user = service.getUserByUsername(username);
            if (user != null) {
                User user1 = service.getUserByUsernameAndPassword(username, password);
                if (user1 == null) {
                    /*密码错误*/
                    map.addAttribute("message", "账号或密码错误！");
                    return "queen/backlogin";
                } else {
                    if (user1.getRole() == Const.QuanXian) {
                        /*用户信息正确 跳转功能页面*/
                        session.setAttribute("user1", user1);

                        return "redirect:index.do";
                    } else {
                        /*权限不足 不能操作*/
                        map.addAttribute("message", "权限不足！");
                        return "queen/backlogin";
                    }
                }
            } else {
                /*用户不存在*/
                map.addAttribute("message", "用户不存在！");
                return "queen/backlogin";
            }
        } else {
            /*未输入用户名*/
            map.addAttribute("message", "请输入账号和密码！");
            return "queen/backlogin";
        }
    }

    /*修改密码*/
    @RequestMapping("/updatepassword.do")
    public String updatepassword() {
        return "queen/updatepassword";
    }

    @ResponseBody
    @RequestMapping("/doupdatepassword.do")
    public String doupdatepassword(String username, String password, String newpass, String renewpass, HttpSession session, ModelMap map) {
        User user = (User) session.getAttribute("user1");
        if (user != null && !user.equals("")) {
            if (password!=null&&!password.equals("")){
                if (user.getPassword().equals(password)) {
                    if (newpass.equals(password)) {
//                    map.addAttribute("message", "新密码与旧密码一致，请重新输入！");
                        return "3";
                    } else {
                        if (newpass != null && !newpass.equals("") && renewpass != null && !renewpass.equals("")) {
                            if (newpass.equals(renewpass)){
                                user.setPassword(newpass);
                                User user1=new User();
                                user1.setId(user.getId());
                                user1.setUsername(user.getUsername());
                                user1.setPassword(newpass);
                                int update = service.update(user1);
                                if (update>0) {
                                    return "6";
                                }else {
                                    return "7";
                                }
                            }else {
//                            map.addAttribute("message", "两次输入的密码不一致，请重新输入！");
                                return "5";
                            }
                        } else {
//                        map.addAttribute("message", "密码不能为空");
                            return "4";
                        }
                    }
                } else {
//                旧密码错误
//                map.addAttribute("message", "输入的密码有误，请重新输入");
                    return "2";
                }
            }else {
                return "4";
            }
        } else {
//            map.addAttribute("message", "账号不能为空！");
            return "1";
        }
    }
}
