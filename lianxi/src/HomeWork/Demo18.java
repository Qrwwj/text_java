package HomeWork;
//18、	编写Java程序，在控制台上打印出九九乘法表
public class Demo18 {
    public static void main(String[]ages){
//        外循环控制行数
//        内循环控制列数
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");//\t空行
            }
            System.out.println();
        }

    }
}