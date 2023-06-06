package file;
import java.io.IOException;
import java.io.InputStream;

public class MyStandardInputStream {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        int by;
        while ((by = is.read()) != -1) {
            System.out.print((char) by);
        }

        is.close();
    }
}