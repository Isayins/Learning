package lambda;
interface Converter{
    int convert(String s);
}
public class QuoteClass {
    public static void main(String[] args) {
        // lambdaд��
        useConverter(s -> Integer.parseInt(s));
        // ���õķ���
        useConverter(Integer::parseInt);

    }

    public static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);

    }
}
