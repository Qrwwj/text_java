package dx.come.demo1.EC.src.Register;

import java.util.Scanner;

public class Register {
    /*
     * 1.输入账号、密码
     * 2.创建账户，这时要验证账户是否存在
     * 3.如果存在，就注册失败
     * 4.如果不存在，就注册成功
     * 5.注册成功的跳转到登录页面（功能）
     * */

    public static void main(String[] args) {
//        接收注册信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号");
        String uname=sc.next();
        System.out.println("请输入密码");
        String upassworld=sc.next();

//        把注册信息放在二维数组里-1.定义一个二维数组
        String account[][]=new String[10][2];

//        调用注册方法
        regustery(uname,upassworld,account);

    }
//    定义一个方法来注册信息
    public static boolean regustery(String uname,String upassworld,String accound[][]) {
//       通过循环遍历,拿到数组中的每一个用户的账号密码,进行判断
//        循环二维数组行数
        int m=0;
        for ( m=0;m<accound.length;m++){
//            拿出数组中的账户,进行比较
            if (uname.equals(accound[m][0])) {
                System.out.println("注册账号已存在!");
            }

        }
//        在这里声明一个变量,来判断网站注册人数是否达到了阀值
        boolean flag=false;
//        声明一个变量,用来确定用户是否注册成功
        boolean uflag=false;
//        在没有重复账户的情况下,注册成功


        for ( m=0;m<accound.length;m++){
            if (accound[m][0]==null){
                accound[m][0]=uname;
                accound[m][1]=upassworld;
                System.out.println("账户注册成功!");
                uflag=true;
                break;
            }else if(m==accound.length-1&&accound[m][0]!=null){
                flag=true;
            }
        }
        if (flag){
            System.out.println("注册账户已经超过网站负载量,无法注册新账户了!");
        }
    return uflag;
}
}
