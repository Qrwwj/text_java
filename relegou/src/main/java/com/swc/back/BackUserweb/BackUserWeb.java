package com.swc.back.BackUserweb;

import com.swc.commons.conts;
import com.swc.pojo.User;
import com.swc.service.Userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BackUserWeb {
    @Autowired
    private UserService service;
    @RequestMapping("/login.do")
    public String a(){
        return "back/backlogin";
    }
    @RequestMapping("/index.do")
    public String a1(){
        return "back/index";
    }
    @RequestMapping("/dologin.do")
    public String a(HttpSession session, ModelMap map,String username, String password){
        if(username!=null&&!username.equals("")){
            User user = service.getUserByUsername(username);
            if(user!=null){
                User user1 = service.getUserByUsernameAndPassword(username, password);
                if(user1!=null){
                    if(user1.getRole()==conts.PRIVI){
//                        登录成功
                        session.setAttribute("user1",user1);
                        return "redirect:index.do";
                    }else {
//                        用户权限不足
                        map.addAttribute("message","用户权限不足");
                        return "back/backlogin";
                    }
                }else {
//                    输入密码错误
                    map.addAttribute("message","输入密码错误");
                    return "back/backlogin";
                }
            }else {
//                输入用户名不存在
                map.addAttribute("message","输入用户名不存在");
                return "back/backlogin";
            }
        }else {
//            请输入用户名（输入有误）
            map.addAttribute("message","请输入用户名");
            return "back/backlogin";
        }
    }

    @RequestMapping("/pass.do")
    public String a2(){

        return "back/pass";
    }
    @ResponseBody
    @RequestMapping("/dopass.do")
    public String a3(HttpSession session,ModelMap map,String password,String newpass,String renewpass){
        System.out.println(password);
        User user1 = (User)session.getAttribute("user1");
        if(user1!=null){
            if(user1.getPassword().equals(password)){
                if((newpass!=null&&!newpass.equals(""))&&(renewpass!=null&&!renewpass.equals(""))){
                    if (newpass.equals(renewpass)){
                        User user=new User();
                        user.setId(user1.getId());
                        user.setUsername(user1.getUsername());
                        user.setPassword(newpass);
                        int result=service.update(user);
                        if(result>0){
                            return "6";
                        }else {
//                            map.addAttribute("message","修改失败");
                            return "5";
                        }
                    }else {
//                        map.addAttribute("message","两次密码不一致");
                        return "4";
                    }
                }else {
//                    map.addAttribute("message","密码未输入");
                    return "3";
                }

            }else {
//                map.addAttribute("message","原密码错误，重新输入");
                return "2";
            }

        }else {
//            map.addAttribute("message","请重新登录");
            return "1";
        }
    }

   @RequestMapping("/userlist.do")
    public String a3(ModelMap map){
       List<User> users = service.getusers();
       map.addAttribute("user",users);
       return "back/userlist";
   }
   @RequestMapping("/delete.do")
    public String a4(int id){
        service.delete(id);
       return "redirect:userlist.do";
   }

    @RequestMapping("/update.do")
    public String a5(int id,ModelMap map){
        User user = service.selectone(id);
        map.addAttribute("user",user);
        return "back/updateuser";
    }
    @RequestMapping("/doupdate.do")
    public String a5(User user){
        service.update(user);
        return "redirect:userlist.do";
    }
    @RequestMapping("/adduser.do")
    public String a6(){
        return "back/adduser";
    }
    @RequestMapping("/insert.do")
    public String a7(User user){
        service.insert(user);
        return "redirect:userlist.do";
    }
    @RequestMapping("/info.do")
    public String a8(){
        return "back/info";
    }

}
