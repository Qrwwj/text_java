package lianxi2;

import java.util.Scanner;


public class Z {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("请输入一个运算符号：");
        String fh = sc.next();

        //接收结果的变量
        int num = 0;

        while (true) {
            System.out.println("请输入另一个数字：");
            int y = sc.nextInt();

            if (fh.equals("+")) {
                num = sum(x, y);
            }
            if (fh.equals("-")) {
                num = jian(x, y);
            }
            if (fh.equals("*")) {
                num = cheng(x, y);
            }
            if (fh.equals("/")) {
                num = chu(x, y);
            }

            System.out.println("请输入一个运算符号：");
            String fh2 = sc.next();

            if (fh2.equals("=")) {
                System.out.println("计算的结果是：" + num);
                return;
            }

            //如果不是第一次计算了，已经有一个结果了，这个时候再参与的就是这个结果了
            //这里因为不是第一次了，所以符号也不是第一次的符号了
            if(num != 0){
                x = num;
                fh = fh2;
            }
        }

    }


    //写出计算的方法
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int jian(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int cheng(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int chu(int a, int b) {
        int c = a / b;
        return c;
    }

}
