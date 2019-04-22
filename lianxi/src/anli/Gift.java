package anli;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Gift {
    public Gift() {
    }

    public String toString() {
        return (new StringBuilder()).append("一个价值￥").append(price).append("的")
                .append(name).toString();
    }

    public String name;
    public double price;
}
