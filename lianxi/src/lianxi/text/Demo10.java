package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 21:05
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
//数组获取最值(获取数组中的最大值最小值)
public class Demo10 {
    public static void main(String[] args) {
        int a[] = {20, 50, 45, 75, 31, 21};//定义一个数组并静态赋值
//        定义一个变量表示最大值并赋予一个参考值
//        int max=a[0];
//通过数组遍历判断最大值
//        for (int i=0;i<a.length;i++){
//            if (a[i]>max){  //a[i]表示每一次数组中输出的数，与定义的变量比较 如果大于定义的变量 将这个数赋值给定义的变量
//                max=a[i];
//            }
//        }
//        System.out.println("max:"+max);
        int max = getMax(a);
        System.out.println("max:" + max);
        int min = getMin(a);
        System.out.println("min:" + min);
    }

//    重写数组的方法
    public static int getMax(int[] a) {
//        从数组中任意的找一个元素作为参照物
        int max = a[0];
//        然后遍历其他元素
        for (int i = 0; i < a.length; i++) {
//            依次获取和参照物进行比较，如果打就留下，如果小就离开
            if (a[i] > max) {
                max = a[i];
            }
        }
//        返回参照物里，此时参照物里的数就是最大数
        return max;
    }
        public static int getMin(int[] a){
            //从数组中任意的找一个元素作为参照物
            int min = a[0];
            //然后遍历其他的元素
            for (int x = 1; x < a.length; x++) {
                //依次获取和参照物进行比较，如果小就留下来，如果大，就离开。
                if (a[x] < min) {
                    min = a[x];
                }
            }
            //最后参照物里面保存的就是最小值。
            return min;
        }
    }

