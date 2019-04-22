package com;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//有一对兔子 从出生后的3个月其都生一对兔子 ....
public class TuZi {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想知道的兔子数量的月份：");

        int yuefen=sc.nextInt();
        System.out.println("第"+yuefen+"个月兔子的总量为："+fun(yuefen));

    }


//    求得所需月份的兔子数量  返回值喂兔子的数量
    private  static  int fun (int yuefen){
        if (yuefen==1|| yuefen==2){
            return 1;
        }else {
            return  fun(yuefen-1)+fun(yuefen-2);
        }
    }

}
