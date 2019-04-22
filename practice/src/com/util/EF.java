package com.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class EF {
    public static void main(String[] args) {
        //        声明一个数组
        int arr[] = new int[10];
//        随机给定一组数
        Random a = new Random();
//        给定数组一个范围并输出
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(100);
        }
        System.out.println("一维数组的值为：");

//        通过for循环遍历输出一维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //        对数组中的数字排序
        Arrays.sort(arr);
//        输出排完序的数组
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要查找的数：");
        int count=sc.nextInt();
        int b= binarySearch(arr,count);
        System.out.println("二分查找后的结果："+b);
    }

    public static int binarySearch(int arr[], int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (max + min) / 2;

        while (arr[mid] != value) {
            if (arr[mid] > value) {
                max = mid - 1;
            } else if (arr[mid] < value) {
                min = mid + 1;
            }
            if (min > max) {
                return -1;
            }
            mid = (min + max) / 2;
        }
        return mid;
    }
}
