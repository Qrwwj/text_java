package com.day05;

/**
 * @作者：AirZhang
 * @日期：2019/1/9
 * @用知识武装头脑
 */
public class Hero {
    //关于这个英雄类的属性：成员变量
    String name;
    int age;
    String sex;
    //....

    //关于这个英雄类的方法：成员方法
    public void attack(String name){
        System.out.println(name+"英雄正在攻击");
    }

    public void move(){
        System.out.println("英雄正在行走");
    }

    public static void main(String[] args){
        //创建一个影响（对象）
        Hero y1 = new Hero();
        y1.name = "寒冰射手";
        y1.age = 18;
        y1.sex = "女";

        y1.attack(y1.name);

    }
}
