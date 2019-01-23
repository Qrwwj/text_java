package lianxi7.maopao;

/**
 * @Author: wwj
 * @Date: 2019/1/22 9:23
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo3 {

    public static void main(String[]args){

        int[] arr={6542962};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int a=arr[j];
                    arr[j+1]=arr[j];
                    arr[j]=a;

                }
            }
        }

    }
}
