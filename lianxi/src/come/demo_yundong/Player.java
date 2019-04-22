package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public abstract class Player  extends  Perpson{
    public Player(){}
    public Player(String name,int age){
        super.eat(name,age);
    }
//    声明运动员特有的学习的方法
    public abstract  void study();
}

