package Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 1.�������ն��׽��ֶ���
        DatagramSocket ds = new DatagramSocket(10086);
        // 2.�������ݰ����ڽ�������
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        while(true){
            ds.receive(dp);
            // 3.�������ݰ������������
            System.out.println("�����ǣ�" + new String(dp.getData(), 0, dp.getLength()));
            // 4.�رմ����ݰ����׽���

        }

    }
}