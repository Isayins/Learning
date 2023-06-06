package lambda;
interface Converter{
    int convert(String s);
}
public class QuoteClass {
    public static void main(String[] args) {
        // lambda写法
        useConverter(s -> Integer.parseInt(s));
        // 引用的方法
        useConverter(Integer::parseInt);

    }

    public static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);

    }
}
