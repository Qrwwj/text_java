package lianxi3;

public class D3 {
    public static  void main (String[]args){
//    定义一个二维数组

//    设第一个数组为x
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int x=a[0][0];
    int y=a[0][1];
    int z=a[0][2];
    System.out.println("第一个一维数组中的第一个元素是："+x);
        System.out.println("第一个一维数组中的第一个元素是："+y);
        System.out.println("第一个一维数组中的第一个元素是："+z);

        for (int b=0;b<a.length;b++){
            System.out.println(a[0][b]);
        }
        for (int b=0;b<a.length;b++){
            System.out.println(a[1][b]);
        }
        for (int b=0;b<a.length;b++){
            System.out.println(a[2][b]);
        }
    }
}

