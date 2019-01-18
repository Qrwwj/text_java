package HomeWork;
import java.util.Scanner;
public class Demo7 {
    public static void main(String[]ages){
        System.out.println("请输入一个自然数:");
        Scanner zy=new Scanner(System.in);
        int a=zy.nextInt();


            do {
                if (a % 2 == 1) {
                    a = a * 3 + 1;
                } else {
                    a = a / 2;
                }
                System.out.println(a + "");
            } while (a != 1);


    }
}
