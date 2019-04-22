package come.demo_lianxi;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class JiaMi_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num=sc.nextInt();
        String num1=Jiami(num);
        System.out.println("加密后的数字为："+num1);
    }

    public  static String Jiami(int num){
        int[]arr=new int[8];

//        定义索引
        int index=0;

//             通过循环语句将数组中的数值逆序输出
        while (num>0){
            arr[index]=num%10;
            index++;
            num/=10;
        }

        for (int j=0;j<index;j++){
            arr[j]+=5;
            arr[j]%=10;
        }
        int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;

//        定义一个空字符串
        String s=" ";
//        通过循环遍历输出数组中的额数值
        for (int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return  s;
    }
}
