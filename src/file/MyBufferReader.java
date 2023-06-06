package file;

import java.io.*;

public class MyBufferReader {
    public static void main(String[] args) throws IOException {
//        method1();
        method2();
//        method3();
//        method4();
    }

    // 基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Recourse\\demo.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Recourse\\out.txt");


        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
            System.out.println(by);
        }

        fos.close();
        fis.close();
    }


    // 基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Recourse\\demo.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Recourse\\out.txt");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
            String s = bys.toString();
            System.out.println(s);
        }

        fos.close();
        fis.close();
    }

    // 字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Recourse\\demo.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Recourse\\out.txt"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    // 字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Recourse\\demo.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Recourse\\out.txt"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
