package dx.come.demo1.EC.src.Login;

import dx.come.demo1.EC.src.Register.Register;

import java.util.Scanner;

/*
 * 用户登录：
 * 1.输入账号和密码
 * 2.验证账号和密码
 * 3.登录成功跳转到主界面
 * 4.登录失败登录
 *
 * */
public class Login {
    public static void main(String[] args) {
//        输入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String uname=sc.nextLine();
        System.out.println("请输入密码");
        String upassworld=sc.nextLine();

        String account[][]={{uname},{upassworld}};
//        验证账号与密码



    }
}
