package lianxi5;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/11 8:33
 * @Description: 一步一个脚印
 * 昨天的知识掌握了吗
 * 今天你有什么计划吗
 * 看看你身后吧
 * 少年
 * 你就是一个身在狼群的羔羊
 * 等死还是奋起一搏
 * 全看你自己 *
 */
public class Z {
    public static void main(String[] args) {
//        int a = 884800;
//        double b = 0.01;
//        int c = 0;
//        while (b < a) {
//
//            b *= 2;
//            c++;
//        }
//        System.out.println("当第"+c+"次时"+b);
//


        //    键盘录入1-7输出星期

        Scanner sc = new Scanner(System.in);
//    输入一个数字
//        System.out.println("请输入一个数字：");
//        int a = sc.nextInt();
////        switch (a) {
//            case 1:
//                System.out.println("你输入的是星期一");
//                break;
//            case 2:
//                System.out.println("你输入的是星期二");
//                break;
//            case 3:
//                System.out.println("你输入的是星期三");
//                break;
//            case 4:
//                System.out.println("你输入的是星期四");
//                break;
//            case 5:
//                System.out.println("你输入的是星期五");
//                break;
//            case 6:
//                System.out.println("你输入的是星期六");
//                break;
//            case 7:
//                System.out.println("你输入的是星期日");
//                break;
//                default:
//                    System.out.println("你输入的数字有误");


        //        给定一个月份 判断是哪个季节
//            case 3:
//            case 4:
//            case 5:
//                System.out.println (a+"月是春季");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println (a+"月是夏季");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println (a+"月是求秋季");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println (a+"月是冬季");
//                break;
//                default:
//                    System.out.println ("你输入的月份有误!");
//        }

//        for (int x = 1; x <= 10; x++) {
//            if (x % 2 == 0) {
////                System.out.println("Java基础班");
//            }
//            if (x<=7){ System.out.println("Java基础班");}


//99乘法表
//        外行内列
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }
//


//        s输出三角形
//        for (int i = 1; i <= 5; i++) {
////            System.out.print("*");
//
//
//            for (int j = 1; j <= 5; j++) {
//                if(i==1 || i==5 || j ==5)//第一行 第五行
//                    System.out.print("*");
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        ---------------------
//

//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <= 5; j++) {
//                if (i == 1 || i == 3 || i == 5||j==3 ) {
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//        判断101-200之间所有的素数，并记录
//        1 什么是素数？只能被一和本身整除
//        int y = 0;
//        for (int a = 101; a < 200; a++) {
//            boolean x = true;
//            for (int b = 2; b < a; b++) {
//                if (a % b == 0) {
//                    x = false;
//                    break;
//                }
//            }
//            if (x == true) {
//                System.out.println(" " + a);
//                y++;
//            }
//        }
//        System.out.println("101-200之间的素数有" + y + "个");


        System.out.println("输入一个正整数：");
        int a=sc.nextInt();
        int b=2;
        System.out.print(a+"=");
        while (b<=a){
            if (a==b){
                System.out.println(a);
                break;
            }else if (a%b==0){
                System.out.print(b+"*");
                a=a/b;
            }else {
                b++;
            }
        }

//        System.out.println("请输入一个正整数:");
//        int n = sc.nextInt();
//        int k=2;
//        System.out.print(n+"=");//输出第一步格式
//        while(k<=n){//初值k为2,n为输入的数字,在程序执行的过程中k渐渐变大(k++),n渐渐变小(n/k)
//            if(k==n){//当n和k相等的时候,就直接输出n的值(此时输出k也行,因为n==k)
//                System.out.println(n);
//                break;
//            } else if(n%k==0){
//                System.out.print(k+"*");//如果n <> k，但n能被k整除，则应打印出k的值
//                n = n/k;//n除以k的商,作为新的正整数你n
//            }else{
//                k++;//如果n不能被k整除，则用k+1作为k的值
//            }
//        }
    }
}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个正整数:");
//        int n = sc.nextInt();
//        int k=2;
//        System.out.print(n+"=");//输出第一步格式
//        while(k<=n){//初值k为2,n为输入的数字,在程序执行的过程中k渐渐变大(k++),n渐渐变小(n/k)
//            if(k==n){//当n和k相等的时候,就直接输出n的值(此时输出k也行,因为n==k)
//                System.out.println(n);
//                break;
//            } else if(n%k==0){
//                System.out.print(k+"*");//如果n <> k，但n能被k整除，则应打印出k的值
//                n = n/k;//n除以k的商,作为新的正整数你n
//            }else{
//                k++;//如果n不能被k整除，则用k+1作为k的值
//            }
//        }
//