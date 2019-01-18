package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 15:11
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
/*
	公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99

	分析：
		A:把题目的数据用二维数组来表示
			int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		B:如何求和呢?
			求和其实就是获取到每一个元素，然后累加即可。
		C:定义一个求和变量sum，初始化值是0。
		D:通过遍历就可以得到每一个二维数组的元素。
		E:把元素累加即可。
		F:最后输出sum，就是结果。
*/
public class Demo15 {
    public static void main(String[] args) {
//        定义一个二维数组
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
//        定义一个总和变量
        int sum = 0;
        int y = 0;
//        通过for循环遍历得出每个数组中的元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = arr[i][0] + arr[i][1] + arr[i][2];
                y += arr[i][0] + arr[i][1] + arr[i][2];
                System.out.println("第" + (i + 1) + "季度的销售总额为：" + sum);
                break;

            }

        }
        System.out.println("四个季度的总销售额为：" + y);



    }
//public static void main(String[] args) {
//    //把题目的数据用二维数组来表示
//    int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
//
//    //定义一个求和变量sum，初始化值是0。
//    int sum = 0;
//
//    //通过遍历就可以得到每一个二维数组的元素。
//    for(int x=0; x<arr.length; x++) {
//        for(int y=0; y<arr[x].length; y++) {
//            //把元素累加即可。
//            sum += arr[x][y];
//        }
//    }
//
//    //最后输出sum，就是结果。
//    System.out.println("一年的销售额为："+sum+"万元");
//}
}
