package xiangmulianxi.dao;

import xiangmulianxi.popj.User;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//构建一个接口实现 用户的登录和注册
public interface UserDeo {
//    这是用户登录功能
    public abstract boolean islogin(String username,String upassword);
//    这是用户注册功能
    public abstract  void regist(User user);

}
