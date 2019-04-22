package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//用来测试一系列方法
public class InterFaceDemo {
    public static void main(String[] args) {

//        测试运动员
        PingPangPlayer pingpang = new PingPangPlayer();
        pingpang.setName("张三");
        pingpang.setAge(18);
        System.out.println(pingpang.getName() + "---" + pingpang.getAge());
        pingpang.eat();
        pingpang.sleep();
        pingpang.spack();
        pingpang.study();

        System.out.println("------------------------------------");
        BasketBallPlay basket = new BasketBallPlay();
        basket.setName("姚明");
        basket.setAge(34);
        System.out.println(basket.getName() + "---" + basket.getAge());
        basket.eat();
        basket.study();
        basket.sleep();

//        测试教练

        PingPangTeacher pt = new PingPangTeacher();
        pt.setName("李四");
        pt.setAge(18);
        System.out.println(pt.getName() + "---" + pt.getAge());
        pt.eat();
        pt.study();
        pt.spack();
        pt.teach();
        pt.sleep();

        System.out.println("-------------------");

        BasketBallTeacher bt = new BasketBallTeacher();
        bt.setName("王五");
        bt.setAge(34);
        System.out.println(bt.getName() + "---" + bt.getAge());
        bt.eat();
        bt.study();
        bt.sleep();
    }
}
