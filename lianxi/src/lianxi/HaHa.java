package lianxi;
//判断一维数组中最大值最小值
public class HaHa {
        public static void main (String[]args){
       int []arr=new int[]{5,10,15,3,2,78};//定义一个数组
       int max=arr[0];//将数组中第一个数付给max 定义最大值
       int min=arr[0];//将数组中第一个数付给min  定义最小值
       for (int a=1;a<arr.length;a++){//循环遍历
           if (arr[a]>max){//当a=1时，arr[a]=10
               max=arr[a];//max=10

           }
           if (arr[a]<min){
               min=arr[a];

           }
       }
            System.out.println("数组中最大的数是："+max);
            System.out.println("数组中最小的数是："+min);

        }

    }


