package come.Demo_dianshang.ShangPin;

public class ShangPin {
    public int id;
    public String name;
    public int price;
    public String jieshao;

    //    创建一个对象的方法
    public static ShangPin sp(int id, String name, int price, String jieshao) {


        ShangPin p = new ShangPin();
        p.id = id;
        p.name = name;
        p.price = price;
        p.jieshao = jieshao;
        return p;
    }
}