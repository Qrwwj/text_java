package com.dianshang.pojo;


        import lombok.Data;

        import java.util.Date;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Data
public class Handle {
    private Integer id;
    private String name;
    private Integer parent_id;
    private Integer status;
    private Integer sort_order;
    private Date create_time;
    private Date update_time;
}
