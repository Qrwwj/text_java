package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:57
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//九九乘法表
public class Demo7 {
    public static void main(String[]args){
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");

            }System.out.println();
        }

    }
}
