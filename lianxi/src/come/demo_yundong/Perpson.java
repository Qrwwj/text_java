package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//定义人的抽象类
public class Perpson {
    private String name;
    private  int age;

    public Perpson(){}   //无参构造方法
    public  Perpson(String name,int age){    //有参构造方法
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println("人都要睡觉");
    }
    public void eat(String name, int age){
        System.out.println("人都要吃饭");
    }
}
