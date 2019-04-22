package pojo;

import lombok.Data;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
@Data
public class User {
    private Integer id;
    private String sname;
    private String password;
    private Integer sage;
    private String dept;
    private Integer sex;
}
