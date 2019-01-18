package dx.come;

//1 一个数字；
//2 这个数乘以9的倍数，结果每一位上的数字都相同 这个数部位0；
public class Demo1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 9;
        String zh = "";
        while (true) {
            int count = 0;
            for (int a = 9; a <= 10; a++) {
//                获取结果
                count = x * y * a;
//                结果转换为字符串，字符串有一个方法，可以判断这个 字符串有几个字符
                zh = zh + count;
                zh.length();
//                获取位数
                int ws = zh.length();
//                声明位数的变量
                int ge = 0;
                int shi = 0;
                int bai = 0;
                int qian = 0;
                int wan = 0;
                int shiwan = 0;
                switch (ws) {
                    case 2:
                        ge = count % 10;
                        shi = count / 10;
                        if (ge==shi){}
                        break;
                    case 3:
                        ge = count % 10;
                        shi = count / 10 % 10;
                        bai = count / 10 / 10;
                        if (ge==shi&&ge==bai){}
                        break;
                    case 4:
                        ge = count % 10;
                        shi = count / 10 % 10;
                        bai = count / 10 / 10 % 10;
                        qian = count / 10 / 10 / 10;
                        if (ge == shi && ge == bai && ge == qian){}
                        break;
                    case 5:
                        ge = count % 10;
                        shi = count / 10 % 10;
                        bai = count / 10 / 10 % 10;
                        qian = count / 10 / 10 / 10 % 10;
                        wan = count / 10 / 10 / 10 / 10;
                        if (ge == shi && ge == bai && ge == qian && ge == wan){}
                        break;
                    case 6:
                        ge = count % 10;
                        shi = count / 10 % 10;
                        bai = count / 10 / 10 % 10;
                        qian = count / 10 / 10 / 10 % 10;
                        wan = count / 10 / 10 / 10 / 10 % 10;
                        shiwan = count / 10 / 10 / 10 / 10 / 10;
                        if (ge == shi && ge == bai && ge == qian && ge == wan && ge ==shiwan){

                        }
                        break;
                }
                if (ge == shi && ge == bai && ge == qian && ge == wan && ge ==shiwan){

                }
            }

//            需要判断一下这个数乘以九的倍数的结果的位数
            }
        }
    }
