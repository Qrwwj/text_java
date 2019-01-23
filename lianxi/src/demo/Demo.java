package demo;

/**
 * @Author: wwj
 * @Date: 2019/1/21 20:40
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo {


    public static void main(String[]args){

        Demo demo=new Demo();
        int x=5;
        int y=10;

        demo.jb(1,5);
        demo.jb(x,y);

    }
//    声明一个参数使劲本数据类型的方法

    public int jb(int a, int b){
        int c=a+b;
        return c;
    }


}
