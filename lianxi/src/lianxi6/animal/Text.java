package lianxi6.animal;

import lianxi6.animal.Cat;
import lianxi6.animal.Dog;
/**
 * @Author: wwj
 * @Date: 2019/1/14 21:16
 * @Description: 一步一个脚印
 */
public class Text {
    public static void main(String[]args){
        Cat one=new Cat();
        one.setName("瓶盖");
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println("----------------");
        Dog two=new Dog();
        two.setName("十二");
        two.setSpecies("金毛");
        two.setArgs(2);
        two.eat();
        two.sleep();

    }
}
