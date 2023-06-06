package file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyByteStream {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
    }

    // 基本字符流一次读写一个字符
    public static void method1() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Recourse\\demo.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Recourse\\out.txt"));

        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write(ch);
        }

        osw.close();
        isr.close();
    }

    // 基本字符流一次读写一个字符数组
    public static void method2() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Recourse\\demo.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Recourse\\out.txt"));

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }

        osw.close();
        isr.close();
    }

    // 文件字符流一次读写一个字符
    public static void method3() throws IOException {
        FileReader fr = new FileReader("D:\\Recourse\\demo.txt");
        FileWriter fw = new FileWriter("D:\\Recourse\\out.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }

    // 文件字符流一次读写一个字符数组
    public static void method4() throws IOException {
        FileReader fr = new FileReader("D:\\Recourse\\demo.txt");
        FileWriter fw = new FileWriter("D:\\Recourse\\out.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }

    // 字符缓冲流一次读写一个字符
    public static void method5() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Recourse\\demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Recourse\\out.txt"));

        int ch;
        while ((ch = br.read()) != -1) {
            bw.write(ch);
        }

        bw.close();
        br.close();
    }

    // 字符缓冲流一次读写一个字符数组
    public static void method6() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Recourse\\demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Recourse\\out.txt"));

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();
    }

    // 字符缓冲流特有功能复制文本文件
    public static void method7() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Recourse\\demo.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Recourse\\out.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}