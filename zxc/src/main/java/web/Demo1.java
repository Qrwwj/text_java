package web;


import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
/*
*
* 如何取得年月日、小时分钟秒？
 如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
 如何取得某月的最后一天？
 如何格式化日期？
*
*
* */
public class Demo1 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

        System.out.println("===========================");
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonthValue());
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println("======================");
        SimpleDateFormat a=new SimpleDateFormat("yyy/MM/dd");
        Date date=new Date();
        System.out.println(a.format(date));
        System.out.println("======================");
        DateTimeFormatter newFormatter=DateTimeFormatter.ofPattern("yyy/MM/dd");
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(newFormatter));
    }

    public String Translate(String str)
    {
        String s="";
        try{
            s=new String(str.getBytes("iso-8859-1"),"UTF-8");
            s=str.trim();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return s;
    }
}
