package come.demo_yundong;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class PingPangPlayer extends Player implements SpeckEnglis {

    public PingPangPlayer(){}

    public PingPangPlayer(String name,int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("乒乓球运动员吃：");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学：");
    }



    @Override
    public void spack() {
        System.out.println("乒乓球运动员说英语！");
    }
}
