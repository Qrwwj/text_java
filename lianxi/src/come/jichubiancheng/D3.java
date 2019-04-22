package come.jichubiancheng;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//水仙花数
public class D3 {
    public static void main (String []args){
        int ge,shi,bai;
        int count=0;
        for (int i=100;i<1000;i++){
            ge=i%10;
            shi=i/10%10;
            bai=i/10/10;
            int b=(int) (Math.pow(ge,3)+Math.pow(shi, 3)+Math.pow(bai, 3));
            if (i==b){
                count++;
                System.out.println("100-1000之间的水仙花数有"+i);
            }
        }
        System.out.println("100-1000之间的水仙花总数为："+count);
    }
}


