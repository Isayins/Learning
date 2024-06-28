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
        // 创建客户端Socket对象
        Socket s = new Socket("10.1.19.121", 10086);
        // 封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("src\\internet\\ClientDemo.java"));
        // 封装输出流写出数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 告诉服务器上传结束
        s.shutdownOutput();
        // 接收服务器端的反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器反馈：" + data);
        // 释放资源
        br.close();
        s.close();
    }
}
