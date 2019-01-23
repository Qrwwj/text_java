package come.Homework;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class User {

    //   这个功能主要是将用户信息封装起来
//    既然封装起来了就必须写方法调用
    private String name;
    private String password;
    private String newEmail;
    private String newPhone;
//    private String wenti;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getWenti() {
//        return wenti;
//    }
//        this.wenti = wenti;
//
//    public void setWenti(String wenti) {
//    }

    public String getNewEmail() {
        return newEmail;

    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }
}
