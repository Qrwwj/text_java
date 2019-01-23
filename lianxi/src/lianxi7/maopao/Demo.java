package lianxi7.maopao;

/**
 * @Author: wwj
 * @Date: 2019/1/21 10:16
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//将26个英文字母用冒泡排序排列

//    步骤：

public class Demo {
    public static void main(String[] args) {
        //    定义一个关于字母的字符串 String

        String zm = "afdfxhucvan";

//    将字符串转换成字符串数组 char类型

        char arr[] = zm.toCharArray();

//        方法调用  同类中的方法可以直接调用
        FangFa(arr);

//        把字符数组转换成String类型的字符串
        zm = zm.valueOf(arr);
//        将转换完的数组输出
        System.out.println(zm);

//
    }


    public static void FangFa(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char text = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = text;

                }
            }
        }
    }

}
