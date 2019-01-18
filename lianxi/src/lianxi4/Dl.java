package lianxi4;

import java.util.Scanner;

public class Dl {
    //    输入账号密码登录
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (true) {
            while (a < 3) {
                System.out.println("请输入账号：");
                int name = sc.nextInt();
                System.out.println("请输入密码：");
                int password = sc.nextInt();

                int usename = 10086;
                int upassword = 123456;

                if (usename == name && upassword == password) {
                    System.out.println("欢迎来到英雄联盟");
                    return;
                } else {
                    System.out.println("你输入的账号或密码错误，请重新输入");
                    a++;
                    if (a == 3) {
                        System.out.println("输入的次数过多，请稍后重试");

                    }
                }


            }



        }
    }
}
