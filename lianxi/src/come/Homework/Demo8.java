package come.Homework;
//判断并输出500以内既能够被3整除又能够被6整除的整数。

public class Demo8 {
    public static void main(String[]args){

        for (int i=1;i<=500;i++){
            if (i%3==0&&i%6==0){
                System.out.println("500以内既能够被3整除又能够被6整除的整数有："+i);
            }

        }
    }
}
