package com.swc.service.Productservice;

import com.swc.dao.ProductDao;
import com.swc.pojo.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{
    @Resource
    private ProductDao productDao;
    @Override
    public List<Product> getproducts(String name,Integer status) {

        return productDao.getproducts(name,status);
    }

    @Override
    public int deleteproduct(int id) {
        return productDao.deleteproduct(id);
    }

    @Override
    public Product selectone(int id) {
        return productDao.selectone(id);
    }

    @Override
    public int updateproduct(Product product) {
        return productDao.updateproduct(product);
    }

    @Override
    public int insertproduct(Product product) {
        return productDao.insertproduct(product);
    }

}
