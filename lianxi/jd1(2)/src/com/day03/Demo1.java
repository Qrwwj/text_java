package com.day03;

import java.util.Scanner;
/**
 * @作者：AirZhang
 * @日期：2019/1/7
 * @用知识武装头脑
 */

/*用java中的方法方式，模拟一个计算器，要求能够根据用户的意愿进行加、减、乘、除或者取模，
直到用户确认输出结果时，计算器停止计算。
* */
public class Demo1 {
    public static void main(String[] args){
        //计算两个数据的和
//        int a = 1;
//        int b = 3;
//        int c = a+b;
//        System.out.println("两个数的和是："+c);

        Scanner sc = new Scanner(System.in);
        //再计算两个数的和
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sum(a,b);
        System.out.println("两个数的和是："+c);
    }

    //写一个计算两个数据之和的方法
    public static double sum(double a,int b){
        double c = a+b;
        //System.out.println("两个数的和是："+c);
        return c;
    }
}
