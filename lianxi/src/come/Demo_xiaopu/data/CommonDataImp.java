package come.Demo_xiaopu.data;

import come.Demo_xiaopu.domin.User.User;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class CommonDataImp implements CmmonData {
    @Override
    public User[] getUserDataSZ() {
        return new User[0];
    }

    @Override
    public ArrayList<User> getUserDataJH() {
        ArrayList<User> ul=new ArrayList<>();
        User u=new User();
        u.setUname("wwj");
        u.setUpsw("123");
        return null;
    }

    @Override
    public File getUserDataWJ() {
        return null;
    }

    public static void main(String args){}
}
