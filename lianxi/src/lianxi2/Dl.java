package lianxi2;
//登录 账号密码
//思路：1 分别定义一个账号和密码
//2 接收账号密码 并判断是否正确；
// 3 账号密码都正确显示登录成功；
//4 账号密码输入有误，请重新输入 并记录登陆次数
//5 限制登录次数 超过以后 退出系统

import java.util.Scanner;


public class Dl {
    public static void main(String[] agrs) {
//        分别定义账号密码
        Scanner sc = new Scanner(System.in);
        int count = 0;
        wk:
        while (true) {
            while (count < 3) {
                System.out.println("请输入账号：");
                String zhanghao = sc.next();
                System.out.println("请输入密码");
                int password = sc.nextInt();
                //接收输入的账号
                String uzhanghao = "zhanghao11";
                //接收输入的密码
                int upassword = 123456;
                if (zhanghao.equals(uzhanghao) && password == upassword) {

                    System.out.println("来了，老弟");
                    break wk;
                } else {
                    System.out.println("你输入的账号或密码有误，请从新输入");
                    count++;
                }
            }

            if (count==3){
                System.out.println("输入次数过多，等死吧！");
                while (count!=0){
                    //密码输入次数过多，回答问题 重置
                    //定义一个问题
                    System.out.println("回答下列问题，重新输入账号密码");
                    //声明一个问题
                    System.out.println("自己的账号密码不记得了，是不是傻？");
                    String wenti=sc.next();
                    //接收问题 并设置答案
                    String anwenti="你可真是个小机灵鬼";
                    if (wenti.equals(anwenti)){
                        count=0;
                    }else {
                        System.out.println("脑子是个好东西，希望你也有...");
                    }
                }
            }
        }


    }

}

