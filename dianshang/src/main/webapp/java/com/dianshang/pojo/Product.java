package com.dianshang.pojo;

import lombok.Data;

import java.awt.*;
import java.util.Date;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
@Data
public class Product {
    private Integer id;
    private Integer handle_id;
    private String pname;
    private String subtitule;
    private String main_image;
    private String sub_image;
    private String detail;
    private Integer price;
    private Integer stock;
    private Integer status;
    private Date create_time;
    private Date update_time;

}
