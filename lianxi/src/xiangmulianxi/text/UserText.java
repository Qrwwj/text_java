package xiangmulianxi.text;


import xiangmulianxi.dao.UserDeo;
import xiangmulianxi.impl.UserDeoImp;
import xiangmulianxi.popj.User;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserText {
    public static void main(String[] args) {


        while (true) {
            System.out.println("欢迎光临，请输入你需要的功能：1 登录 2 注册 0 退出系统");

            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();
//        创建UserDeo的对象  方便调用 登录和注册功能
            UserDeo u = new UserDeoImp();
            switch (choice) {
                case 1:
                    System.out.println("---------------登录页面-----------------");
                    System.out.println("请输入账号：");
                    String uname = sc.next();
                    System.out.println("请输入密码：");
                    String upassword = sc.next();

//             调用登录功能

                    boolean flag = u.islogin(uname, upassword);
                    if (flag) {
                        System.out.println("登录成功");
                        System.exit(0);
                    } else {
                        System.out.println("输入的用户或密码有误，登录失败！");
                        System.exit(0);
                    }

                case 2:
                    System.out.println("---------------注册页面-----------------");
                    System.out.println("请输入账号：");
                    String zuname = sc.next();
                    System.out.println("请输入密码：");
                    String zupassword = sc.next();

//            将用户注册账号密码封装到一个对象中
                    User user = new User();
                    user.setUsername(zuname);
                    user.setUserpassword(zupassword);
//            调用注册功能

                    u.regist(user);
                    System.out.println("注册成功");
                    break;

                case 0:
                    System.out.println("系统已安全退出！欢迎下次光临");
                    System.exit(0);
                default:
                    System.out.println("输入有误！");

            }

        }
    }
}
