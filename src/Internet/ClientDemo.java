package Internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // �����ͻ���Socket����
        Socket s = new Socket("10.1.19.121", 10086);
        // ��װ�ı��ļ�������
        BufferedReader br = new BufferedReader(new FileReader("src\\internet\\ClientDemo.java"));
        // ��װ�����д������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // ���߷������ϴ�����
        s.shutdownOutput();
        // ���շ������˵ķ���
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("������������" + data);
        // �ͷ���Դ
        br.close();
        s.close();
    }
}
