package come.Demo_xiaopu.data;

import come.Demo_xiaopu.domin.User.User;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public interface CmmonData  {

//    定义用户数据库 三种方式（数组  集合 文件）


//  数组
    User[] getUserDataSZ();

//    集合
    ArrayList<User>getUserDataJH();

//    文件
    File getUserDataWJ();


//    商品数据库
//    购物车数据库
//    订单数据库
//    其他数据库
}
