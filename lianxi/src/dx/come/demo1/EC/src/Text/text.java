package dx.come.demo1.EC.src.Text;


import dx.come.demo1.EC.src.Register.Register;

import java.util.Scanner;

/*
 * 这个类是用来测试我的每个模拟功能的
 * */
public class text {
    public static void main(String[] args) {
//        第一步测试注册
//        需要进行初始化的一些东西
//        1.存储用户数据的数组
        String account[][]=new String[3][2];

//        循环一个整页
        while (true){
            System.out.println("欢迎来到张鑫的小铺");
            System.out.println("请输入功能编号选择功能");
            System.out.println("1.登录,2.注册");
//            输入
            Scanner sc=new Scanner(System.in);
//            声明变量来接收输入数据
            int xz=sc.nextInt();

//            登录过程
            if (xz==1){

            }
//            注册的过程
            if (xz==2){
//                接收账户和密码
                System.out.println("请输入注册账户:");
                String uname=sc.next();
                System.out.println("请输入注册密码:");
                String upassworld=sc.next();

//                接收二维数组数据进行判断
                int xz2=1;
                while (xz2==1){
                    boolean flag=Register.regustery(uname,upassworld,account);
//                    如果注册失败,就是用户选择重新注册还是退出程序
                    if (!flag){
                        System.out.println("请选择功能:");
                        System.out.println("1.继续注册,2.退出程序");
//                        接收用户在这里的选择
                        xz2=sc.nextByte();
                        if (xz==2){
                            return;
                        }
                    }else {
                        break;
                    }
                }
            }
        }
    }
}
