package com.day01;

/**
 * @作者：AirZhang
 * @日期：2019/1/3
 * @用知识武装头脑
 */
public class Demo2 {
    public static void main(String[] args){
        //演示数据类型的默认转换和强制转换
        int a = 10;
        long b = 30;
        long c = 40;
        int d = (int)(b+c);

        byte x = 10;
        byte y = 10;
        int z = x+y;

        //byte,short,char之间不互相转换，而是先转换成int再参与计算
        byte x1 = 13;
        short y1 = 16;
        int z1 = x1+y1;

        //boolean数据类型不转换成其它数据类型
        boolean f = true;
        int g = 0;
        byte h = 1;
        boolean k = f;

        //一个面试题
        byte b3,b1 = 3,b2 = 4;
        b3 = (byte)(b1 + b2);
        b3 = 1;
    }
}
