package file;
import java.io.IOException;
import java.io.PrintStream;

public class MyStandardPrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = System.out;
        ps.println("Hello,World");
        ps.write("Hello,World".getBytes());

        ps.close();
    }
}