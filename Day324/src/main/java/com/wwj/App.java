package com.wwj;

import com.wwj.dao.UserDao;
import com.wwj.pojo.User;
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
    private SqlSession sqlSession;

    @Before
    public void Before() {
        InputStream rs = null;
        String resource = "com/wwj/dao/UserConfg.xml";
        try {
            rs = Resources.getResourceAsStream(resource);
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(rs);
            sqlSession = build.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test01() {
        UserDao dao = sqlSession.getMapper(UserDao.class);
        List<User> list = dao.getAll();
        for (User use : list
                ) {
            System.out.println(use);
        }
    }

    @After
    public void After() {
        sqlSession.commit();
    }
}
