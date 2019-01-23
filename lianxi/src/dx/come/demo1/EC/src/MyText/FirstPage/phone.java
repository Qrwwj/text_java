package dx.come.demo1.EC.src.MyText.FirstPage;

public class phone {
    String name;
    int price;
//    调用Emp中的goodsList方法
public static void main(String[] args) {

    phoneList();
}
//    打电话方法
    public  static void phoneList() {

        phone pho1=new phone();
        phone pho2=new phone();
        phone pho3=new phone();
        pho1.name="华为";
        pho1.price=3000;
        pho2.name="苹果";
        pho2.price=5000;
        pho3.name="小米";
        pho3.price=2000;
        phoneRack(pho1);
        phoneRack(pho2);
        phoneRack(pho3);
    }
//    发短信的方法
    public void note(){}
    //    货架方法
    public static void phoneRack(phone e){
    System.out.print("商品名:"+e.name+"  ");
    System.out.println("单价:"+e.price);
}
}

