package come.Demo_dianshang.Homepage;


import java.util.Scanner;

//                                   主界面
public class Homepage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来的解忧杂货店!");
        System.out.println("请选择需要的功能: 1 商家登录 2 用户登录 0 退出系统");
        int xz = sc.nextInt();


        if (xz == 1) {
            come.Demo_dianshang.Administrator.Administrator.GanLi();
        }


//        当选择xz 等于二时  执行这一步  即用户页面


        else if (xz == 2) {
            come.Demo_dianshang.Client.Client.YongHu();

        }


//        当xz==0时 程序运行这一步

        else if (xz == 0) {
            System.out.println("系统已安全退出！");
        }
    }

}
