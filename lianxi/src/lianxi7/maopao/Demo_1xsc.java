package lianxi7.maopao;

/**
 * @Author: wwj
 * @Date: 2019/1/21 9:49
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo_1xsc {
    public static void main(String[] args) {
        //1.将字符串转换为字符数组
        //2.对字符串进行冒泡排序
        //3.将字符数组转换为字符串

        String ch = "gdfsgsdfhfghjghkhj";
        //1.将字符串转换为字符数组:char[] toCharArray()  将此字符串转换为一个新的字符数组。
        char[] arr = ch.toCharArray();
        bubbleSort(arr);

        //3.将字符数组转换为字符串
        //方式一：静态方法：static String copyValueOf(char[] data) 返回指定数组中表示该字符序列的 String。
//       ch=ch.copyValueOf(arr);
//       System.out.println(ch);
        //方式二：构造方法String(char[] value)  分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
//       String result=new String (arr);
//       System.out.println(result);
        //方式三：static String valueOf(char[] data) 返回 char 数组参数的字符串表示形式。
        ch = ch.valueOf(arr);

        System.out.println(ch);

    }

    //2.对字符数组进行冒泡排序
    public static void bubbleSort(char[] ch) {
        for (int i = 0; i < ch.length - 1; i++) {
            for (int x = 0; x < ch.length - 1 - i; x++) {
                if (ch[x] > ch[x + 1]) {
                    char a = ch[x + 1];
                    ch[x + 1] = ch[x];
                    ch[x] = a;
                }
            }
        }

    }
}


