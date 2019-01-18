package com.day04;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */
public class Demo5 {
    public static void main(String[] args){
        //二维数组的演示：
        int[][] a = new int[5][3];

        int[] x = a[0];

        //参数传递的问题
        //小红生病了，需要到医院看病，她准备出门的时候有几种选择，
        //开车、骑自行车、走路、打车，每种交通工具的价格，根据路程的距离来计算费用
        //小红家到医院的距离是10KM，她很难受，所以选择打车，出租车的价格是5元/KM
        //第一个问题：小红从家到医院打车需要多少钱？

        //声明两地之间的距离，以及出租车的单价
        int juli = 10;
        int dj = 5;

        //去医院花费的费用
        int d1 = fare(juli,dj);

        //小红到医院里，医生给她开了很多药，这些药有不同的价格
        //小红要交钱开药，然后回家
        //请问：小红需要花多少钱买药

        //声明一个数组来把小红开的药的价格放进去
        int[] med = {10,40,8,2};
        //声明一个数组，每个价格的药开几盒
        int[] medj = {1,2,10,2};

        //调用计算药费的方法
        int num = medFare(med,medj);
        System.out.println("一共花费的药费是："+num);

        //输出药价的数组，看看价格到底是多少~
        for (int n = 0; n<med.length;n++){
            System.out.println(med[n]);
        }
    }

    //计算车费的方法
    public static int fare(int x, int y){
        //计算花费的价格
        //每次打车可以用一个单价优惠券，单价便宜2元；

        int sum = x*(y-2);
        return sum;
    }


    //计算药费的方法
    public static int medFare(int[] x,int[] y){
        //计算一下花费的药费
        //如果买的药超过5盒，药的单价就可以减去3元
        //小红认识医院里的人，所以她实际拿的药的单价，跟标示的不一样，而是每种都便宜2元钱

        for(int n = 0;n<x.length;n++){
            x[n] = x[n] - 2;
        }

        int num = 0;
        for(int m = 0;m<x.length;m++){
            num += x[m]*y[m];
        }
        return num;
    }


}
