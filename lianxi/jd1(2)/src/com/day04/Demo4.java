package com.day04;

import java.util.Scanner;

/**
 * @作者：AirZhang
 * @日期：2019/1/8
 * @用知识武装头脑
 */

/*
 * 有一天，小杰同学很无聊，想跟小春同学玩脑筋急转弯比赛，但是他们又不想玩的很单调，最近他俩学习了java，
 * 所以他们就想，能不能用现在学习的知识，做一个脑筋急转弯问答器呢？说干就干~
 *
 * 1.需要存储很多个问题
 * 2.每个问题都对应一个答案
 * 3.答对的人增加一个积分，可以选择继续答题，或者是换另一个人答题
 * 4.答错的人不增加积分，不可以继续答题，换另一个人答题
 * 5.这个小程序需要两个人一起玩
 *
 * 升级版：
 * 1.把这个游戏升级成可以让10个人轮流玩的
 * 2.游戏有查看排行榜的功能
 *
 * */
public class Demo4 {
    public static void main(String[] args) {
        //1.创建用户的过程，这里简化成创建两个用户名不同的人
        //通过键盘录入的方式，录入两个选手
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个用户的名称：");
        int name1 = sc.nextInt();

        System.out.println("请输入第二个用户的名称：");
        int name2 = sc.nextInt();

        System.out.println("是否开始游戏？请输入：1是或者0否");
        int star = sc.nextInt();

        //定义问题数组
        String[] question = new String[10];
        question[0] = "什么字在字典里找不到？";
        question[1] = "孙悟空降妖无数，什么妖他没降服过？";
        question[2] = "明明一天没有吃东西，为什么我不觉得饿？";
        question[3] = "5根木头能造出来最大的东西是什么?";

        //定义答案数组
        String[] answer = new String[10];
        answer[0] = "错别字";
        answer[1] = "人妖";
        answer[2] = "因为我不是明明";
        answer[3] = "森林";

        //声明一个存储用户积分的数组
        int[] jf = new int[10];


        //开始游戏，用户无论如何都要玩一把
        //在这里声明一个变量接收用户的昵称
        int yh = name1;

        //当总游戏次数超过10次时，结束游戏
        int count = 0;


        while (count <10) {
            if (star == 1) {
                //这里可以声明一个变量，用来控制游戏是否继续
                int cou = 1;
                while (cou == 1) {
                    System.out.println("脑筋大战游戏开始！");
                    System.out.println("请确认你的身份！你的游戏昵称是：" + yh);
                    System.out.println("请在0~9中选择一个数字对应的问题作答：");
                    //用户选择一个问题

                    int xz = sc.nextInt();
                    System.out.println("请回答你选择的问题：" + question[xz]);

                    //用户回复一个答案
                    String n1anwser1 = sc.next();
                    if (n1anwser1.equals(answer[xz])) {
                        System.out.println("恭喜你回答正确！增加一个积分！");

                        //增加一个积分,通过用户名来确定是第几个用户
                        if (yh == name1) {
                            jf[0] = jf[0] + 1;
                            System.out.println("当前积分："+jf[0]);
                        } else {
                            jf[1] = jf[1] + 1;
                            System.out.println("当前积分："+jf[1]);
                        }


                        //选择继续答题或者是换另一个用户
                        System.out.println("是否继续答题？请输入：1是或者0否");
                        cou = sc.nextInt();

                        //如果用户继续游戏，就从选择题目处开始循环
                        if (cou == 0) {
                            System.out.println("游戏昵称是：" + yh + "的用户答题结束");

                            //如果是第二个用户在这里不玩了，就要换成第一个
                            if (yh == name2) {
                                yh = name1;
                            }
                            //如果是第一个用户在这里不玩了，就要换成第二个
                            yh = name2;
                        }
                    } else {
                        System.out.println("回答错误！换下一个选手答题！");
                        //如果是第二个用户在这里不玩了，就要换成第一个
                        if (yh == name2) {
                            yh = name1;
                        }
                        //如果是第一个用户在这里不玩了，就要换成第二个
                        yh = name2;
                    }
                    //记录游戏次数
                    count++;
                }
            } else {
                System.out.println("真的不要玩吗？玩一会吧~");
                star = 1;
            }
        }
        System.out.println("脑筋大战游戏结束！");
        System.out.println("玩家"+name1+"的积分是："+jf[0]);
        System.out.println("玩家"+name2+"的积分是："+jf[1]);
        if(jf[0] > jf[1]){
            System.out.println("本次游戏的获胜者是："+name1);
        }else if(jf[0] == jf[1]){
            System.out.println("本次游戏打平");
        }else{
            System.out.println("本次游戏的获胜者是："+name2);
        }
    }
}
