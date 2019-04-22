package com.dianshang.pojo.list;

import lombok.Data;

import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Data
public class One {
    private Integer id;
    private String name;
    private List<Two> twos;
}
