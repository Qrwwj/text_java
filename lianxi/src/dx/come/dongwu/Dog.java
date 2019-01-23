package dx.come.dongwu;

/**
 * @Author: wwj
 * @Date: 2019/1/14 20:45
 * @Description: 一步一个脚印
 */
public class Dog extends Animal {
    public String sex;

    public Dog(){

    }

    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }

//    声明一个睡觉的方法
    public void sleep(){
        System.out.println(this.getName()+"现在"+this.getArgs()+"月大，正在睡觉");
    }
}
