package come.jichubiancheng;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


/*
*有一对兔子 从出生的得三个月起每个月都生一对兔子 小兔子长大三个月后每个月又生一对兔子，假如兔子不死  问每个月的兔子对数是多少
* 思路：首先定义一个变量代表兔子的对数
 */
public class D1 {
    public static void main(String [] args){
//        键盘录入

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查询的月份：");
        int count=sc.nextInt();

        System.out.println("第"+count+"个月兔子总数为"+fun(count));
    }
    public static int fun(int count){
        if (count==1||count==2) {
            return 1;
        }else {
            return fun(count-1)+fun(count-2);
        }
    }
}
