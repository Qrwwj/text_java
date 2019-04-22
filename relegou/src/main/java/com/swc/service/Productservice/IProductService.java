package com.swc.service.Productservice;

import com.swc.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {
    public List<Product> getproducts(String name,Integer status);
    public int deleteproduct(int id);
    public Product selectone(int id);
    public int updateproduct(Product product);
    public int insertproduct(Product product);
}
