package com.swc.dao;

import com.swc.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    public List<Product> getproducts(@Param("name") String name,@Param("status") Integer status);
    public int deleteproduct(int id);
    public Product selectone(int id);
    public int updateproduct(Product product);
    public int insertproduct(Product product);
}
