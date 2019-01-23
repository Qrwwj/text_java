package come.Homework;

/**
 * @Author: wwj
 * @Date: 2019/1/19 16:02
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class PutAway {
public static void putaway (){
//    创建一个商品
    ShangPin p1=new ShangPin();
    p1.id=01;
    p1.name="肥仔快乐水";
    p1.price=99;
    p1.jieshao="我们不是快乐的制造者，我们是快乐的搬运工,不要998只要99，你只得拥有！";


    System.out.println("商品ID："+p1.id);
    System.out.println("商品名称："+p1.name);
    System.out.println("商品价格："+p1.price);
    System.out.println("商品介绍："+p1.jieshao);

    ShangPin p2=ShangPin.sp(02,"杂志",66,"俯瞰世界之大，畅游知识海洋");
    System.out.println("商品ID："+p2.id);
    System.out.println("商品名称："+p2.name);
    System.out.println("商品价格："+p2.price);
    System.out.println("商品介绍："+p2.jieshao);


    ShangPin p3=ShangPin.sp(3,"瓜",66,"你看我这瓜，它又大又圆");
    System.out.println("商品ID："+p3.id);
    System.out.println("商品名称："+p3.name);
    System.out.println("商品价格："+p3.price);
    System.out.println("商品介绍："+p3.jieshao);
}
}
