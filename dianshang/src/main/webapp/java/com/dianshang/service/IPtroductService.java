package com.dianshang.service;

        import com.dianshang.pojo.Handle;
        import com.dianshang.pojo.Product;
        import org.apache.ibatis.annotations.Param;

        import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface IPtroductService {
    public List<Product> getprotuct(@Param("name") String name, @Param("Status")String status);
    public int insert(Product product);
    public Product  getOneList(Integer id);
    public int updateproduct(Product product);
    public List<Handle> gethandles();
    public int deleteOne(Integer id);
}
