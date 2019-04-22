package come.Demo_xiaopu.text;

import come.Demo_xiaopu.controller.qianduan.UserControler;

import java.util.Scanner;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Text_a {
    private static UserControler uc = new UserControler();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String uname=sc.next();
        System.out.println("请输入密码：");
        String upsw=sc.next();
        System.out.println("登录：" + uc.login(sc.next(), sc.next()));

    }
}
