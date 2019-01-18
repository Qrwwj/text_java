package dx.come;

public class Student {
//    首先声明学生的属性
    String name;
    int id;
    String sex;
    int args;
    String grade;
//    声明学生的方法
    public void St(String name){
        System.out.println(name+"是本校学生");
    }
    public void St1(int id){
        System.out.println("学号为"+id+"的学生是好学生");
    }
public static void main(String []args){

    Student s1=new Student();
    s1.name="张三";
    s1.id=123456;
    s1.args=18;
    s1.grade="Java开发14班";

    s1.St(s1.name);
    s1.St1(s1.id);

}

}
