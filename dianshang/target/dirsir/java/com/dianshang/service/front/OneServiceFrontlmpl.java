package com.dianshang.service.front;

import com.dianshang.dao.front.OneDao;
import com.dianshang.pojo.list.One;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Service
public class OneServiceFrontlmpl implements IOneServiceFront {
    @Resource
    private OneDao dao;
    @Override
    public List<One> getones() {
        List<One> ones=dao.getones();
        for (One one:ones
             ) {
            System.out.println(one);
        }
        return ones;
    }
}
