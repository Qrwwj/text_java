package come.Homework;
//	搬砖问题：36块砖，36人搬，男人搬4块，女人搬3块，两个小孩抬1块。要求一次搬完，问需要男人、女人、小孩各几人？

//思路：首先定义三个变量分别代表男 女 孩子（男+女+孩子=36）
// 4*a+3*b+c/2=36
//两个小孩抬1块->孩子个数必须是偶数
public class Demo10 {
    public static void main(String[]ages){
//        定义四个不同变量分别代表男人 女人 孩子 砖头
        int m,w,b;
        for (m=0;m<=9;m++){
            for (w=0;w<=12;w++){
                for (b=0;b<=36;b+=2){
                    if (4*m+3*w+b/2==36&&m+w+b==36){
                        System.out.println(m+"个男人"+w+"个女人"+b+"个孩子");
                    }
                }
            }

        }
    }
}
