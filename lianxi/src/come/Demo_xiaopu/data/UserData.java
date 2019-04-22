package come.Demo_xiaopu.data;

import come.Demo_xiaopu.domin.User.User;

import java.util.ArrayList;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserData implements UserData_a {

    //    声明一个数据库
    private static ArrayList<User> ul = new CommonDataImp().getUserDataJH();


    @Override
    public void add(User u) {


    }

    @Override
    public void deleteOne(String uname) {

    }

    @Override
    public void change(String uname) {

    }

    @Override
    public boolean seeOne(String uname) {

//        在这里去用户的数据库中查找数据

        for (User user : ul) {
            if (uname.equals(user.getUname())){
                return true;
            }

        }
        return false;

    }

    @Override
    public void seeAll() {

    }
}
