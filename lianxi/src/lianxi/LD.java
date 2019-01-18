package lianxi;

public class LD {

        public static void main(String[]args){
//            定义一个名字为student的class类
            class student{
                String name;
                int id;
                String sex;
                int args;

//                调用一个函数

                public void say(){
                    System.out.println(name+"的学号是"+id+"他的性别是"+sex+"他的年龄是"+args);



                }
        }
            student a=new student();
            a.name="张三";
            a.id=12312345;
            a.sex="男";
            a.args=18;
            a.say();
            a.name="李四";
            a.id=12312345;
            a.sex="男";
            a.args=18;
            a.say();
            a.name="王五";
            a.id=12312345;
            a.sex="男";
            a.args=18;
            a.say();
    }
}
