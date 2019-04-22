package come.test.text1;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//设计一个方法，用来交换一个数组（头尾交换）
//     思路： 1是否需要参数及返回值

public class Demo1Text {

    public  int[] changeArrayElement(int [] array){
        //        array.length/2 这种查找法 即二分查找法
        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
        return  array;
    }

}
