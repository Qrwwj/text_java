package lianxi.text1_17;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/17 10:30
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//输入一个字符 判断这个字符中的大小写字母、数字分别有多少个
//    思路：1.首先你要输入一个字符，用到键盘录入；
//    2.如何获取这个数组呢？ 可以通过数组遍历获取  首先要穿建一个数组，然后再数组中遍历；
//    3.通过数组遍历获取字符中的每一个字符，通过判断语句判断大写isUpperCase，小写isLowerCase，数字isDigit
//    4.然后通过定义不同的变量来记录字符中满足条件的个数
public class Demo1 {
    public static void main(String[]args){
//        定义三个统计变量
        int a=0;
        int b=0;
        int c=0;
//        键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String zifu=sc.nextLine();
//        把字符转换成字符数组
        char[] zifu1=zifu.toCharArray();
//        通过数组遍历获取到每一个字符
        for (int i=0;i<zifu1.length;i++){
            char zf=zifu1[i];
//            判断该字符
            if (Character.isUpperCase(zf)){
                a++;
            }else if (Character.isLowerCase(zf)){
                b++;
            }else if (Character.isDigit(zf)){
                c++;
            }
        }
        System.out.println("大写字母："+a+"个");
        System.out.println("小写字母："+b+"个");
        System.out.println("数字字符："+c+"个");
    }
}
