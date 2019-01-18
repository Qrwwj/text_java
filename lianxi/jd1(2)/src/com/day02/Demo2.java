package com.day02;

import java.util.Scanner;
/**
 * @作者：AirZhang
 * @日期：2019/1/4
 * @用知识武装头脑
 */
public class Demo2 {
    public static void main(String[] args){
        //流程控制语句:判断两个数中较大的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要比较的第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入要比较的第二个数字：");
        int b = sc.nextInt();

        //用if语句进行比较,第一种格式
        /*if(a>b){
            System.out.println("两个输入的数字中较大的是："+a);
        }*/
        //用if语句进行比较,第二种格式
        /*if(a<b){
            System.out.println("两个输入的数字中较大的是："+b);
        }else {
            System.out.println("两个输入的数字中较大的是："+a);
        }*/


        //比较三个数字的大小
        System.out.println("请输入要比较的第三个数字：");
        int d = sc.nextInt();
        if(a>b){
            if(a>d){
                System.out.println("这三个数字中最大的是："+a);
            }else{
                System.out.println("这三个数字中最大的是："+d);
            }
        }else if(b>d){
            System.out.println("这三个数字中最大的是："+b);
        }else {
            System.out.println("这三个数字中最大的是："+d);
        }



        //判断学生的成绩
        System.out.println("请输入要判断的成绩：");
        int c = sc.nextInt();

        if(c<=100 && c>90){
            System.out.println("该同学的成绩是优秀");
        }else if(c<=90 && c>80){
            System.out.println("该同学的成绩是好");
        }else if(c<=80){
            System.out.println("该同学的成绩不合格");
        }else if(c>100 || c<0){
            System.out.println("输入的成绩有误");
        }

    }
}
