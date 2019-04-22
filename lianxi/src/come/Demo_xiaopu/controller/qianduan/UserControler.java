package come.Demo_xiaopu.controller.qianduan;

import come.Demo_xiaopu.service.qiantai.UserService;
import come.Demo_xiaopu.service.qiantai.User_a;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class UserControler {

//    处理请求的方法


    //        导入业务层
//    private UserService usz=new User_a();
//    //    注册请求
//    public boolean zhuce(String uname, String upsw) {
//        boolean flag = us1.zhuce(uname, upsw);
//        return flag;
//    }


    //        导入业务层
   private UserService us=new User_a();


    //    登录请求
    public boolean login(String uname, String upsw) {
        boolean flag = us.login(uname, upsw);
        return flag;

    }
}
