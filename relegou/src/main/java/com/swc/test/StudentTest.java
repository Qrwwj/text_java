package com.swc.test;

import com.swc.pojo.School;
import com.swc.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//配合使用单元测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class StudentTest {
    @Test
    public void a(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student)ac.getBean("stu");
        System.out.println(student);
    }

    @Test
    public void b(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        School school=(School)ac.getBean("sch");
        System.out.println(school);
    }
    @Test
    public void c(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student)ac.getBean("stu");
        System.out.println(student);
    }
}
