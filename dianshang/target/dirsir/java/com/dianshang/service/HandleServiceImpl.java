package com.dianshang.service;

import com.dianshang.dao.HandleDao;
import com.dianshang.pojo.Handle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Service
public class HandleServiceImpl implements IHandleService {
    @Resource
    private HandleDao dao;
    @Override
    public List<Handle> gethandles(Integer parent_id) {
        return dao.gethandles(parent_id);
    }

    @Override
    public int update(Handle handle) {
        return dao.update(handle);
    }


    @Override
    public int insert(Handle handle) {
        return dao.insert(handle);
    }

    @Override
    public Handle gethandleOne(Integer id) {
        return dao.gethandleOne(id);
    }

    @Override
    public List<Handle> getHandleParentId() {
        return dao.getHandleParentId();
    }
}
