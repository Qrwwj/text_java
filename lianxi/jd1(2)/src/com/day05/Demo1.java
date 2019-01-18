package com.day05;

/**
 * @作者：AirZhang
 * @日期：2019/1/9
 * @用知识武装头脑
 */

/*
* 1.一个数字
* 2.这个数字乘以9的倍数，直到9的10倍，得出的结果每一位上的数字都相同
* 3.这个数字不是0
*
* 难点：
* 1.怎么判断位数
* 2.没有取值范围
* */
public class Demo1 {
    public static void main(String[] args){

        int x = 1;

        int y = 9;

        String zh = "";


        while (true){
            int count = 0;

            //这个数字乘以9的倍数
            for(int a = 1;a<=10;a++){
                //获取结果
                count = x * y *a;
                //结果转化成字符串，字符串有一个方法,可以判断这个字符串有几个字符
                zh = zh+count;
                //获取位数
                int ws = zh.length();

                //声明位数的变量
                int ge = 0;
                int shi = 0;
                int bai = 0;
                int qian = 0;
                int wan = 0;
                int shiwan = 0;
                int baiwan = 0;


                System.out.println("程序运行到这里了~");

                switch (ws){
                    case 2:
                        ge = count%10;
                        shi = count/10;
                        if(ge == shi){
                            System.out.println(count);
                        }
                        break;
                    case 3:
                        ge = count%10;
                        shi = count/10%10;
                        bai = count/100;
                        if(ge == shi && ge==bai){
                            System.out.println(count);
                        }
                        break;
                    case 4:
                        ge = count%10;
                        shi = count/10%10;
                        bai = count/100%10;
                        qian = count/1000;
                        if(ge == shi  && ge==bai && ge==qian){
                            System.out.println(count);
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                        default:
                            System.out.println("程序运行到这里了~");

                }



            }


            //需要判断一下乘以9之后的结果的位数


            x++;
        }
    }
}
