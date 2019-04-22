package com.dianshang.service;

import com.dianshang.dao.ProductDao;
import com.dianshang.pojo.Handle;
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
public class ProductServiceImpl implements IPtroductService
{
    @Resource
    private ProductDao dao;
    @Override
    public List<Product> getprotuct(String pname,String status) {
        return dao.getprotuct(pname,status);
    }

    @Override
    public int insert(Product product) {
        return dao.insert(product);
    }

    @Override
    public Product getOneList(Integer id) {
        return dao.getOneList(id);
    }


    @Override
    public int updateproduct(Product product) {
        return dao.updateproduct(product);
    }

    @Override
    public List<Handle> gethandles() {
        return dao.gethandles();
    }

    @Override
    public int deleteOne(Integer id) {
        return dao.deleteOne(id);
    }
}
