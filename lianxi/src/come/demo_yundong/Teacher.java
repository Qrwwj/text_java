package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public abstract class Teacher extends  Perpson {
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
//    声明教练特有的方法
    public  void teach(){};
}
