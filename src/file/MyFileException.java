package file;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileException {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw.txt");) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}