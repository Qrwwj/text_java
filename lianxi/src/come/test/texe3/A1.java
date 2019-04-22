package come.test.texe3;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class A1 {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(format.format(date));
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        calendar.add(Calendar.MONTH, 5);
        System.out.println(calendar.get(Calendar.MONTH));


        int []arr=new int[10];
        Random random = new Random();
        int a = random.nextInt(100);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

    }





    }
}
