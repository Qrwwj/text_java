package dx.come.demo1.EC.src.MyText.FirstPage;

public class Emp {
    String name;
    int price;

    //    商品单
    public static void goodsList(){
        Emp e=new Emp();//创建了一个Emp对象e
        Emp f=new Emp();
        Emp g=new Emp();
        e.name="苹果";
        e.price=1;
        f.name="香蕉";
        f.price=2;
        g.name="橘子";
        g.price=3;
        goodsRack(e);
        goodsRack(f);
        goodsRack(g);
    }
    //    货架方法
    public static void goodsRack(Emp e){
        System.out.print("商品名:"+e.name+"  ");
        System.out.println("单价:"+e.price);
    }


}
