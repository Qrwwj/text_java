package lianxi.text;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:30
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从1-7中输入一个数");
        int a = sc.nextInt();
//        if (a == 1) {
//            System.out.println("你输入的数字是：" + a + "今天是星期一");
//        }else if (a==2){
//            System.out.println("你输入的数字是：" + a + "今天是星期二");
//        }else if (a==3){
//            System.out.println("你输入的数字是：" + a + "今天是星期三");
//        }else if (a==4){
//            System.out.println("你输入的数字是：" + a + "今天是星期四");
//        }else if (a==5){
//            System.out.println("你输入的数字是：" + a + "今天是星期五");
//        }else if (a==6){
//            System.out.println("你输入的数字是：" + a + "今天是星期六");
//        }else if (a==7){
//            System.out.println("你输入的数字是：" + a + "今天是星期日");
//        }else {
//            System.out.println("你输入的数字无效");
//        }



//        switch
        switch (a){
            case 1:
                System.out.println("你输入的数字是：" + a + "今天是星期一");
                break;
            case 2:
                System.out.println("你输入的数字是：" + a + "今天是星期二");
                break;
            case 3:
                System.out.println("你输入的数字是：" + a + "今天是星期三");
                break;
            case 4:
                System.out.println("你输入的数字是：" + a + "今天是星期四");
                break;
            case 5:
                System.out.println("你输入的数字是：" + a + "今天是星期五");
                break;
            case 6:
                System.out.println("你输入的数字是：" + a + "今天是星期六");
                break;
            case 7:
                System.out.println("你输入的数字是：" + a + "今天是星期日");
                break;
                default:
                    System.out.println("你输入的数字无效");
        }
    }
}
