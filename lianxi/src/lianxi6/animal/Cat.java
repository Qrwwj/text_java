package lianxi6.animal;

/**
 * @Author: wwj
 * @Date: 2019/1/14 20:45
 * @Description: 一步一个脚印
 */
public class Cat extends Animal {
private double weight;// 声明一个重量的私有属性
    public Cat(){                    //声明一个类名为cat的构造方法

    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }


//    声明一个跑动的方法
    public void run(){
        System.out.println("名字是"+this.getName()+"的猫，正在跑");
    }

}
