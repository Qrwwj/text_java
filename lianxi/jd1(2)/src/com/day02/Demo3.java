package com.day02;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/4
 * @用知识武装头脑
 */
public class Demo3 {
    public static void main(String[] args) {
        //switch语句的演示
        //通过键盘录入的方式获取要判断的月份
        Scanner sc = new Scanner(System.in);
        //获取要判断的数据
        System.out.println("请输入要判断的月份：");
        int x = sc.nextInt();

        switch (x) {
            case 12:
            case 1:
            case 2:
                System.out.println("该月份是冬季");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("该月份是春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("该月份是夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("该月份是秋季");
                break;

            default:
                System.out.println("你输入的月份有误！");
        }

    }
}
