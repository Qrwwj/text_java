package come.phone;

/**
 * @Author: wwj
 * @Date: 2019/1/22 19:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Text {
    public static void main(String[] args) {
//        利用多态创建手机类的对象

        Phone p1 = new Phone();
        p1.setName("三星");
        p1.setPrice(3998);
        p1.setJieshao("我会炸");
        System.out.println(p1.getName() + "---" + p1.getJieshao() + "仅需" + p1.getPrice());


    }
}
