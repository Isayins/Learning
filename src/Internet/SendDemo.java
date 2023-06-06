package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPЭ�飺�û����ݱ�Э��(User Datagram Protocol)��������ͨѶЭ�飬�����ܱ�֤�������������ԣ���������Ƶ����Ƶ����ͨ���ݴ����
 *
 * ### ��������
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 1.�������Ͷ��׽��ֶ���
        DatagramSocket ds = new DatagramSocket();
        // 2.�������ݲ������ݴ��
        byte[] bys = "Hello,World!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("10.1.15.171"), 10086);
        // 3.�Ӵ��׽��ַ������ݰ�
        ds.send(dp);
        // 4.�رմ����ݰ����׽���
        ds.close();
    }
}