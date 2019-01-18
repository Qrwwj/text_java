package HomeWork;
//	使用while循环求1~100以内所有奇数的和

public class Demo5 {
    public static void  main(String[]ages){

        int i=1,sum=0;
        while (i<100){
            sum=sum+i;
            i=i+2;

        }
        System.out.print("1到100之间奇数的和为："+sum);
    }
}
