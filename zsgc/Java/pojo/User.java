package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@Data
public class User {
    private Integer num;
    private String name;
    private String sex;
    private Integer age;
    private String password;
    private Date date;
}
