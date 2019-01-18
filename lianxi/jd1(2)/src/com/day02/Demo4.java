package com.day02;

/**
 * @作者：AirZhang
 * @日期：2019/1/4
 * @用知识武装头脑
 */
public class Demo4 {
    public static void main(String[] args){
        //循环语句for的样例
        //1+2+3+4+5....+50
        /*int y = 0;
        for(int x = 0;x<=50;x++){
            y = y+x;
            //x = x+1;
        }*/

       // System.out.println("1加到50的和是："+y);

        //请统计1-1000之间同时满足如下条件的数据有多少个：
        //对3整除余2
        //对5整除余3
        //对7整除余2
        int count = 0;
        for(int x = 1;x<=1000;x++){
            if(x%3 == 2){
                if(x%5 == 3){
                    if(x%7 == 2){
                        count++;
                    }
                }
            }
        }

        System.out.println("满足条件的数据有"+count+"个");

    }
}
