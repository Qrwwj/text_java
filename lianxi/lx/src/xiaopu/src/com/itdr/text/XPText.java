package xiaopu.src.com.itdr.text;

import xiaopu.src.com.itdr.register.Register;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */

/*
 * 这个类是用来测试我的每个模拟功能的
 * */
public class XPText {
    public static void main(String[] args) {
        //需要进行初始化的一些东西
        //1.存储用户数据的数组
        String[][] account = new String[3][2];


        while (true) {
            System.out.println("欢迎来到浅夏时光杂货铺");
            System.out.println("请输入功能编号选择功能：");
            System.out.println("1.登录");
            System.out.println("2.注册");

            Scanner sc = new Scanner(System.in);
            int xz = sc.nextInt();

            //登录的过程
            if (xz == 1) {

            }

            //注册的过程
            if (xz == 2) {
                //接收账户和密码
                System.out.println("请输入注册账户：");
                String uname = sc.next();
                System.out.println("请输入注册密码：");
                String upassword = sc.next();

                int xz2 = 1;
                while (xz2 == 1) {
                    boolean flag = Register.regustery(uname, upassword, account);
                    //如果注册失败，就让用户选择重新注册还是退出程序
                    if (!flag) {
                        System.out.println("请选择功能：");
                        System.out.println("1.继续注册");
                        System.out.println("2.退出程序");
                        //接收用户在这里的选择
                        xz2 = sc.nextInt();
                        if(xz2 == 2){
                            return;
                        }
                    }else{
                        break;
                    }
                }
            }

        }

    }
}
