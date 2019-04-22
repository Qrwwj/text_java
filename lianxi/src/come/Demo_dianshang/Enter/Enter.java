package come.Demo_dianshang.Enter;


import come.Demo_dianshang.User.User;

import java.util.Scanner;

//电商登录页面
//    1 用户登录 键盘录入账号密码
//    2判断账号秘密是否存在 存在登录 不存在 注册
//    3账号存在 判断账号密码是否正确 不正确提示账号或密码错误 限定次数 超过次数选择重置密码或退出登录
//    4账号不存在 提示 你输入的账户不存在 登录请注册
//    5注册环节 判断账号是否注册过 注册过提示返回登录或退出系统 没注册将用户注册的信息提交到数据库保存
//    6账号注册完切账号密码输入成功  提示登录成功
public class Enter {
    //    方法重载
    public static void dL(User[] yonghu, String username1, String password) {
        for (int i = 0; i < yonghu.length; i++) {
            Scanner sc = new Scanner(System.in);

            //                        声明一个变量判断账号密码是否正确


            if (yonghu[i] != null) {
                if (username1.equals(yonghu[i].getName()) && password.equals(yonghu[i].getPassword())) {

                    System.out.println("恭喜你登录成功！");

                    break;

                } else {
                    System.out.println("输入的账号密码错误！请重新登录:");


                }

            }
            else {
                System.out.println("你输入的账号不存在！");
                break;
            }

        }
    }
}

