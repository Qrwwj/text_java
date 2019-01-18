package lianxi5;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/12 16:34
 * @Description: 一步一个脚印
 */

//用来测试每个类中的方法
public class CS {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    //    声明存储账号密码的数组
    String account[][] = new String[3][2];
//    注册完成后跳转 重新登录  判断是否注册成功
    while (true) {


        System.out.println("欢迎来到解忧杂货店！请选择功能：1 登录；2 注册；");
//    接收输入的功能代码
        int xz = sc.nextInt();



        if (xz == 1) {
            System.out.println("欢迎来到登录页面，请输入你的账号密码");


        }
        if (xz == 2) {
            System.out.println("欢迎来到注册页面");
            System.out.println("请输入你要注册的账号：");
            String uname = sc.next();
            System.out.println("请输入密码");
            String upassword = sc.next();
//        调用注册类中的注册方法
            int xz1=1;
            while (xz1==1){
            boolean flag =ZC.fangfa(uname, upassword, account);
//如果注册失败选择继续注册还是退出程序
            if (!flag) {
                System.out.println("请选择功能：1 继续注册；2 退出系统；");
                xz1 = sc.nextInt();
                if (xz1==2){
                    return;
                }

            }else {
                break;
            }
            }
        }

    }
}

}
