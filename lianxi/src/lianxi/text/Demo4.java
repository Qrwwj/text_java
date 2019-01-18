package lianxi.text;

/**
 * @Author: wwj
 * @Date: 2019/1/16 19:25
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Demo4 {
    public static void main(String[]args){
        int x = 2,y=3;

        switch(x)
        {

            case 3:
                y++;
                break;
            case 4:
                y++;
            default:
                y++;
        }

        System.out.println("y="+y);
    }
}
