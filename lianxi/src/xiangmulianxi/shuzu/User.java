//package xiangmulianxi;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * @Author: wwj
// * @Date: 2019/1/19 13:17
// * @Description: 真的很累吗?累就对了,舒服是留给死人的!
// */
//
//
////这个类用来模拟登录环节
////    思路：1 用户输入账号密码   通过键盘录入
////            2判断账号密码是否存在   存在登录成功 不存在登录失败
////                3登录失败 给定三次机会  机会超过锁定
//public class User {
//
//    //    首先确定主方法
//    public static void main(String[] args) {
////        模拟数据库 存储用户信息
//        String name = "zhansan";
//        String password = "1234asd";
//
////        通过for循环判断次数
//        for (int cishu = 0; cishu < 3; cishu++) {
//            Scanner sc = new Scanner(System.in);
////        键盘录入环节
//            System.out.println("请输入账号：");
////        接收账号
//            String username = sc.next();
//
//            System.out.println("请输入密码：");
////        接收密码
//            String userpassword = sc.next();
//
////        判断输入的账号密码
//            if (username.equals(name) || userpassword.equals(password)) {
//
//                System.out.println("登录成功");
//
////                模拟程序跳转
//
//                GuessNumberGame.start();
//
//                break;
//            } else {
//
//                if ((2-cishu)==0){
//                    System.out.println("账号或密码输入次数过多，请稍后再试！");
//                }else {
//                    System.out.println("您输入的账号或密码有误,还剩" + (2 - cishu) + "次机会");
//                }
//            }
//        }
//    }
//
//}
