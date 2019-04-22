package com.dianshang.service;

import com.dianshang.pojo.Handle;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
public interface IHandleService {
    public List<Handle> gethandles(Integer parent_id);
    public int update(Handle handle);
    public int insert(Handle handle);
    public Handle gethandleOne(Integer id);
    public List<Handle> getHandleParentId();
}
