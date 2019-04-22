package come.Demo_JieKou.qiche;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class Car {

//    定义汽车的属性

    private String name;  //表示汽车的名字
    private double speed;  //表示汽车的速度


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


//    重写toString方法   方便输出car对象
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("车名"+name+",");
        sb.append("速度"+speed+",");
        return sb.toString();
    }
}

