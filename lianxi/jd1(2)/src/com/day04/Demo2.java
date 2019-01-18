package com.day04;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */
public class Demo2 {
    public static void main(String[] args){
        //如何向数组中放数据
        int[] a = new int[6];
        a[0] = 100;
        a[1] = 10;

        int b = 2;
        //给数组中的每个值进行赋值
        for(int x = 0;x<a.length;x++){
            a[x] = b;
            b = b*2;
        }


        for(int x = 0;x<a.length;x++){
           int s = a[x];
           System.out.println("赋值后数组的每个值："+s);
        }
        long[] ll = new long[6];


        System.out.println("===============================");
        System.out.println("第一个数组的地址："+a);
        System.out.println("第二个数组的地址："+ll);

    }
}
