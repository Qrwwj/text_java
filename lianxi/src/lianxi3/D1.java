package lianxi3;

public class D1 {
    public static void main(String []args){
//        定义一个数组
        int a []=new int[5];
//        接收数组
        int x=a [0];
        System.out.println("输入的第一个元素："+x);

        for (x=0;x<5;x++){
            int y=a[x];
            System.out.println("输入的"+x+"个元素是"+y);
        }
        //        定义一个String类型数组
        String b []=new String[3];
//        接收String 类型数组
        String z=b[3];
//        for (int z=0;z<3;z++){
//String c=b[z];
//        }
        System.out.println("输入的第一个元素："+z);
    }
}
