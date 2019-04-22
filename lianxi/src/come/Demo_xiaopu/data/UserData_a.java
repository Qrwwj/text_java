package come.Demo_xiaopu.data;

import come.Demo_xiaopu.domin.User.User;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public interface UserData_a {

//    实现用户的增删改查


    void add(User u);
    void deleteOne(String uname);
    void change(String uname);
    boolean seeOne(String uname);
    void seeAll();

}
