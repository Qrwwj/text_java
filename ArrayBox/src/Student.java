/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Student {
    public String name;
    public int xuehao, mingci;
    public double a1, a2, a3;

    Student(int xuehao, String name, double a1, double a2, double a3) {
        this.xuehao = xuehao;
        this.name = name;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    double sum() {
        return (this.a1 + this.a2 + this.a3);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", xuehao=" + xuehao +
                ", mingci=" + mingci +
                ", a1=" + a1 +
                ", a2=" + a2 +
                ", a3=" + a3 +
                '}';
    }

}
