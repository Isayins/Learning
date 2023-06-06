package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议：用户数据报协议(User Datagram Protocol)，无连接通讯协议，但不能保证传输数据完整性，常用于音频、视频、普通数据传输等
 *
 * ### 发送数据
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 1.创建发送端套接字对象
        DatagramSocket ds = new DatagramSocket();
        // 2.创建数据并把数据打包
        byte[] bys = "Hello,World!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("10.1.15.171"), 10086);
        // 3.从此套接字发送数据包
        ds.send(dp);
        // 4.关闭此数据包的套接字
        ds.close();
    }
}