package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 20:07
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//求珠穆朗玛峰
public class Demo8 {
    public static void main(String[] args) {
        int x = 884800;
        double y = 1;
        int count = 0;
        while (y < x) {

            y *= 2;
            count++;
        }
        System.out.println("需要折：" + count + "次");
    }
}
