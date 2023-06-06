package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemoPractice {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 10086);
            ds.send(dp);
        }
        ds.close();
    }
}



