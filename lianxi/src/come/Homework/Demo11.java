package come.Homework;
//

    import java.util.Scanner;

public class Demo11 {
        //    输入两个正整数m和n，求其最大公约数和最小公倍数。
        public static void main(String[] args) {
            int max,min,value2;
//    输入
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第一个数");
            int x=sc.nextInt();
            System.out.println("请输入第二个数");
            int y=sc.nextInt();


            if (x==y){
                System.out.println("最大公约数与最小公倍数是"+x);
                return;
            }else{

                if (x>y){
                    max=x;
                    min=y;
                }else {
                    max=y;
                    min=x;
                }
                int value=1;
                for (int i=2;i<=min;i++){
                    if ((max%i==0)&&(min%i==0)){
//                System.out.println("最大公因子为"+i);
                        value=i;
                    }

                }

                value2=min*max/value;
                System.out.println("最大公约数"+value);
                System.out.println("最小公倍数"+value2);

            }
        }
    }


