package com.day02;

import java.util.Scanner;
/**
 * @作者：AirZhang
 * @日期：2019/1/4
 * @用知识武装头脑
 */
public class Demo1 {
    public static void main(String[] args){
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //接收数据
        int x = sc.nextInt();
        int y = sc.nextInt();
        //输出接收到的数据X
        System.out.println("你输入的第一个数字是："+x);
        System.out.println("你输入的第二个数字是："+y);
        System.out.println("两个数字之和是："+(x+y));

        /*练习：
        键盘录入两个数据，获取这两个数据中的最大值

        键盘录入三个数据，获取这三个数据中的最大值

        键盘录入两个数据，比较这两个数据是否相等*/

        int z = (x>y)?x:y;
        System.out.println("两个数中最大的是："+z);

        int a = sc.nextInt();
        int b = sc.nextInt();
    }
}
