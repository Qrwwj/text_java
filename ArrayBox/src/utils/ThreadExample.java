package utils;


import java.util.Calendar;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description:
 */
//class ThreadExample {
//public static void main(String [] args){
//    String str1="asd";
//    String str2="asd";
//    System.out.println(str1.equals(str2));
//    Calendar c=Calendar.getInstance();
//    System.out.println(c.get(c.YEAR)+"年"+(c.get(c.MONDAY)+1)+"月"+(c.get(c.DAY_OF_MONTH))+"日"+c.get(c.HOUR)+":"+c.get(c.MINUTE)+":"+c.get(c.SECOND));
//    c.add(c.DAY_OF_MONTH,10);
//    System.out.println(c.get(c.YEAR)+"年"+(c.get(c.MONDAY)+1)+"月"+c.get(c.DAY_OF_MONTH)+"日"+c.get(c.HOUR)+":"+c.get(c.MINUTE)+":"+c.get(c.SECOND));
//
//    System.out.println("=================================================");
//
//}
    class Chinese{
        private static Chinese objref =new Chinese();
        private Chinese(){}
        public static Chinese getInstance() { return objref; }
    }

//}
