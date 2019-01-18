package com.day01;

/**
 * @作者：AirZhang
 * @日期：2019/1/3
 * @用知识武装头脑
 */
public class Demo4 {
    public static void main(String[] args){
        //声明三个变量
        int a = 5;
        int b = 10;
        int c = 12;
        //对这三个变量进行一些运算
        int d = a/b;//除法的值是商
        int e = a%c;//取模的值是余数

        System.out.println(d);
        System.out.println(e);

        System.out.println("=================");
        //自增和自减运算符
        int x = 3;
        ++x;//4
        System.out.println(x++);//4
        int y = 2;//x=5
        System.out.println(--x+ ++y- y--);//6,4,5,3,  4+3-3
        System.out.println("x:"+x);
        System.out.println("y:"+y);

        //赋值运算符
        int x1 = 5;
        x1+=10;//x1 = x1 +10
        System.out.println(x1);

        //一个面试题
//        short s=1;
//        s = s+1;
//        short s=1;
//        s+=1;

        //比较运算符
        System.out.println(4<3);
        System.out.println(4<3 & 3<4);
//        System.out.println(x1<3 & x1++<2);
        System.out.println(x1<3 && x1++<2);
        System.out.println(x1);

        //用三元运算符，获取三个整数中的最大值
        int a1 = 10;
        int b1 = 5;
        int c1 = 13;
        int d1 = (a1>b1)?((a1>c1)?a1:((b1>c1)?b1:c1)):((b1>c1)?b1:c1);

    }
}
