package HomeWork;
//	要求用户输入一个学生的分数（1~100），使用switch结构判断该分数属于什么等级（A、B、C、D、F）。
import java.util.Scanner;
public class Demo4 {
    public static void main(String[]args){
        Scanner zy=new Scanner(System.in);
        System.out.println("请输入你的分数：");
        int f=zy.nextInt();
        switch (f/10){
            case 10:
                System.out.println("该学生的分数属于A级");
                break;
            case 9:
                System.out.println("该学生的分数属于A级");
                break;
            case 8:
                System.out.println("该学生的分数属于B级");
                break;
            case 7:
                System.out.println("该学生的分数属于B级");
                break;
            case 6:
                System.out.println("该学生的分数属于C级");
                break;
            case 5:
                System.out.println("该学生的分数属于C级");
                break;
            case 4:
                System.out.println("该学生的分数属于D级");
                break;
            case 3:
                System.out.println("该学生的分数属于D级");
                break;
            case 2:
                System.out.println("该学生的分数属于F级");
                break;
            case 1:
                System.out.println("该学生的分数属于F级");
                break;
            case 0:
                System.out.println("该学生的分数属于F级");
                break;
                default:
                    System.out.println("输入的成绩无效");

        }
    }
}
