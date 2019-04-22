package com.utiles;

import java.sql.ResultSet;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public interface RowMap<T> {
    public T RowMapping(ResultSet rs);
}
