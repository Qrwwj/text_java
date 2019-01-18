package lianxi5;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/12 15:25
 * @Description: 一步一个脚印
 */

// 注册环节思路：
//    1 首先输入账号密码
//    2 判断账号密码是否存在   应数组来判断
//    3 不存在注册成功；
//4 存在注册失败 返回重新注册或者退出系统
public class ZC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的账号：");
//        接收输入的账号
        String uname = sc.next();
        System.out.println("请输入密码：");
//        接收输入的密码
        String upassword = sc.next();


//        账号密码已经录入完毕  定义一个二维数组将他们存放起来
        String account[][] = new String[10][2];//10 表示存储的人数 2-[0][1] 分别表示账号密码
//        通过for循环遍历判断存储信息 即判断账号是否存在 只要判断账号是否存在就行
//        for (int i = 0; i < account.length; i++) {
////            for(int j=0;j<account.length;j++){ 通过这一步判断密码是否存在
//            if (uname.equals(account[i][0])) {
//                System.out.println("输入的账号已经存在！");
//
////}
//            }
//        }
//
////声明一个变量 判断注册数是否达到阀值
//        boolean flag=false; // flag为false 说明没有达到阀值 接着往下运行
//
////            在输入账号不存在的情况下 注册成功  同时还要满足数组中有位置
//////            通过FOR循环遍历判断是否为空即有位置
//           for (int i=0;i<account.length;i++){
//            if (account[i][0]==null){   //判断数组中账号是否为空  这一步是空
//                account[i][0]=uname;
//                account[i][1]=upassword;
//                System.out.println("注册成功");
//                break;
//            }
//            else if (i<account.length-1&&account[i][0]!=null){  //不为空时 执行这一步
//                flag=true;
//            }
//            }
//            if (flag){ //当flag为true时   执行制一步
////               说明注册数已经达到阀值 注册失败
//                System.out.println("注册人数已经达到上限，感谢您的注册！");
//            }

//        }
        fangfa(uname, upassword, account);
    }

    //    将注册构成抽取为一个注册方法  方便调用 完成某些特定功能的代码块
    public static boolean fangfa(String uname, String upassword, String[][] account) {
        //        通过for循环遍历判断存储信息 即判断账号是否存在 只要判断账号是否存在就行
        for (int i = 0; i < account.length; i++) {
//            for(int j=0;j<account.length;j++){ 通过这一步判断密码是否存在
            if (uname.equals(account[i][0])) {
                System.out.println("输入的账号已经存在！");

//}
            }
        }

//声明一个变量 判断注册数是否达到阀值
        boolean flag = false; // flag为false 说明没有达到阀值 接着往下运行
//        声明一个变量 判断账号是否注册成功  boolean 类型 true注册成功 false注册失败
        boolean flage = false;
//            在输入账号不存在的情况下 注册成功  同时还要满足数组中有位置
////            通过FOR循环遍历判断是否为空即有位置
        for (int i = 0; i < account.length; i++) {
            if (account[i][0] == null) {   //判断数组中账号是否为空  这一步是空
                account[i][0] = uname;
                account[i][1] = upassword;
                System.out.println("注册成功");
                flage=true;
                break;
            } else if (i==account.length - 1 && account[i][0] != null) {  //不为空时 执行这一步
                flag = true;
            }
        }
        if (flag) { //当flag为true时   执行制一步
//               说明注册数已经达到阀值 注册失败
            System.out.println("注册人数已经达到上限，感谢您的注册！");
        }
        return flage;
    }
}
