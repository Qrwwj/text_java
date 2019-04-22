package com.web;

import com.pojo.User;
import com.service.IUserService;
import com.service.UserServiceImpl;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@Controller
public class WebText {
    private IUserService service = new UserServiceImpl();

    //将后台获取的信息在前段页面显示-------相当于主页面
    @RequestMapping("/list.do")
    public String list() {
        return "list";
    }
    /*
     * 后台接收前台from表单中的值
     * 1 HttpServletRequest request
     * 2对应的数据类型
     * 3 通过JavaBean接收   JavaBean实体类 相当于 pojo
     * */


    /*
     * 登陆成功 把用户名放到首页面
     * 从后台向前台绑定值
     * 1 HttpServletRequest request
     * 2 ModelMap map
     * 3 ModelandView
     * */
    //登录  前端页面发送请求到这  地址栏输入login.do---跳转到login.jsp页面
    @RequestMapping("/login.do")
    public String get() {
        return "user/login";
    }

    /*-----------------------------------普通登录------------------------------------------------------
        //    接收前端传过来的登录请求 做处理@RequestMapping("/dologin.do")
        @RequestMapping("/dologin.do")
        public String dologin(String username, String password, ModelMap map) {
            String result = "";
            if (username != null & !username.equals("")) {
    //           如果账号不为空 并且不是空字符串 执行这一步
                User u = service.getUserByUsername(username);   //这一句表示接受前端输入的账号username并且与后台作比较 最后返回一个User对象 u
                if (u != null) {
    //               如果前端输入的账号 在后台存在执行这一步
                    User user = service.getUserByUsernameAndPassword(username, password);   //获取账号密码即判断账号密码是否匹配
                    if (user == null) {
    //                   如果不匹配执行这一部
                        map.addAttribute("massage", "账号或密码错误，请重新输入！");
                        result = "user/login";
                    } else {//账号密码匹配执行这一部
    //                   默认方式转发
    //                           * 设置重定向 redirect
                        result = "redirect:list.do";  //这里是重定向  跳转到主页
                    }
                } else {
    //               如果前端输入的账号在后台不存在执行这一步
                    map.addAttribute("massage", "用户不存在");
                    result = "user/login";
                }
            } else { //账号为空执行这一部
                map.addAttribute("massage", "请输入用户信息");
                result = "user/login";
            }

    //        map.addAttribute("uname", user.getUsername());
    //    request.setAttribute("uname",user.getUsername());



            return result;

        }
    ------------------------------------ajax登录--------------------------------------------------------*/
    @ResponseBody
    @RequestMapping("/dologin.do")
    public String dologin(HttpSession session,String username, String password) {
        String result = "";
        if (username != null & !username.equals("")) {
//           如果账号不为空 并且不是空字符串 执行这一步
            User u = service.getUserByUsername(username);   //这一句表示接受前端输入的账号username并且与后台作比较 最后返回一个User对象 u
            if (u != null) {
//               如果前端输入的账号 在后台存在执行这一步
                User user = service.getUserByUsernameAndPassword(username, password);   //获取账号密码即判断账号密码是否匹配
                if (user == null) {
//                   如果不匹配执行这一部
                    result = "3";
                } else {//账号密码匹配执行这一部
//                   默认方式转发
//                           * 设置重定向 redirect
                    session.setAttribute("user",u);
                    result = "4";  //这里是重定向  跳转到主页
                }
            } else {
//               如果前端输入的账号在后台不存在执行这一步
                result = "2";
            }
        } else { //账号为空执行这一部
            result = "1";
        }
        return result;

    }

    /*-----------------------------------ajax注册-------------------------------------------------------*/
//    跳转到注册页面
    @RequestMapping("/register.do")
    public String register() {
        return "user/register";
    }

    //    注册功能
    @ResponseBody   //这里说明return返回的是流的形式   不用返回具体的页面
    @RequestMapping(value = "/dousername.do", method = RequestMethod.POST)

    public String dousername(String uname) {

        User user = service.getUserByUsername(uname);
        String a = "";
        if (uname != null && !"".equals(uname)) {
            if (user != null) {
//                用户已存在
                a = "3";
            } else {
//                可以注册
                a = "2";
            }
        } else {
//            请输入用户名
            a = "1";
        }
        return a;
    }

    @ResponseBody
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

    /*-----------------------------------ajax修改密码（验证问题答案）-------------------------------------------------------*/
    @RequestMapping("/forget.do")
    public String forget(String uname, ModelMap map) {
        if (uname != null && !uname.equals("")) {
            User user = service.getUserByUsername(uname);
            if (user != null) {
                map.addAttribute("user", user);
            }
        }
        return "user/forget";
    }

    @ResponseBody
    @RequestMapping("/doforget.do")
    public String doforget(User user, ModelMap map) {
        String result = "";
        if (user != null) {
            User u = service.getUserByUsername(user.getUsername());
            if (u.getQuestion().equals(user.getQuestion())) {
                if (u.getAnswer().equals(user.getAnswer())) {
                    map.addAttribute("username", u.getUsername());
                    result = "4";
                } else {
//                map.addAttribute("message","答案不一致！");
                    result = "3";
                }
            } else {
//            map.addAttribute("message","问题不一致！");
                result = "2";
            }
        } else {
//        map.addAttribute("message","输入有误！");
            result = "1";
        }
        return result;
    }

    /*-----------------------------------ajax修改密码-------------------------------------------------------*/
    @RequestMapping("/updatepassword.do")
    public String updatePassword(String username, ModelMap map) {
        if (username != null && !username.equals("")) {
            User user = service.getUserByUsername(username);
            map.addAttribute("user", user);
        } else {
            map.addAttribute("message", "账号不存在！");
            return "user/updatepassword";
        }
        return "user/updatepassword";
    }


    @RequestMapping("/doupdatepassword.do")
    public String doupdate(String username, String password, String psd, ModelMap map) {
        if (username != null && !username.equals("")) {
            User user = service.getUserByUsername(username);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    map.addAttribute("message", "新密码与旧密码一致！");
                    return "user/updatepassword";
                } else {
                    if (psd.equals(password)) {
                        int result = service.updatePasswordByUsername(username, password);
                        if (result > 0) {
                            return "redirect:login.do";
                        } else {
                            map.addAttribute("message", "修改失败");
                            return "user/updatepassword";
                        }
                    } else {
                        map.addAttribute("message", "两次输入的密码不一致");
                        return "user/updatepassword";
                    }
                }

            } else {
                map.addAttribute("message", "账号不存在！");
                return "user/updatepassword";

            }

        } else {
            map.addAttribute("message", "账号不存在！");
            return "user/updatepassword";
        }
    }
    /*-----------------------------------文件上传-------------------------------------------------------*/

    @RequestMapping("/gofile")
    public String gofile(){
        return "user/gofile";
    }
    @RequestMapping("/dofile.do")
    public String dofile(MultipartFile file){
        System.out.println(file.getOriginalFilename());
        File file1=new File("E:\\3.6\\"+file.getOriginalFilename());
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),file1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}