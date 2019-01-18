package lianxi5;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/11 16:28
 * @Description: 一步一个脚印
 */
public class YouXi {
    public static void main(String[] args) {
//        键盘录入
        Scanner sc = new Scanner(System.in);
//        请输入一个用户名
        System.out.println("请输入第一个用户名：");
        String name1 = sc.next();
        System.out.println("请输入第二个用户名：");
        String name2 = sc.next();
        System.out.println("是否开始游戏？0 否 1 是");
        int star = sc.nextInt();
//         声明问题数组
        String wt[] = new String[10];
        wt[0] = "丹丹是小狗的名字还是小老虎的名字?";
        wt[1] = "什么牌子的汽车最讨厌别人摸?";
        wt[2] = "鸡的妈妈是谁?";
        wt[3] = "天的孩子叫什么?";
        wt[4] = "哪种动物最没有方向感?";


//        声明一个答案数组
        String answer[] = new String[10];
        answer[0] = "小老虎";
        answer[1] = "宝马BMW";
        answer[2] = "纸";
        answer[3] = "我材";
        answer[4] = "麋鹿";

//        声明一个积分数组
        int jf[] = new int[10];


//        声明一个用户
        String yh = name1;

        int cs = 0;

        while (cs <= 10) {

            if (star == 1) {
                int cou = 1;
                while (cou == 1) {
                    System.out.println("游戏开始，你的游戏名是：" + yh + " 请从1-10中选择一个数字：");
                    int xz = sc.nextInt();
                    System.out.println("你选择的数字对应的问题是:" + wt[xz] + "请输入答案：");
//                输入回答的答案
                    String uanswer = sc.next();
                    if (uanswer.equals(answer[xz])) {

//                    积分情况
//                        如何区分是哪个用户的积分？ 判断语句
                        if (yh.equals(name1)) {
                            jf[0] = jf[0] + 1;
                            System.out.println("恭喜你，回答正确 你当前积分" + jf[0]);
                        } else if (yh.equals(name2)) {
                            jf[1] = jf[1] + 1;
                            System.out.println("恭喜你，回答正确 你当前积分" + jf[1]);
                        }

//                    问题回答完后可以继续答题也可以换一个人答题
                        System.out.println("是否继续答题？ 0 否 1 是");
                        cou = sc.nextInt();
                        if (cou == 0) {
                            System.out.println("用户" + yh + "游戏结束");
//                            判断第一个用户不玩了换成第一个
                            if (yh.equals(name2)) {
                                yh = name1;
                            } else {
//                                判断第二个用户不完了换第一个
                                yh = name2;
                            }
                        }

                    } else {
//                    问题回答错误
                        System.out.println("回答错误，换下一个玩家答题");
                        if (yh.equals(name2)) {
                            yh = name1;
                        } else {
//                                判断第二个用户不完了换第一个
                            yh = name2;
                        }
                    }

                }
            } else {
                System.out.println("这是一个智力游戏，值的你拥有！");
                star = 1;
            }
            cs++;
        }
System.out.println("游戏结束");
        System.out.println("玩家"+name1+"的积分是："+jf[0]);
        System.out.println("玩家"+name2+"的积分是："+jf[1]);
        if (jf[0]>jf[1]){
            System.out.println("玩家"+name1+"获胜");
        }else if (jf[0]==jf[1]){
            System.out.println("平局");
        }else {
            System.out.println("玩家"+name2+"获胜");
        }
    }
}
