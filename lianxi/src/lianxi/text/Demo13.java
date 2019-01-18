package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 13:40
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//数组元素查找(查找指定元素第一次在数组中出现的索引)
//    什么是索引  索引就是数组中元素所对应的数字
public class Demo13 {
    public static void main(String[] args) {
//        定义一个静态数组
        int arr[] = {10, 25, 16, 46, 29, 63, 45};

//        方法调用

        int sy1 = getindex(arr, 63);
        System.out.println("63在数组中第一次所出现的索引是：" + sy1);

        int sy2 = getindex(arr, 29);
        System.out.println("29在数组中第一次所出现的索引是：" + sy2);
    }



//    方法重载 用遍历数组的形式输出数组中的数，并通过判断是否与数组中的数相等看索引
    public static int getindex(int[] arr, int value) {
        int sy = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == value) {
                sy = j;
                break;
            }
        }
        return sy;
    }
}
