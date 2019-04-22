package come.jichubiancheng;

import java.io.IOException;
import java.net.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */

//发送端代码
public class udp {
    public static void main(String[]args) throws IOException {
//        建立udp服务，发送端并没有指定端口，会自动分配一个端口
        DatagramSocket ds=new DatagramSocket();
//        定义数据内容，并将数据封装成数据包
        byte [] bys="hello,udp,我来了".getBytes();
//        发送必须明确主机所在它有地址和端口
        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("wwj"),18830);
//        通过udp的socket服务中的功能完成数据包的发送
        ds.send(dp);
//        关闭资源
        ds.close();

    }
}
