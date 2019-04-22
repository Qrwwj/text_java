package com.swc.dao;

import com.swc.pojo.Handle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HandleDao {
    public List<Handle> gethandles(@Param("parentId") Integer parentId);
    public Handle selectone(int id);
    public int updatehandle(Handle handle);
    public int deletehandle(int id);
    public int inserthandle(Handle handle);
}
