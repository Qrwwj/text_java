package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/17 20:30
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo19_1 {
   static class ShouJi{
        private String name;
        private int price;

        public ShouJi(){}

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

        public int getPrice(){
            return price;
        }

        public void setPrice(int price){
            this.price=price;
        }
    }
   static   class ShouJiDemo{
        public static void main(String[]args){
            ShouJi s=new ShouJi();
            s.setName("华为");
            s.setPrice(4999);
            System.out.println(s.getName()+"手机价值"+s.getPrice()+"元");
        }
    }
}
