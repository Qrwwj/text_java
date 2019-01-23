package come.phone;

/**
 * @Author: wwj
 * @Date: 2019/1/22 19:06
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Phone {

//    声明手机的属性
    String name;
    int price;
    String jieshao;

//    声明构造函数
    public Phone(){}  //无参构造函数

    public Phone(String name,int price,String jieshao){
        this.name=name;
        this.price=price;
        this.jieshao=jieshao;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String getJieshao(){
        return jieshao;
    }
    public void setJieshao(String jieshao){
        this.jieshao=jieshao;
    }

}
