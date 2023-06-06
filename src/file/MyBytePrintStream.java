package file;
import java.io.IOException;
import java.io.PrintStream;

public class MyBytePrintStream {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("ps.txt");

        ps.println(97);
        ps.write(97);

        ps.close();
    }
}


