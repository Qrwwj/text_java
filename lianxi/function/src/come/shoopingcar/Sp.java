package come.shoopingcar;

/**
 * @Author: wwj
 * @Date: 2019/1/22 19:28
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Sp {

//    声明商品的属性

    public String name;
    public int id;
    public int price;
    public String jieshao;

//    声明构造函数 对商品进行初始化赋值

    public  Sp(){}

    public  Sp(String name,int id,int price,String jieshao){
        this.name=name;
        this.id=id;
        this.price=price;
        this.jieshao=jieshao;
    }

    public String getName(){
        return  name;
    }
    public void setName(){
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public void setid(){
        this.id=id;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public String getJieshao(){
        return  jieshao;
    }
    public void setJieshao(){
        this.jieshao=jieshao;
    }
}
