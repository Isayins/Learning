package file;
import java.io.IOException;
import java.io.PrintWriter;

public class MyCharPrintStream {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("pw.txt");

        pw.println("hello");
        pw.write("Hello");

        pw.close();
    }
}

