package lianxi3;

import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        显示账号密码登录项
        System.out.println("请输入账号：");
//        接收账号
        String name = sc.next();
//        密码输入显示
        System.out.println("请输入密码：");
        String password = sc.next();


//已经将账号密码部分定义好 接下来就是要注册 以及判断账号是否存在 要想达到这一目的 首先是要将注册的账号密码存储在一个数组里
//        定义一个数组
        String a[][] = new String[10][2];
//        已经定义好一个二维数组 接下来是通过遍历数组获取输入的账号密码
//        数组遍历
//        for (int m=0;m<a.length;m++){
////            输入的账号密码可能已经存在 接下来判断所输入的账号密码是否存在
//            if (name.equals(a[10][0])){   //这一步是判断输入的账号与定义的数组中存在的是否冲突
//                System.out.println("所输入的账号已经存在");  //如果输出这一步说明 账号已经存在数组中
//            }
//        }
//        //在这里声明一个变量，来判断网站的注册人数是否达到阀值
//        boolean flag = false;
//
////当输入的数组中没有与输入的账号密码相匹配的 注册成功 返回登录 同样用数组遍历
//for (int m=0;m<a.length;m++){
//            if (a[10][0]==null){   //判断数组中是否还有位置
//                a[10][0]=name;     //账号
//                a[10][1]=password;  //密码
//                System.out.println("注册成功！");
//                break;  //结束注册环节
//            }else if (a[10][0]!=null&&m==a.length-1){ //当数组中没有位置时即 网站注册人数超过阀值
//                flag=true;
//            }
//}
////当数组中没有位置后 需要提醒注册用户
//        if (flag){
//    System.out.println("目前该网站注册人数已满，无法继续注册！");
//        }
//        把整个注册过程抽取成一个注册方法


//方便调用
        zhuce(name, password,a);
    }

    public static boolean zhuce(String name, String password, String[][] a) {
        for (int m = 0; m < a.length; m++) {
//            输入的账号密码可能已经存在 接下来判断所输入的账号密码是否存在
            if (name.equals(a[m][0])) {   //这一步是判断输入的账号与定义的数组中存在的是否冲突
                System.out.println("所输入的账号已经存在");  //如果输出这一步说明 账号已经存在数组中
            }
        }
        //在这里声明一个变量，来判断网站的注册人数是否达到阀值
        boolean flag = false;
        boolean uflag=false;

//当输入的数组中没有与输入的账号密码相匹配的 注册成功 返回登录 同样用数组遍历
        for (int m = 0; m < a.length; m++) {
            if (a[m][0] == null) {   //判断数组中是否还有位置
                a[m][0] = name;     //账号
                a[m][1] = password;  //密码
                System.out.println("注册成功！");
                break;  //结束注册环节
            } else if (a[m][0] != null && m == a.length - 1) { //当数组中没有位置时即 网站注册人数超过阀值
                flag = true;
            }
        }
//当数组中没有位置后 需要提醒注册用户
        if (flag) {
            System.out.println("目前该网站注册人数已满，无法继续注册！");
        }
        return uflag;
    }
}