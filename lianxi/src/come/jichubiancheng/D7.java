package come.jichubiancheng;

import java.util.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */


//输入一行字符  分别统计出其英文字母 空格 数字和其他字符的个数
public class D7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符：");
        String str = sc.nextLine();  //将一行字符转换为字符
        sc.close();
        count(str);
    }

    //    统计输入字符数的方法
    private static void count(String str) {
        String s1 = "[\u4e00-\u9fa5]"; //汉字
        String s2 = "[a-zA-Z]"; //大小写英文字母
        String s3 = "[0-9]";  //数字
        String s4 = "\\s";   //空格

        int countChinese = 0;
        int countzimu = 0;
        int countshuzi = 0;
        int countkongge = 0;
        int countother = 0;
//        将字符串转换为字符数组
        char[] arr = str.toCharArray();
//        汉字只能当做字符串处理
        String[] arr_s = new String[arr.length];

        for (String s : arr_s) {
            if (s.matches(s1)) {
                countChinese++;
            } else if (s.matches(s2)) {
                countzimu++;
            } else if (s.matches(s3)) {
                countshuzi++;
            } else if (s.matches(s4)) {
                countkongge++;
            } else {
                countother++;
            }
            System.out.println("输入的字符汉字有" + countChinese + "个");
            System.out.println("输入的字符字母有" + countzimu + "个");
            System.out.println("输入的字符数字有" + countshuzi + "个");
            System.out.println("输入的字符空格有" + countkongge + "个");
            System.out.println("输入的字符其他字符个数有" + countother + "个");
        }

//        List<String> list=new ArrayList<String>();
//            char [] array_Char=str.toCharArray();
//            for (char c:array_Char){
//                list.add(String.valueOf(c)); //将字符作为字符串添加到list表中
//
//                Collections.sort(list); //排序
//                for (String s:list){
//                    int begin=list.indexOf(s);
//                    int end=list.lastIndexOf(s);
//                    if (list.get(end)==s){
//                        System.out.println("字符"+s+"有"+(end-begin+1)+"个");
//
//                    }
//
//                }
//        }

    }

}
