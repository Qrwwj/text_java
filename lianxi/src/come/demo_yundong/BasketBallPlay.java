package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class BasketBallPlay extends Player {

    public BasketBallPlay(){}

    public  BasketBallPlay(String name,int age){
        super(name, age);
    }


    public void eat(){
        System.out.println("篮球运动员吃高能量食品");
    }
    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
}
