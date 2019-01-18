package lianxi.text;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:18
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个成绩：");
        int a = sc.nextInt();
        if (a >= 90 && a <=100) {
            System.out.println("你输入的成绩是：" + a + "为优");
        } else if (a >= 80 && a < 90) {
            System.out.println("你输入的成绩是：" + a + "为良");
        } else if (a >= 70 && a < 80) {
            System.out.println("你输入的成绩是：" + a + "为可");
        } else if (a >= 60 && a < 70) {
            System.out.println("你输入的成绩是：" + a + "为及格");
        } else if (a >= 0 && a < 60) {
            System.out.println("你输入的成绩是：" + a + "为不及格");
        } else {
            System.out.println("你输入的成绩无效");
        }
    }
}
