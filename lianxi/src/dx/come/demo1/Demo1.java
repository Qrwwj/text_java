package dx.come.demo1;

/**
 * @Author: wwj
 * @Date: 2019/1/16 16:39
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo1 {

        class Outer{ //外部类
            int num =4;
            class Inner{ //内部类
                void show(){ //构造函数
                    System.out.println("内部类直接访问外部类中的成员变量"+num);
                }
            }
            public void method(){
                Inner in=new Inner();//创建内部类的对象
                in.show();//调用内部类的方法
            }
        }
    }


