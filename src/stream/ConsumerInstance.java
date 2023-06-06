package stream;

import java.util.function.Consumer;

public class ConsumerInstance {
    public static void main(String[] args) {
        operatorString("林青霞", s -> System.out.println(s));
        operatorString("林青霞", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        operatorString("林青霞", s -> System.out.println(s),
                s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    // 定义一个方法,消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }

    // 定义一个方法消费同一个字符串数据一次
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
