package demo;

/**
 * @Author: wwj
 * @Date: 2019/1/21 19:53
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//用户注册功能

import java.util.Scanner;

/**
 * 1 键盘录入 输入账号密码
 * 2  还将注册的账号密码 存放在数组中
 * 3 判断数组中 要注册的账号是否已经存在 存在 输出账号已存在
 * 4 不存在的话  判断数组中是否还存在位置 存在位置输出 账号注册成功 退出系统
 * 5  位置不为空 输出 当前注册已满 感谢您的注册
 * <p>
 * <p>
 * 思路: 首先创建一个用户类 声明用户的属性
 */

public class Demo1 {

    public static void main(String[] args) {

//    初始化一个数组，用来存储用户数据

//    String[] cunchu=new String[10];
//初始化一个数据类型是User的数组， 用来方User类的对象
        User[] us = new User[10];
//创建一个对象方法到数组中
        User u = new User();
//    创建完成后对影虎进行赋值
        u.name = "wwj";
        u.password = "123456";
//用户创建成功  需要放到数组中存储起来
        us[0] = u;


//输入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的账号：");
        String uname = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

    }

    // 写一个比对账号密码的数据方法
    public static void fangfa(User[] yonghu, String uname, String upassword) {

//    这个方法的实现需要账号密码去生成一个用户对象
//        不要一个数组存放着个对象   公共的
//for (int i=0;i<yonghu[])

//        把账号和密码封装成一个User类的对象

        User use = new User();
        use.name = uname;
        use.password = upassword;

//        把对象放到数组中


    }

}
