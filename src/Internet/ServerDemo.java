package Internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // ����������Socket����
        ServerSocket ss = new ServerSocket(10086);
        // �����ͻ��˵����Ӷ���
        Socket s = ss.accept();
        // ��ȡ�ϴ��ļ��������
        String fileName = "src\\" + System.currentTimeMillis() + new Random().nextInt(999999) + ".java";
        // ����ͻ����ϴ�������
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        // ���ͻ��˷���������Ϣ
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("�ļ��ϴ��ɹ�");
        bwServer.newLine();
        bwServer.flush();
        // �ͷ���Դ
        bos.close();
        ss.close();
    }
}