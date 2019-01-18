package com.day05;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/9
 * @用知识武装头脑
 */
public class Demo3 {
    //
    public String name;





    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //1.进入欢迎页面
        Demo3.cj();

        //2.很据英雄列表去选择英雄
        Demo3[] h = heros();
        bl(h);

        //3.选择你要使用的英雄
        cj1();
        int x = sc.nextInt();
        System.out.println("你选择的英雄是："+h[x].name);
        System.out.println("十分钟后全军出击！");


    }

    //这是旁白的方法
    public static void cj(){
        System.out.println("欢迎来到英雄联盟！请选择你要出战的英雄！");
        System.out.println("请输入功能序号：");
        System.out.println("1.查看所有英雄");
    }

    public static void cj1(){
        System.out.println("请输入英雄序号：");
    }


    //这是获取英雄数组的方法
    public static Demo3[] heros(){
        Demo3[] h = new Demo3[3];

        Demo3 he = new Demo3();
        he.name = "寒冰";

        Demo3 he1 = new Demo3();
        he1.name = "盖伦";

        Demo3 he2 = new Demo3();
        he2.name = "剑圣";

        h[0] = he;
        h[1] = he1;
        h[2] = he2;

        return h;
    }

//    这是遍历数组的方法
    public static void bl(Demo3[] h){
        for(int a = 0;a<h.length;a++){
            System.out.println(h[a].name);
        }
    }

}
