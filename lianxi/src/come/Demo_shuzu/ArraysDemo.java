package come.Demo_shuzu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class ArraysDemo {
    public static void main(String[]args){
//        声明一个数组
        int []arr=new int[10];

//        随机输出一组数字
        Random a=new Random();

//        给定随机数一个范围 并输出

        for (int i=0;i<arr.length;i++){
            arr[i]=a.nextInt(100);
        }

        System.out.println("一维数组的值为：");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

//        对数组中的数字排序
        Arrays.sort(arr);

//        输出排完序的数组

        System.out.println("排序后：");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");


        }
        System.out.println();


//        查找数组中某个数字的下标

//        使用 Arrays.binarySearch()实现数组中值的查找
//        使用 Arrays.binarySearch()之前必须保证数组中的数是有序的


        Scanner sc=new Scanner(System.in);

        System.out.println("请输入你想查找的数字：");

//        接收键盘录入的数字
        int num=sc.nextInt();
//         声明一个变量接收要查找数值在数组中的下标
        int index=Arrays.binarySearch(arr,num);

//        判断数值是否存在
        if (index >= 0) {
            System.out.println("查找的数"+num+"存在，在数组中的下标是："+index);
        }else {
            System.out.println("查找的数"+num+"不存在！");
        }

//        数组复制功能 Arrays.copyof(要复制的数组名，复制的范围)
//        实现数组中元素的全部复制

//        声明一个新的数组接收复制的信息
        int [] arrcopy=Arrays.copyOf(arr,arr.length);
//        将新数组中的元素依次输出
        System.out.println("复制后的一维数组的值为：");
        for (int i=0;i<arrcopy.length;i++){
            System.out.print(arrcopy[i]+" ");
        }
        System.out.println();

//        实现数组前五个元素的复制

//        声明一个数组接收复制的值
        int[] arrcopy1=Arrays.copyOf(arr,5);

//        将数组中的元素依次输出
        System.out.println("复制完的数组值为：");
        for (int i=0;i<arrcopy1.length;i++){
            System.out.print(arrcopy1[i]+" ");
        }
        System.out.println();

//        实现数组第2到第5的元素的复制   Arrays.copyOfRange()

//        声明一个数组接收复制的值

        int [] arrcopy2=Arrays.copyOfRange(arr,1,4);

//        将复制的数值依次输出
        System.out.println("复制完的数组值为：");
        for (int i=0;i<arrcopy2.length;i++){
            System.out.print(arrcopy2[i]+" ");
        }
        System.out.println();


//        数组的比较equals()
//        如果两个数组中相同位置的值相同 那么两个数组相同
//        判断arr与arrcopy是否相等

        boolean flag=Arrays.equals(arr,arrcopy);
        if (flag){
            System.out.println("两个数组相同");
        }else {
            System.out.println("两个数组不相同");
        }


    }

    }

