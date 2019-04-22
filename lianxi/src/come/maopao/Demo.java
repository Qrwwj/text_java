package come.maopao;

import java.util.Random;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//冒泡排序法
public class Demo {
    public static void main(String[] args) {
//        声明一个数组
        int arr[]=new int[10];
//        随机给定一组数
        Random a=new Random();
//        给定数组一个范围并输出
        for (int i=0;i<arr.length;i++){
         arr[i]=a.nextInt(100);
        }
        System.out.println("一维数组的值为：");

//        通过for循环遍历输出一维数组
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int x=0;x<arr.length-1;x++){
            for (int y=0;y<arr.length-1-x;y++){
                if (arr[y]>arr[y+1]){
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
