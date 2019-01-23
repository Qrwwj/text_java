package come.duotai.student;

/**
 * @Author: wwj
 * @Date: 2019/1/22 18:43
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Student {
    private String name;
    private int age;

    public Student(){}  // 无参构造函数

    public Student(String name,int age){   // 有参构造函数  创建对象并对对象进行初始化赋值
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;   //获取Student类中的name
    }

    public void setName(String name){
        this.name=name;   //为对象的name属性赋值
    }

    public int getAge(){
        return age;   //获取Student类的age属性
    }

    public void setAge(int age){
        this.age=age;     //为Student类的age属性赋值
    }

}
