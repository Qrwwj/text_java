package lianxi7.maopao;

/**
 * @Author: wwj
 * @Date: 2019/1/22 20:41
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo4 {
    public static void main(String[] args) {

//首先声明一个数组 并赋值
        int[] arr = {6, 3, 8, 6, 4, 9, 7};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + "");
        }

//通过循环遍历 依次判断数组中的相邻数字
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
