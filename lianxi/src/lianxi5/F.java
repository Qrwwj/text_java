package lianxi5;

public class F {
    public static void main(String[] args) {
//        依次输出0-10；
//        for (int a = 0; a <= 10; a++) {
//            System.out.println(a);
////            System.out.println();
////            依次输出10-1
//
//        }
//        for (int b = 10; b >= 1; b--) {
//            System.out.println(b);
////                System.out.println();
//        }
//        int sum = 0;
//        for (int x = 1; x <= 10; x++) {
//            sum += x;
//
//        }
//        System.out.println(sum);

//1-100 之间的偶数和、奇数和、总和
//        int sum = 0;
//        for (int a = 0; a <= 100; a++) {
//            if (a % 2 == 0) {
//                sum += a;
//            }
//
//        }
//        System.out.println("100以内的偶数和：" + sum);
//        int sum1 = 0;
//        for (int b = 0; b <= 100; b++) {
//            if (b % 2 == 1) {
//                sum1 += b;
//            }
//        }
//        System.out.println("100以内的奇数和：" + sum1);
//        System.out.println("1-100的和：" + (sum1 + sum));
//
//
////        0000000000000000000000000000000000000000
//        int jc = 1;
//        for (int c = 1; c <= 5; c++) {
//            jc *= c;
//
//        }
//        System.out.println("5的阶乘为：" + jc);
//
//
////        .........................................水仙花数
//        System.out.println("水仙花数有：");
//        int x=0;
//        for (int s = 100; s < 1000; s++) {
//            int ge, shi, bai;
//
//            ge = s % 10;
//            shi = s / 10 % 10;
//            bai = s / 10 / 10 % 10;
//            if (s == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
//                x++;
//                System.out.println(s);
//
//            }
//
//        }
//        System.out.println("1000以内的水仙花个数为："+x);
//


//        0000000000000000000000000000000000000000000
//        请在控制台输出满足如下条件的五位数
//         个位等于万位
//        十位等于千位
//        个位+十位+千位+万位=百位

//        int ge, shi, bai, qian, wan;
//        int y = 0;
//        System.out.println("满足条件的数有：");
//        for (int a = 0; a < 100000; a++) {
//            ge = a % 10;
//            shi = a / 10 % 10;
//            bai = a / 10 / 10 % 10;
//            qian = a / 10 / 10 / 10 % 10;
//            wan = a / 10 / 10 / 10 / 10 % 10;
//            if (ge == wan && shi == qian && ge + shi + qian + wan == bai) {
//                System.out.println(a);
//                y++;
//            }
//
//        }
//        System.out.println("满足条件的数有：" + y + "个");
//
//
//0000000000000000000000000000000000000000000
int x=0;
        for (int a = 0; a <= 1000; a++) {
            if (a % 3 == 2 && a % 5 == 3 && a % 7 == 2) {
                System.out.println(a);
                x++;
            }
        }
        System.out.println("满足条件的数有："+x+"个");
    }
}
