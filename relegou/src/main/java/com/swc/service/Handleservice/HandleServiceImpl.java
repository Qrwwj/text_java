package com.swc.service.Handleservice;

import com.swc.dao.HandleDao;
import com.swc.pojo.Handle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HandleServiceImpl implements IHandleService{
    @Resource
    private HandleDao handleDao;
    @Override
    public List<Handle> gethandles(Integer parentId) {
        return handleDao.gethandles(parentId);
    }

    @Override
    public Handle selectone(int id) {
        return handleDao.selectone(id);
    }

    @Override
    public int updatehandle(Handle handle) {

        return handleDao.updatehandle(handle);
    }

    @Override
    public int deletehandle(int id) {
        return handleDao.deletehandle(id);
    }

    @Override
    public int inserthandle(Handle handle) {
        return handleDao.inserthandle(handle);
    }
}
