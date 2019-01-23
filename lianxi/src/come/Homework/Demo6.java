package come.Homework;
//使用while循环求式子2+22+222+2222+22222的和。p=p*10+2;
public class Demo6 {
    public static void main(String[]args){
        int i=2,sum=0;
        while (i<222222){
            sum=sum+i;
            i=i*10+2;
        }
        System.out.println("2+22+222+2222+22222的和为："+sum);
    }


}
