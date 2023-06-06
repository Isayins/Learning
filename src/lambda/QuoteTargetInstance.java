package lambda;

class PrintString {
    public void printUpper(String s) {
        String s1 = s.toUpperCase();
        System.out.println(s1);
    }
}

interface Printer {
    void PrintUpperCase(String s);
}

public class QuoteTargetInstance {
    public static void main(String[] args) {
        // lambda的方法
        usePrinter(s -> System.out.println(s.toUpperCase()));
        // 引用的方法
        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
    }

    private static void usePrinter(Printer p) {
        p.PrintUpperCase("hello,world");
    }
}
