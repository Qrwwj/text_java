/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class ArrayBox {
    public static void main(String[] args) {
//创建6个对象 按成绩排序
        Student[] arr = new Student[6];
        arr[0] = new Student(12340, "张三", 65, 80, 100);
        arr[1] = new Student(12341, "王五", 80, 85, 90);
        arr[2] = new Student(12342, "李四", 88, 78, 98);
        arr[3] = new Student(12343, "路易斯", 99, 98, 100);
        arr[4] = new Student(12344, "林青霞", 100, 100, 100);
        arr[5] = new Student(12345, "赵四", 88, 87, 65);

        //按sum排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].sum() > arr[i].sum()) {
                    Student temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int mingci = 1;//名次

        for (int i = 0; i < arr.length - 1; i++) {
            int n = checkContinue(arr, arr[i].sum());
            if (n == 1) {
                arr[i].mingci = mingci++;
            } else {
                //总分相同，名次相同
                for (int j = 0; j < n; j++) {
                    arr[i + j].mingci = mingci;
                }
                mingci++;
                i = i + n - 1;//连续n个相同的总分，排名一样
            }
        }
        arr[arr.length - 1].mingci = mingci;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //判断是否连续
    public static int checkContinue(Student[] student, double sum) {
        int count = 0;//统计多少个连续相同的sum
        for (int i = 0; i < student.length; i++) {
            if (student[i].sum() == sum) {
                count++;
            }
        }
        return count;
    }
}

/*
//属性
//    创建一个数组用来存储数据
public int[] elementData=new int[10];  //长度一旦确定就不能再发生改变

//    方法

//    设计一个方法B 达到A想要达到的目的

    public void fb(int a){

        if (a-elementData.length>0){
//            要存储的数据超出数组中剩余的位置 需要扩容
        }
    }
//    创建一个方法C 来达到扩容的目的
  public void grow(int minCapacity ){

//        获取旧数组的长度
      int oldCapactity = elementData.length;

//     以旧数组的1.5被扩容
   int newCapactity= oldCapactity +(oldCapactity >> 1);    //   >>右位移 数组长度/2

//      扩容后数组长度还不够
      if (newCapactity-minCapacity<0){
          newCapactity =minCapacity;  // 将需要的长度数值赋给扩容后的数组 newCapactity

//          按照心得长度 创建一个新的数组
      }

  }

//  创建哟个方法D 负责创建一个新数组 来存储旧数组中的数据 返回新数组

   public int []copyof(int[] oldArray.int newCapacity){


   }

//    写一个方法A来往数组中存储数据
    public boolean add(int element){

//        确定数组中是否还有位置

//    }
//}
*/
