package come.Demo_dianshang.Register;

import come.Demo_dianshang.User.User;

//用户注册页面
//    1输入要注册的账号 密码 键盘录入
//    2判断输入的账号密码是否已经注册 存在提示 你输入的账号已经存在  然后选择功能  1登录 0退出程序
//    3  不存在 提示注册成功并将注册的账号存储在数组中
//    4 注册成功后 跳转到登录
public class Register {

    //    方法重载
    public static void zc(User[] arr, String name, String password, String youxiang, String dianhua) {

//        调用User类中的成员变量
        User uname = new User();
        uname.setName(name);
        uname.setPassword(password);
        uname.setNewEmail(youxiang);
        uname.setNewPhone(dianhua);
      /*  第一步既然注册，注册成功肯定会生成一个用户， 我有一个用户的属性，我包装一下带过来了
                然后我现在不确定这个用户，跟我数组里面的用户是不是同一个人。我要对比
                如果这个用户的名字，跟我数值里面的不一样，那么肯定就注册成功
                但是我有用户，我没有数组，我自己先传个参等会，到主页，我在new一个*/


//通过循环遍历判断账号是否存在 注册人数是否达到阀值


//        人物我已经创建好了， 我现在考虑的这个人，我要不要放到我的数组里面。

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (name.equals(arr[i].getName())) {
                    System.out.println("你输入的账号已存在！");
                    break;


                } else if (arr.length - 1 == i && arr[arr.length - 1] != null) {

                    System.out.println("系统维护中，请稍后再试");
                    break;
                }
            } else if (arr[i] == null) {
                arr[i] = uname;
                System.out.println("恭喜你注册成功");
                break;


            }
        }
    }
}
