package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 19:32
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo19 {
     static class Student {
        private String name;
        private int age;

        public Student() {
        }//无参构造函数

        public String getName() {//因为Student类中的成员对象是私有的不能直接调用
            return name;  //通过get/set方法分别获取和赋值
        }

        public void setName(String name) {//创建有参构造函数
            this.name = name;//this 表示这个对象 这一句相当于给name赋值
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    static class StudentDemo {
        public static void main(String[] args) {
            Student s = new Student();//左边创建Student类的对象，对象名s；
//              右边通过创建一个无参的构造函数对s进行初始化值赋值
            s.setName("林青霞");
            s.setAge(18);
            System.out.println(s.getName() + "asda" + s.getAge());
        }
    }
}

