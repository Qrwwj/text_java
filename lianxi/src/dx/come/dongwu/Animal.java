package dx.come.dongwu;

/**
 * @Author: wwj
 * @Date: 2019/1/14 20:45
 * @Description: 一步一个脚印
 */
public class Animal {

    //    声明动物的共同属性
    private String name;
    private int args;
    private String species;//名称

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArgs() {
        return args;
    }

    public  void setArgs(int args){
        this.args=args;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
        this.species=species;
    }


//    声明一个吃东西的方法
    public void eat(){
        System.out.println(this.getName()+"正在吃东西");
    }
}
