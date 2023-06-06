package practice;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemoPractice {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));;
        }
    }
}
