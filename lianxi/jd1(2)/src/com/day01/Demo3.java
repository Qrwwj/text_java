package com.day01;

/**
 * @作者：AirZhang
 * @日期：2019/1/3
 * @用知识武装头脑
 */
public class Demo3 {
    public static void main(String[] args){
        char a = 'a';
        System.out.println('a');//a
        System.out.println(a);//a
        System.out.println("=====================1");

        System.out.println('a'+1);//98
        System.out.println(a+2);//99
        System.out.println("=====================2");

        System.out.println('a'+"a"+1);
        System.out.println(a+1+"a");

        System.out.println("=====================3");
        System.out.println("hello"+'a'+1);
        System.out.println('a'+1+"hello");
        System.out.println("5+5="+5+5);
        System.out.println(5+5+"=5+5");


    }
}
