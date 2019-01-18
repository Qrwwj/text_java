package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 20:26
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//声明一个数组，并依次输出
public class Demo9 {
    public static void main(String[] args) {


       Demo9.anInt();//调用

    }

    public static void anInt() {//创建一个构造函数{方法}
        int a[] = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }



    }
}
