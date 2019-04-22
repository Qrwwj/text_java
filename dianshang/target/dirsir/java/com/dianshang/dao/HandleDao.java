package com.dianshang.dao;

import com.dianshang.pojo.Handle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface HandleDao {
    public List<Handle> gethandles(@Param("parent_id") Integer parent_id);
    public int update(Handle handle);
    public int insert(Handle handle);
    public Handle gethandleOne(Integer id);
    public List<Handle> getHandleParentId();
}
