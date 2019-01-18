package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 14:18
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//二维数组遍历
public class Demo14 {
    public static void main(String[] args) {
//        首先定义一个二维数组
        int arr[][] = new int[4][3];
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5, 6};
        arr[2] = new int[]{4, 5, 6};
        arr[3] = new int[]{7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println("");
        }

    }
}
