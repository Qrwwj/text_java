package HomeWork;
//19、	打印出100以内的质数，一行显示5个，（质数是只能被1跟自身整除的数，1不是质数）
public class Demo19 {
//    主函数
        public static void main(String[] args) {
//        打印一百以内,循环
//        1不是质数,所以从2开始
            int x;
            int n=1;
            for (int i=2;i<=100;i++){
//        循环,输出5次
                x=2;
                while (i%x!=0){
                    x++;
                }
                if (x==i) {
//                   判断是否换行
                    if (n%5!=0){
                        System.out.print(i+",");
                        n++;
                    }else {
                        System.out.println(i);
                        n++;
                    }

                }

            }
        }
    }

