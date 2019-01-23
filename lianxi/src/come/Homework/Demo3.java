package come.Homework;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] ages) {
        Scanner zy = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int y = zy.nextInt();
        System.out.println("请输入一个月份:");
        int m = zy.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(y + "年" + m + "月有31天");
                break;
        }

        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(y + "年" + m + "月有30天");
                break;
            default:
                if (y % 4 == 0 && y % 100 != 0||y%400==0) {

                    if (m >= 1 && m <= 12) {
                        if (m == 2) {


                            System.out.println(y + "年" + m + "月有29天");
                        }
                    }
                }else {
                    System.out.println(y + "年" + m + "月有28天");
                    break;
                            }
                        }

                    }

                }



