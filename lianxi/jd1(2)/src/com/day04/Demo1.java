package com.day04;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */
public class Demo1 {
    public static void main(String[] args){
        //声明一个数组
        int[] a = new int[5];

        String b[] = new String[5];

        //第一个问题：怎么看数组中现在有什么？
        //第二个问题：怎么向数组中存放东西呢？

        for(int x = 0;x<a.length;x++){
            int y = a[x];
            System.out.println("数组中的第"+x+"个元素是："+y);
        }

//        int x = a[0];
//        int y = a[1];
//        System.out.println("数组中的第一个元素："+x);
//        System.out.println("数组中的第二个元素："+y);

        boolean[] boo = new boolean[5];
        System.out.println(boo[0]);

        char[] ch = new char[5];
        System.out.println(ch[0]);
    }
}
