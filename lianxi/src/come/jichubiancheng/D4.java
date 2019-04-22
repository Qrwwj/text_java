package come.jichubiancheng;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//将一个正整数分解质因数
public class D4 {
    public static void main(String[] args) {
//        键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想分解的数字：");
        int sum = sc.nextInt();
        decompose(sum);

    }

    //    声明一个将整数分解为质因数的方法
    public static void decompose(int n) {
        System.out.print(n + "=");
        for (int i = 2; i < n + 1; i++) {
            while (n % i == 0 && n != i) {
                n /= i;
                System.out.print(i + "*");
            }
            if (n == i) {
                System.out.println(i);
                break;
            }
        }
    }
}
