package com.day02;

/**
 * @作者：AirZhang
 * @日期：2019/1/7
 * @用知识武装头脑
 */
public class Demo6 {
    public static void main(String[] args ){
        //山峰高度为8848m，纸的厚度0.01m
        //问题：这张纸对折多少次，高度超过8848m
        int shanfeng = 884800;
        int zhi = 1;
        int count = 0;

        while(zhi < shanfeng){
            zhi = zhi*2;
            count++;
        }

        System.out.println("需要对折："+count+"次");
    }
}
