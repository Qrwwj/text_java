package web;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo {
    public static void main(String[] args) {
        Integer a = 3;
        Integer b = new Integer(3);
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println("============================================");
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));
        System.out.println(f3 == f4);
        System.out.println(f3.equals(f4));

        if (f3 == f4 && f1 == f2) {
            System.out.println("两边条件都成立，我才运算");
        } else {
            System.out.println("当左边条件为false，右边不执行");
        }
        if (a == b || f1 == f2) {
            System.out.println("左边条件为false，右边不参与运算");
        } else {
            System.out.println("两边条件都成立，我就执行");
        }


        System.out.println("===================================");
//        String s1 = new StringBuilder("go")
//                .append("od").toString();
//        System.out.println(s1.intern() == s1);
//        String s2 = new StringBuilder("ja")
//                .append("va").toString();
//        System.out.println(s2.intern() == s2);

        System.out.println("===================================");

        String[] strings = {"aaa","bbb","ccc"};
        String string = "aaabbbccc";
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

        System.out.println("String[].length="+strings.length);
        System.out.println("String.length()="+string.length());
        System.out.println("List.size()="+list.size());
        System.out.println("===================================");
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
        System.out.println(s5==s6);
        System.out.println(s6);
        System.out.println(s5);




    }
}
