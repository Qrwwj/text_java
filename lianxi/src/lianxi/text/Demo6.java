package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:37
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//求水仙花数
public class Demo6 {
    public static void main(String[] args) {

        int sum = 0;
        for (int a = 2; a <=1000; a++) {
            int ge = a % 10;
            int shi = a / 10 % 10;
            int bai = a / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == a) {
                System.out.println("1000以内的水仙花数有：" + a);
                sum++;
            }

        }
        System.out.println("1000以内的水仙花数共有：" + sum + "个");
    }
}
