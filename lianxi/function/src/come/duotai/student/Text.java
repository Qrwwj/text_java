package come.duotai.student;

/**
 * @Author: wwj
 * @Date: 2019/1/22 18:43
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Text {

    public static void main(String[]args){
//        调用Student类中的属性方法

//        多态
        Student s1=new Student();
        s1.setName("林青霞");
        s1.setAge(18);
        System.out.println(s1.getName()+"---"+s1.getAge());


        Student s2=new Student("刘毅",30);
        System.out.println(s2.getName()+"---"+s2.getAge());
    }
}
