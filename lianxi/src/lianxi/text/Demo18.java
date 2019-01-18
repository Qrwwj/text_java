package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 19:04
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//讲一个数存储到数组中
public class Demo18 {
    public static void main(String[] args) {
//        定义一个数字
        int number = 123;
//        创建一个数组
        int arr[] = new int[6];
//        把数据中的每个数字存储到数组中
//        首先定义一个初始化值为0的变量 来表示数组的下标
        int xb = 0;

        while (number>0){
            arr[xb]=number%10;
            xb++;
            number/=10;
        }
        for (int x = 0; x<xb; x++){
            System.out.print(arr[x]);
        }
        System.out.println("");
    }

}
