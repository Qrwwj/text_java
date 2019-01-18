package HomeWork;
//14、	编写Java程序，从键盘输入一个整数保存在月份变量month中，使用switch语句实现判断月份month有几天并输出，不用考虑闰年。
import  java.util.Scanner;
public class Demo14 {
    public static void main(String[]args){
        Scanner zy=new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month=zy.nextInt();
        switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(month+"月有31天");
                    break;


            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月有30天");
                break;

            case 2:
                System.out.println(month+"月有28/29天");
                break;
            default:
                System.out.println("你输入的月份有误");
                break;
        }

    }
}
