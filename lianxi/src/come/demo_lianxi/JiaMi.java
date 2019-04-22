package come.demo_lianxi;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class JiaMi {

    public static void main(String[] args) {

        int num=123456;

        //        声明一个数组
        int []arr=new int[8];

//        定义一个变量 接收数组中的下标、
        int index=0;

//        通过循环语句将数组中的数值逆序输出
        while (num>0){
            arr[index]=num%10;
            index++;
            num/=10;
        }

        for (int j=0;j<index;j++){
            arr[j]+=5;
            arr[j]%=10;
        }
        int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;
//        通过循环遍历输出数组中的额数值
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
