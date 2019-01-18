package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:12
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo2 {
    public static  void main(String[]args){
        boolean a=true;
        if (a==false){
            System.out.println("a");
        }else if (!a){
            System.out.println("b");
        }else if (a){
            System.out.println("c");
        }else {
            System.out.println("d");
        }
    }
}
