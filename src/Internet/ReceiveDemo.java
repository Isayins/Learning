package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 1.创建接收端套接字对象
        DatagramSocket ds = new DatagramSocket(10086);
        // 2.创建数据包用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        while(true){
            ds.receive(dp);
            // 3.解析数据包并把数据输出
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
            // 4.关闭此数据包的套接字

        }

    }
}