package come.Homework;
public class Demo12 {
//    一个数如果恰好等于它的因子之和，这个数就称为”完数”。
// 例如6=1＋2＋3.编程找出1000以内的所有完数。


        public static void main(String[] args) {
//        初始因子和sum=0

//        第一个循环是1--1000个数
            for (int i=2;i<=1000;i++){
                int sum=0;
//            第二个循环就是找因子
                for (int j=1;j<i;j++){
//                如果i能够整除j,则j为i的因子
                    if (i%j==0){
                        sum=sum+j;
                    }
                }
                if (sum==i){
                    System.out.println(i);
                }
            }
        }
    }

