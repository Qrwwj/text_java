package HomeWork;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[]args){
        Scanner zy=new Scanner(System.in);
        System.out.println("请输入你想输入的年份：");
        int x=zy.nextInt();
       if (x%4==0&&x%400==0){
           System.out.println("你输入的年份是闰年");
       }else{
           System.out.println("你输入的年份是平年");
       }
    }
}
