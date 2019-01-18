package HomeWork;
//17、	要求用户输入用户名和密码，只要不是admin和111就提示用户名或密码不正确，请重新输入。正确时结束循环，提示登陆成功

import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {

//        输入
                Scanner sc=new Scanner(System.in);
//        定义两个变量接收用户输入的用户名和密码
                System.out.println("请输入用户名");
                String a=sc.nextLine();//String 定义字符串
                System.out.println("请输入密码");
                int x=sc.nextInt();
                if ("admin".equals(a)&&x==111){
                    System.out.println("登录成功");
                }else{
                    System.out.println("用户名或密码不正确,请重新输入");
                }
            }
        }


