package xiaopu.src.com.itdr.register;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */

/*
 * 1.输入账号、密码
 * 2.创建账户，这时要验证账户是否存在
 * 3.如果存在，就注册失败
 * 4.如果不存在，就注册成功
 * 5.注册成功的跳转到登录页面（功能）
 *
 *
 * */
public class Register {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);

        //接收注册信息
        String uname = sc.next();
        String upassword = sc.next();

        //怎么把注册好的账户信息存放起来呢？
        //我想到把这些信息放到数组里
        String[][] account = new String[10][2];

        /*//通过循环遍历，拿到数组中的每一个用户的账号和密码，进行判断
        for (int m = 0; m < account.length; m++) {
            //拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账号已存在！");
            }
        }

        //在这里声明一个变量，来判断网站的注册人数是否达到阀值
        boolean flag = false;


        //在没有重复账户的情况下，注册成功
        for (int m = 0; m < account.length; m++) {
            if(account[m][0] == null){
                account[m][0] = uname;
                account[m][1] = upassword;
                System.out.println("账户注册成功！");
                break;

            }else if(m == account.length-1 && account[m][0] != null){
                flag = true;
            }
        }

        //达到阀值的时候，网站就不能再注册新用户了
        if(flag){
            //如果注册的账户数量已经超过了网站的能够支持的数量，就不再注册了
            System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
        }*/

        regustery(uname,upassword,account);

    }


    //把整个注册过程抽取成一个注册方法
    public static boolean regustery(String uname,String upassword,String[][] account ){
        //通过循环遍历，拿到数组中的每一个用户的账号和密码，进行判断
        for (int m = 0; m < account.length; m++) {
            //拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账号已存在！");
            }
        }

        //在这里声明一个变量，来判断网站的注册人数是否达到阀值
        boolean flag = false;

        //声明一个变量，用来确定用户是否注册成功
        boolean uflag = false;

        //在没有重复账户的情况下，注册成功
        for (int m = 0; m < account.length; m++) {
            if(account[m][0] == null){
                account[m][0] = uname;
                account[m][1] = upassword;
                System.out.println("账户注册成功！");
                uflag = true;
                break;

            }else if(m == account.length-1 && account[m][0] != null){
                flag = true;
            }
        }

        //达到阀值的时候，网站就不能再注册新用户了
        if(flag){
            //如果注册的账户数量已经超过了网站的能够支持的数量，就不再注册了
            System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
        }

        return uflag;
    }



}
