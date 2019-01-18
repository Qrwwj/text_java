package lianxi.text1_17;

/**
 * @Author: wwj
 * @Date: 2019/1/17 21:25
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Hero {
    String name;
    int args;
    int price;
    public  void gj(String name){
        System.out.println(name+"英雄正在攻击");
    }
    public  void move(String name){
        System.out.println(name+"英雄正在行走");
    }
    public static void main (String[]args){
        Hero y=new Hero();
        y.name="寒冰射手";
        y.args=18;
        y.price=13888;
        y.gj(y.name);
        y.move(y.name);
    }
}
