package dx.come.demo1.EC.src.MyText.Register;

import java.util.Scanner;

public class register {

    public static void main(String[] args) {

//        首页登录语句
        print_F();
//        输入语句
        int a=change();
//        判断输入的是否几
        if (a==2){
            zhuce();
        }
    }

//    登录输出语句方法
public static void print_F() {
    System.out.println("欢迎来到张鑫的小铺");
    System.out.println("请输入功能编号选择功能");
    System.out.println("1.登录,2.注册");

}
//输入int语句方法
    public static int change(){
        //输入语句
        Scanner sc=new Scanner(System.in);
        int change=sc.nextInt();
        return change;
    }
    //输入String语句方法
    public static String input2(){
        //输入语句
        Scanner sc=new Scanner(System.in);
        String change=sc.next();
        return change;
    }

//    注册功能块
    public static int zhuce(){
        int q=0;
        while ( q==0){
            System.out.println("请输入注册账号");
            String input=input2();
            System.out.println("请输入密码");
            int a=change();
            System.out.println("再输入一次确认密码");
            int b=change();
            //        提前注册好几个账户,需要改进
            String zhuce[]={"aaa","bbb","ccc","abc"};
//        判断账号是否重复
            for (int i=0;i<zhuce.length;i++){
                if (input==zhuce[i]){
                    System.out.println("请重新注册");
                }
            }
//            判断密码是否重复
            if(a!=b){
                System.out.println("请重新注册!");
            }else {
                q=1;
                System.out.println("注册成功");
            }
        }
        return q;
    }
}
