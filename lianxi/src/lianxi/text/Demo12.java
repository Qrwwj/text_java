package lianxi.text;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/17 9:58
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//数组查表法(根据键盘录入索引,查找对应星期)
public class Demo12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
//        定义一个数组。用来存储星期
        String xq1[]={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

        System.out.println("请输入一个数字：(0-6)");
        int i=sc.nextInt();
        System.out.println("你输入的数字代表："+xq1[i]);
    }

}
