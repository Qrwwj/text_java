package come.Demo_XiTi;

import java.util.HashSet;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

/*判断101-200之间有多少个素数，并输出所有素数。*/
public class Demo1 {
    public static void main(String[] args) {
        //调用获取素数的方法
        getPrimeNumberMethod();
    }

    public static void getPrimeNumberMethod() {
        // 定义变量
        int i, j;
        int count = 0;
        // 创建不重复的集合HashSet:boolean add(E e)
        HashSet<Integer> hs = new HashSet<Integer>();
        // 循环:101~200
        for (i = 101; i <= 200; i++) {
            // 从2开始到该数的前一个数值
            for (j = 2; j < i; j++) {
                // 如果有一次则打断循环
                if (i % j == 0)
                    break;
            }
            if (j >= i) {
                count++;
                System.out.println("素数为:"+i);
            }
        }
        System.out.println("101-200之间有"+count+"个素数");
    }

}
