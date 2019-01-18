package com.day02;


import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/7
 * @用知识武装头脑
 */
public class Demo5 {
    public static void main(String[] args) {
        //while循环语句演示:模拟用户登录的过程
        //用户登录，需要输入账号和密码
        //创建一个记录次数的变量
        Scanner sc = new Scanner(System.in);
        int count = 0;
        wk:
        while (true) {
            while (count < 3) {

                System.out.println("请输入登录账号：");
                //1.接收String类型的账号
                String name = sc.next();
                System.out.println("请输入登录密码：");
                //2.接收密码(用一个简单的密码)
                int password = sc.nextInt();

                //3.模拟在数据库中创建一个账户
                String uname = "zhangxin";
                int upassword = 123456;

                //判断用户是否存在
                if (name.equals(uname) && password == upassword) {
                    System.out.println("登录成功");
                    //return;//可以
                    break wk;

                } else {
                    System.out.println("账号或密码错误！请查证后再登录~");
                    //每次登录失败，count增加一次
                    count++;
                }

            }


            //问题：用户登录失败后要再次登录
            //问题2：用户连续输入错误3次，程序结束
            if (count == 3) {
                System.out.println("输入次数过多，程序已锁定！");
                //只有在锁定的情况下，才需要解锁，这里用回答问题来模拟解锁过程
                while (count != 0) {
                    System.out.println("请回答问题，解锁登录！");
                    System.out.println("什么早上四条腿，中午两条腿，晚上三条腿？请给出答案：");
                    //获取用户的答案
                    String answer = sc.next();
                    //把正确答案声明出来
                    String uanswer = "人";
                    //回答正确，要给登录过程解锁
                    if (answer.equals(uanswer)) {
                        count = 0;
                    } else {
                        System.out.println("你输入的有问题啊，再想想呗？");
                    }
                }
            }
        }

    }

}
