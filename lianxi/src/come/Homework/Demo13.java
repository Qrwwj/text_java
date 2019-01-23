package come.Homework;
//13、	由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出
//思路  首先定义这三个数  n1>n2 -->n1    否则n2；
import java.util.Scanner;
public class Demo13 {
    public static void main(String[]args){
       Scanner zy=new Scanner(System.in);
        System.out.println("请输入num1的值：");
       int num1=zy.nextInt();
        System.out.println("请输入num2的值：");
       int num2=zy.nextInt();
        System.out.println("请输入num3的值：");
       int num3=zy.nextInt();
       if (num1>num2){
           if (num1>num3){
               if (num2>num3){
                   System.out.println(num3+","+num2+","+num1);

               }else {
                   System.out.println(+num2+","+num3+","+num1);
               }
           }else {
               System.out.println(num2+","+num1+","+num3);
           }

       }else {
           if (num1>num3){
               System.out.println(num3+","+num1+","+num2);
           }else {
               System.out.println(num3+","+num2+","+num1);
           }
       }
}
}
