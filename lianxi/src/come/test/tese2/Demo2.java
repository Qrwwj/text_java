package come.test.tese2;

import java.util.Random;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a +" "+"b:" + b);   // a 10 b 20

//        调用方法
        change(10,20);
        System.out.println("a:" + a +" "+"b:" + b);  // a 10 b 20

//        声明一个数组
        int arr[]=new int[10];

//        随机给定一组数
        Random x=new Random();

//        通过for循环给随机数设定范围
        for (int i=0;i<arr.length;i++){
            arr[i]=x.nextInt(100);
        }
        System.out.println("一维数组为：");

//        通过for循环遍历输出一维数组中的数据
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");

        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int a, int b) {
        System.out.println("a:" + a +" "+"b:" + b);  // a 10 b 20
        a = b;  //a 20
        b = a + b; //b 40
        System.out.println("a:" + a +" "+"b:" + b);  //a 20 b 40
    }

    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 ==0) {
                arr[i] *= i;
            }
        }
    }

}
