package com;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//编写一个程序在屏幕上输出1！+2！+3！...+10！的和

//    1！+2！+3！...+10！的和 表示1的阶乘+2的阶乘+...10的阶乘的总和
public class ForText {
    public static void main(String[] args) {

        int i, j, sum = 0, mul;
        for (i = 1; i <= 10; i++) {
            mul = 1;
            for (j = 1; j <= i; j++) {
                mul = mul * j;  //表示阶乘

            }
            System.out.println(i+"的阶乘为："+mul);
            sum += mul;
        }
        System.out.println("1！+2！+3！...+10！的和是：" + sum);
    }
}
