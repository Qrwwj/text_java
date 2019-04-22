package come.test.tese2;


import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo1 {
    public static void main(String[] args) {
//        通过for循环输出数据

//        以基数为底打印三角
        for (int i=1;i<=5;i++){
            for (int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


//        打印直角三角形
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int shuzi=sc.nextInt();
        for (int a=1;a<=shuzi;a++){
            for (int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }


//        打印九九乘法表
        for (int x=1;x<=9;x++){
            for (int y=1;y<=x;y++){
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.print("\n");
        }


//        调用方法

        chongzai(5,5);
    }

//    方法重载

    public static void chongzai(int m,int n) {
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
