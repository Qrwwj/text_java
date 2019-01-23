package dx.come.dongwu;

/**
 * @Author: wwj
 * @Date: 2019/1/22 16:07
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class A {
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
