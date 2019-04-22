package come.Demo_xiaopu.service.qiantai;

import come.Demo_xiaopu.data.UserData;
import come.Demo_xiaopu.data.UserData_a;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class User_a implements UserService {


//    导入数据层

    private UserData_a ud = new UserData();

    //    用户登录业务
    @Override
    public boolean login(String uname, String upsw) {

boolean flag=false;
//      对用户的输入进行校验

        if (uname==null||uname.equals("")||uname.equals(null)){
            return flag;
        }
//        将获取的数据取数据库进行比较
        flag = ud.seeOne(uname);
//        存在登录成功 不存在登录失败

        return false;
    }
}
