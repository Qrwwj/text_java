package come.Demo_dianshang.Administrator;


import come.Demo_dianshang.Enter.Enter;
import come.Demo_dianshang.Register.Register;
import come.Demo_dianshang.ShangPin.ShangPin;
import come.Demo_dianshang.User.User;

import java.util.Scanner;

//商家界面
public class Administrator {


    public static void GanLi() {
        Scanner sc = new Scanner(System.in);


        User[] yonghu = new User[10];

        //        初始化货架
        ShangPin[] sp = new ShangPin[10];
        System.out.println("欢迎来到我的店铺：解忧杂货店");

        System.out.println("请选择需要的功能：1 登录 2 注册  0 返回店铺页面");

        //        头部
//        接收输入的数字
        int function = sc.nextInt();
        int time = 0;
        while (time < sp.length) {
//        判断输入的数字
            if (function == 1) {
//            我要在这里做一个登录
                System.out.println("请输入你的登录账号：");
                String username1 = sc.next();
                //        声明一个变量 表示密码
                System.out.println("请输入密码:");
                String password = sc.next();
                Enter.dL(yonghu, username1, password);
                System.out.println("请选择功能：1 录入商品  0 返回店铺页面");
                int xz1 = sc.nextInt();

                if (xz1 == 1) {
                    function = 3;
                } else if (xz1 == 0) {
                    function=0;
                }

            }

            if (function == 2) {
//          这里写注册
                System.out.println("请输入要注册的账号：");
                String name = sc.next();
                System.out.println("请输入密码：");
                String password = sc.next();
                System.out.println("请输入邮箱：");
                String newEmail = sc.next();
                System.out.println("请输入电话：");
                String newPhone = sc.next();
                Register.zc(yonghu, name, password, newEmail, newPhone);
                function = 1;
            }
            if (function == 3) {

                //        通过循环遍历获取商品 并上架
                for (int i = 0; i < sp.length; i++) {
                    System.out.println("请输入商品号：");
                    int id = sc.nextInt();
                    System.out.println("请输入商品名字：");
                    String name = sc.next();
                    System.out.println("请输入商品价格：");
                    int price = sc.nextInt();
                    System.out.println("请输入商品介绍：");
                    String jieshao = sc.next();
                    ShangPin p = ShangPin.sp(id, name, price, jieshao);

//            上架商品
                    sp[i] = p;
                    time++;
                }
                if (time == sp.length) {
                    System.out.println("商品录入完毕，请选择功能：1 查看商品 0 返回店铺页面");

                    int xz3 = sc.nextInt();
                    if (xz3 == 1) {
                        function = 4;
                    } else if (xz3 == 0) {
                        function=0;
                    }
                }

            }


            if (function == 4) {


                for (int i = 0; i < sp.length; i++) {
                    System.out.print("商品ID：" + sp[i].id);
                    System.out.print("商品名称：" + sp[i].name);
                    System.out.print("商品价格：" + sp[i].price);
                    System.out.print("商品介绍：" + sp[i].jieshao);
                    System.out.println("请选择功能：1 继续录入 2 返回店铺页面");
                    int xz4=sc.nextInt();
                    if (xz4==1){
                        function=3;
                    }else if (xz4==0){
                        function=0;
                    }
                }
            }
            if (function==0){
                System.out.println("管理系统已安全退出！即将进入店铺页面......");
                System.out.println("欢迎来的解忧杂货店!");
                System.out.println("请选择需要的功能: 1 商家登录 2 用户登录 0 退出系统");
                int xz5=sc.nextInt();
                if (xz5==1){
                    come.Demo_dianshang.Administrator.Administrator.GanLi();
                    break;
                }
                if (xz5==2){
                    come.Demo_dianshang.Client.Client.YongHu();
                    break;
                }
                if (xz5==0){
                    System.out.println("程序已安全退出！");
                    break;
                }
            }
        }
    }
}
