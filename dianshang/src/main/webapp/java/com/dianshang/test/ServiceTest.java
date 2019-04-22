package com.dianshang.test;

import com.dianshang.dao.front.OneDao;
import com.dianshang.pojo.list.One;
import com.dianshang.service.front.IOneServiceFront;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
//根据applicationContext.xml的内容做测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ServiceTest {
    @Resource
    private IOneServiceFront serviceFront;

    @Test
    public void t() {
        List<One> handles = serviceFront.getones();
        /*for (One handle : handles
                ) {
            System.out.println(handle);
        }*/
    }
}
