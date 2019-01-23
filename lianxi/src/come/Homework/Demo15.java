package come.Homework;
//15、	输入数量不确定的正数和负数（一次输入一个），然后打印整数和负数的个数，当输入0时，程序停止
import java.util.Scanner;
public class Demo15 {
        //    主函数
        public static void main(String[] args) {
    /*15、	输入数量不确定的正数和负数（一次输入一个），
    然后打印整数和负数的个数，当输入0时，程序停止*/
//    输入
            Scanner sc=new Scanner(System.in);
//    定义变量x接收正负数
            System.out.println("请输入一个正数或负数!");
            int x=sc.nextInt();
//    定义一个计数器count
            int count=1;
//   先用判断是否为0结束程序,用计数器累加,得用循环重复输入
            if(x!=0){
                while (x!=0){
                    System.out.println("请输入一个正数或负数!");
                    x=sc.nextInt();
                    count++;
                }
            }else{
                System.out.println("输入的数字为0,结束程序!");
            }
            System.out.println("你一共输入了"+count+"个数字");

        }
    }


