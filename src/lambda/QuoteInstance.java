package lambda;

interface MyString {
    String mySubString(String s, int x, int y);
}

public class QuoteInstance {
    public static void main(String[] args) {
        // lambda����
        useMyString(((s, x, y) -> s.substring(x,y)));
        // ���õķ���
        useMyString(String::substring);

    }
    private static void useMyString(MyString my){
        String string = my.mySubString("helloWorld", 2, 5);
        System.out.println(string);
    }
}
