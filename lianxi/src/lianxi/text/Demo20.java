package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/18 10:22
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo20 {
    class grandpaClass{ //

        public grandpaClass(){

            System.out.println("1912年 爷爷 出生了");

        }

    }



    class fatherClass extends grandpaClass{

        public fatherClass(){

            System.out.println("1956年 爸爸 出生了");

        }

    }



    static class grandmaMotherClass{

        public grandmaMotherClass(){

            System.out.println("奶奶的妈妈 是 1890年出生的");

        }

    }



    static class gandmaClass{

        static int year = 0;

        static grandmaMotherClass nnmm = new grandmaMotherClass();

        public gandmaClass(){

            year = 1911;

            System.out.println(year + "年 奶奶 出生了");

        }



        public gandmaClass(int count){

            year += count;

            System.out.println(year + "年 奶奶的妹妹 出生了");

        }

    }



    static class motherClass{

        public motherClass(){

            System.out.println("1957年 妈妈 出生了");

        }

    }



    public static class javaclass {


        motherClass b = new motherClass();

        gandmaClass b1 = new gandmaClass();

        gandmaClass b2 = new gandmaClass(2);

        public javaclass(){

            System.out.println("1981年 我 出生了");

        }

        public static void main(String[] args) {

            // TODO Auto-generatedmethod stub

            System.out.println("mainfunction is called");

            javaclass my = new javaclass();
        }

    }
}
