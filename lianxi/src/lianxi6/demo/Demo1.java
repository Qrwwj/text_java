package lianxi6.demo;

/**
 * @Author: wwj
 * @Date: 2019/1/15 8:51
 * @Description: 一步一个脚印
 */
public class Demo1 {
//    1-100之间的随机数
    public static void main (String []args){
//        Math.random();//获取随机数
        for (int i=0;i<100;i++){
            float s=(float)(Math.random()*100);//Math.random()double形 赋值为float形需强制转换 获取1-100之间的随机数
            s=(float)(Math.random()*100);
            int a=Math.round(s);
            System.out.println(a);

            s=(float)(Math.random()*100);
            a=Math.round(s);
            System.out.println(a);

            s=(float)(Math.random()*100);
            a=Math.round(s);
            System.out.println(a);
        }
    }
}
