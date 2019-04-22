package com.swc.service.Handleservice;

import com.swc.pojo.Handle;

import java.util.List;

public interface IHandleService {
    public List<Handle> gethandles(Integer parentId);
    public Handle selectone(int id);
    public int updatehandle(Handle handle);
    public int deletehandle(int id);
    public int inserthandle(Handle handle);
}
