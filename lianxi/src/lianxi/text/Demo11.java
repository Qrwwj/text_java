package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 8:22
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//数组元素逆序 (就是把元素对调)
public class Demo11 {
    public static void main (String []args){
//        定义一个数组并对元素中元素赋值
//        int a[]={1,2,3};
////        通过遍历依次得出数组中的数
//        for (int i=0;i<a.length;i++){
//            System.out.println("数组中的数依次是："+a[i]);
//        }
//        如何实现调换呢？
        int[] arr = {12,98,50,34,76};

        System.out.println("逆序前：");
        printArray(arr);

        System.out.println("逆序后：");
        //reverse(arr);
        reverse2(arr);
        printArray(arr);
    }



//方法重载
public static void reverse2(int[] arr) {
        for(int start=0,end=arr.length-1; start<=end; start++,end--) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        }
        }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if(x == arr.length-1) { //这是最后一个元素
                System.out.println(arr[x]+"]");
            }else {
                System.out.print(arr[x]+", ");
            }
        }
    }
}
