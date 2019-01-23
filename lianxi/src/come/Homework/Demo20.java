package come.Homework;
//20、	某城市出租车计费问题：Ø每日06:00-21:00，起步价6元，当日22:00-次日05:00，
// 起步价7元。Ø起步价包含2公里，超出部分按照每公里1.5元收费。Ø每次乘车加收1元的燃
// 油附加税。输入打车的时间和距离，计算本次打车的费用。
import  java.util.Scanner;
public class Demo20 {
    public static void main(String[] args) {
//   主函数

//       定义起步价pic
            int pic = 6;
//       定义总价sum
            double sum = 0;
//       输入
            Scanner sc = new Scanner(System.in);
            System.out.println("输入打车的时间");
            double time = sc.nextDouble();
            System.out.println("请输入打车距离");
            double distance = sc.nextDouble();
            if (time > 6 && time < 21) {
                sum = pic + (distance - 2) * 1.5 + 1;
            } else {
                sum = pic + 1 + (distance - 2) * 1.5 + 1;
            }
            System.out.println("本次打车费用:" + sum);
        }
    }




