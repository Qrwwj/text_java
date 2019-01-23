package come.Homework;
//使用for循环的嵌套编程输出如下图形：
//        *                  *
//        ***              ***
//        *****          *****
//        *******      *******
//        *********  *********

public class Demo9 {
    public static void main(String[]args) {
//        外循环控制行数
//                内循环控制列数
//        先确定行数
        for(int x=0; x<9; x+=2) {
//            然后确定列数
            for(int y=0; y<=x; y++) {

                System.out.print("*");
            }
//            输入为空换行
            System.out.println();
        }
//        正三角
        for(int i=0;i<=9;i+=2) {

            for(int k=0;k<=(9-i);k++) //空格个数
            {
                System.out.print(" ");

            }
            for(int j=0;j<=i;j++) {
                System.out.print("*"+" ");


            }
            System.out.println();
        }

    }
}
