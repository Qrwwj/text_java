package come.Homework;
//16、	编写程序，设计一个图形面积计算，选择不同的图形输入数字计算面积，选择4退出程序。
import  java.util.Scanner;
public class Demo16 {
    public static  void main(String[]args){
        Scanner zy=new Scanner(System.in);
        System.out.println("规则图形（正方形/长方形/平行四边形）请输入1,梯形请输入2,圆形请输入3,退出请输入4");
        int G =zy.nextInt();
        if (G==1){
            System.out.println("请输入图形的长：");
            int a=zy.nextInt();
            System.out.println("请输入图形的宽（高）：");
            int b=zy.nextInt();
            System.out.println("图形面积为："+a*b);

        }else if (G==2){
            System.out.println("请输入图形的上底：");
            int a=zy.nextInt();
            System.out.println("请输入图形的高：");
            int h=zy.nextInt();
            System.out.println("请输入图形的下底：");
            int b=zy.nextInt();
            int S=(a+b)*h;
            System.out.println("图形面积为："+S);
        }else if (G==3){
            System.out.println("请输入图形的半径：");
            int r=zy.nextInt();
            double S=3.14*r*r;
        }else if (G==4){
            System.out.println();
        }else {
            System.out.println("你的输入有误");
        }
    }
}
