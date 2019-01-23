package come.Homework;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:13
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//                                   主界面
public class Homepage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来的解忧杂货店!");
        System.out.println("请选择需要的功能: 1 商家登录 2 用户登录 0 退出系统");
        int xz = sc.nextInt();


        if (xz == 1) {
            come.Homework.Administrator.GanLi();
        }


//        当选择xz 等于二时  执行这一步  即用户页面


        else if (xz == 2) {
            come.Homework.Client.YongHu();

        }


//        当xz==0时 程序运行这一步

        else if (xz == 0) {
            System.out.println("系统已安全退出！");
        }
    }

}