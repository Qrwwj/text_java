package HomeWork;
import java.util.Scanner;
public class Demo3_2 {
    public static void main(String[]args){
        Scanner zy=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int y=zy.nextInt();
        System.out.println("请输入一个月份：");
        int m=zy.nextInt();
        if(y%4==0&&y%100!=0||y%400==0){
            if (m==2){
                System.out.println(y+"年2月有29天");
            }
            }else if (m==2){
            System.out.println(y+"年2月有28天");
        }
        if (m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            System.out.println(y+"年"+m+"月有31天");
        }else if (m==4||m==6||m==9||m==11){
            System.out.println(y+"年"+m+"月有30天");
        }
        }

    }


