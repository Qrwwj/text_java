package dx.come.demo1.EC.src.MyText.FirstPage;

import java.util.Scanner;
public class FirstPage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=1;
            while (a==1){
                page();
                System.out.println("买水果选1,买手机选2");
                int y=sc.nextInt();
                if (y==1){
                    Emp.goodsList();
                    sum();
                }else {
                    phone.phoneList();

                    System.out.println("是否购买:是:1,否:2");
                    int x=sc.nextInt();
                    if (x==1){
                        sum2();
                        System.out.println("购买成功");
                    }
                }
                System.out.println("请问是否继续购买? 是:1,否:2");
                int x=sc.nextInt();
                if (x!=1){
                    a=2;
                    System.out.println("欢迎下一次光临");
                }
            }

    }
    public static void page(){
        System.out.println("欢迎来到张鑫的小铺");
        System.out.println("小铺货架:");
    }
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择你所买的商品单价");
        int amount=sc.nextInt();
        System.out.println("请选择你所买的商品数量");
        int price=sc.nextInt();
        int he=amount*price;
        System.out.println("总消费为:"+he);
    }
    public static void sum2(){
        System.out.println("请输入买哪款手机?");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
    }

}
