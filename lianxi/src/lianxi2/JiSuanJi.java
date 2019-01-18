package lianxi2;

import java.util.Scanner;

public class JiSuanJi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //思路；1 输入一个数字
//        2 输入符号 +-*/
//        3 输入数字
//        输入符号=或者+-*/


//        输入数字
        System.out.println("输入一个数字：");
        //接收输入的数字
        int a = sc.nextInt();
        //输入符号
        System.out.println("输入一个符号：");
//        接收输入的符号
        String fh = sc.next();
//接收结果的变量
        int jieguo = 0;
//        输入另一个数字
        while (true) {
            System.out.println("输入一个数字");
            int b = sc.nextInt();


            if (fh.equals("+")) {
                jieguo = jia(a, b);
            }
            if (fh.equals("-")) {
                jieguo = jian(a, b);
            }
            if (fh.equals("*")) {
                jieguo = cheng(a, b);
            }
            if (fh.equals("/")) {
                jieguo = chu(a, b);
            }
//        定义另一个符号
            System.out.println("请输入一个符号：");
//        接收这一个符号
            String fh1 = sc.next();
            if (fh1.equals("=")) {
//            输出结果
                System.out.println("最后的结果是：" + jieguo);
                return;
            }
            if (jieguo!=0){
                a = jieguo;
                fh = fh1;
            }
        }
    }

    public static int jia(int x, int y) {
        int z = x + y;
        return z;
    }

    public static int jian(int x, int y) {
        int z = x - y;
        return z;
    }

    public static int cheng(int x, int y) {
        int z = x * y;
        return z;
    }

    public static int chu(int x, int y) {
        int z = x / y;
        return z;
    }
}
