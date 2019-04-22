package com.dianshang.dao;

import com.dianshang.pojo.Handle;
import com.dianshang.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface ProductDao {
    /*后台*/
    public List<Product> getprotuct(@Param("pname") String pname,@Param("status") String status);
    public int insert(Product product);
    public Product  getOneList(Integer id);
    public int updateproduct(Product product);
    public List<Handle> gethandles();
    public int deleteOne(Integer id);
    /*前台*/
    public List<Product> getpct();
}
