package lianxi3;

import java.util.Scanner;

public class D4b {
    public static void main(String[]args){
//        定义一个数组 用来存储用户输入的账号密码
        String [][] a=new String [3][2];

        while (true){
            System.out.println("召唤师，欢迎来到解忧杂货铺");
            System.out.println("请输入功能编号选择功能：");
            System.out.println("1.登录");
            System.out.println("2.注册");
            Scanner sc=new Scanner(System.in);
            int ceshi=sc.nextInt();
//            登录过程
            if (ceshi==1){

                System.out.println("请输入账号：");
                String name=sc.next();
                System.out.println("请输入密码：");
                String password=sc.next();
                System.out.println("来了，老弟");
break;
            }
//            注册环节
            if (ceshi==2){
                System.out.println("请输入注册账户：");
                String name = sc.next();
                System.out.println("请输入注册密码：");
                String password = sc.next();

                int ceshi2=1;
                while (ceshi2==1){
                    boolean flag=D4.zhuce(name, password,a);
                    if (!flag){
                        System.out.println("请选择功能：");
                        System.out.println("1.返回登录");
                        System.out.println("2.退出程序");
                        ceshi2=sc.nextInt();
                        if (ceshi2==2){
                            return;
                        }else {
                            break;
                        }
                    }
                }

            }
        }
    }

}
