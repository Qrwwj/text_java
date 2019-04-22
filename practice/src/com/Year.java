package com;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//编写一个程序，键盘录入一个年份判断是否为闰年
public class Year {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入一个年份：");

        int year=sc.nextInt();

            if (year%4==0&&year%100!=0||year%400==0){
                System.out.println(year+"年是闰年");
            }else {
                System.out.println(year+"年不是闰年");
            }
        }
    }
