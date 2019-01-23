package come.Homework;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 20:04
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//                                                用户界面
public class Client {

    public static void YongHu() {
        Scanner sc = new Scanner(System.in);
        //        声明一个数组 用来存储用户信息
        User[] yonghu = new User[10];

//        初始化货架
        ShangPin[] sp = new ShangPin[10];


        System.out.println("欢迎来到我的店铺：解忧杂货店");
        System.out.println("请选择需要的功能：1 登录 2 注册 0 退出系统");

//        头部
//        接收输入的数字
        int function = sc.nextInt();
        while (true) {
//        判断输入的数字
            if (function == 1) {
//            我要在这里做一个登录
                System.out.println("请输入你的登录账号：");
                String username1 = sc.next();
                //        声明一个变量 表示密码
                System.out.println("请输入密码:");
                String password = sc.next();
                Enter.dL(yonghu, username1, password);
                function = 3;

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


                System.out.println("欢迎来到我的店铺：解忧杂货店");
                System.out.println("请选择需要的功能：1 查看商品  0 退出系统");
                int xz = sc.nextInt();
                if (xz == 1) {

                    for (int i = 0; i < sp.length; i++) {

                        come.Homework.PutAway.putaway();
                        System.out.println("请选择功能：1 加入购物车  0 退出系统");
                        int xz1 = sc.nextInt();
                        if (xz1 == 1) {

                            System.out.println("请选择要加入购物车的商品ID：");
//                                    获取用户选择的商品ID





                            int id = sc.nextInt();
                            if (id == sp[i].id) {
                                System.out.println("请选择数量：");
                                int much = sc.nextInt();
                                if (much < sp.length) {
                                    System.out.println("你选择的商品是：" + sp[i].name + "价格是"
                                            + sp[i].price + "数量是：" + much+"共"+(sp[i].price*much)+"元");
                                    System.out.println("请选择功能：1 结算  0 退出系统");
                                }


                            }
                        } else if (xz1 == 0) {
                            System.out.println("系统已安全退出！");
                        }
                    }
                } else if (xz == 0) {
                    System.out.println("程序已安全退出！");
                } else {
                    System.out.println("你输入的有误，请重新输入：");
                    function = 3;
                }
            }
            if (function == 4) {


            }
        }
    }
}
