package come.jichubiancheng;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//判断101-200之间有多少个素数，并输出所有的素数
public class D2 {
    public static void main(String []args) {
    int count=0;
    for (int i=101;i<200;i++){
         if (i%2!=0){
            count++;
            System.out.println(i+"为素数");
        }
    }
        System.out.println("101-200之间的素数一共有："+count+"个");
    }
}
