package lianxi5;
import java.util.Scanner;
/**
 * @Author: wwj
 * @Date: 2019/1/19 10:51
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class text {


   /* 输入账号密码
    创建账户，这时要验证账户是否存在
    存在就注册失败，
    不存在就注册成功*/
        //注册成功跳转到登录

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 接收注册信息
            System.out.println("请输入您要注册的账号");
            String name = sc.next();
            System.out.println("请输入您要设置的密码");
            String password = sc.next();
            System.out.println("请再次输入您要设置的密码");
            String password2 = sc.next();
            // 把注册好的账户信息存放在数组
            String[][] account = new String[10][2];
            register(name, password, account);

        }

        //把整个注册过程抽取成一个方法

        public static void register(String name, String password, String[][] account) {
            //通过循环遍历，拿到数组中的每一组用户的账号并进行判断
            for (int m = 0; m < account.length; m++) {
                if (name.equals(account[m][0])) {
                    System.out.println("该用户已存在");
                } else {
                    System.out.println("您已注册成功");
                    break;
                    //注册成功后遍历每个数组，遇到空的位置把该用户信息放入
                }
            }
            for (int m = 0; m < account.length; m++) {
                if (account[m][0] == null) {
                    account[m][0] = name;
                    account[m][1] = password;
                }
            }
        }

    }
