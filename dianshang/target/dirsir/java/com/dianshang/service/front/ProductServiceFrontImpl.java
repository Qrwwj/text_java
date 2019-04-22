package com.dianshang.service.front;

import com.dianshang.dao.ProductDao;
import com.dianshang.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Service
public class ProductServiceFrontImpl implements IProductServiceFront {
    @Resource
    private ProductDao dao;
    @Override
    public List<Product> getpct() {
        return dao.getpct();
    }
}
