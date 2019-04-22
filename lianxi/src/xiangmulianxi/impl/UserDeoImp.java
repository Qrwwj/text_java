package xiangmulianxi.impl;

import xiangmulianxi.dao.UserDeo;
import xiangmulianxi.popj.User;

import java.util.ArrayList;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//这个类用来实现用户的一系列功能   登录注册
public class UserDeoImp implements UserDeo {

    //声明一个集合存储用户注册信息 同时方便使用同时为了防止用户查看
    private static ArrayList<User> arr = new ArrayList<User>();

    @Override
    public boolean islogin(String username, String upassword) {
        boolean flag = false;
//        遍历集合 获取每一个用户 并判断该用户的用户名是否与传递过来的匹配  如果匹配返回true
        for (User u : arr) {
            if (u.getUsername().equals(username) && u.getUserpassword().equals(upassword)) {
                flag= true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
//        通过数组对象arr调用增加的方法

//        用集合来存储用户的注册信息
        arr.add(user);
    }
}
