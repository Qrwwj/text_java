package come.Demo_JieKou.qiche;

import java.awt.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class GPSCar extends Car implements Car_JieKou {
    @Override
//    利用汽车的速度来对汽车进行监控
    public Point getLocation() {
        Point point=new Point();
        point.setLocation(super.getSpeed(),super.getSpeed());
        return point;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(super.toString());

        sb.append(" 坐标：("+getLocation().x+","+getLocation().y+")");
        return sb.toString();
    }
}
