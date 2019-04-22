package come.jichubiancheng;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


public class D5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的成绩：");
        int sum = sc.nextInt();
        chengji(sum);
    }

    //    声明判断成绩 的方法
    public static void chengji(int n) {
        if (n > 100 || n < 0) {
            System.out.println("输入的成绩无效");
        } else if (n >= 90) {
            System.out.println("你输入的成绩：" + n + "等级为：A");
        }
        if (n >= 60) {
            System.out.println("你输入的成绩：" + n + "等级为：B");
        }
        if (n < 60) {
            System.out.println("你输入的成绩：" + n + "等级为：C");
        }
    }
}
