package crud;


import crud.dao.UserDao;
import crud.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
//    SqlSession
    private SqlSession sqlSession;

    @Before
    public void Before() {
        InputStream inputStream = null;
        String resource = "crud/dao/Sqlconfig.xml";
        try {
//            以流的形式获取数据  配置文件
            inputStream = Resources.getResourceAsStream(resource);
//            创建一个仓库 通过流创建出SqlSessionFactory对象-----生产sqlSession
//            SqlSessionFactory是单例模式 生命周期是整个执行过程
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = build.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test1() {
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.getAll();
        for (User u : list
                ) {
            System.out.println(u);
        }
    }

    @After
    public void After() {
        sqlSession.commit();
    }

}
