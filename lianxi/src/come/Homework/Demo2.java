package come.Homework;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[]agrs){
        Scanner zy=new Scanner(System.in);
        System.out.println("你输入的第一个数字是：");
        int a=zy.nextInt();
        System.out.println("你输入的第二个数字是：");
        int b=zy.nextInt();
        if(a%b==0){
            System.out.println("输入的第一个数字是第二个数字的倍数");
        }else{
            System.out.println("输入的第一个数字不是第二个数字的倍数");
        }
    }
}
