package stream;

import java.util.function.Consumer;

public class ConsumerInstance {
    public static void main(String[] args) {
        operatorString("����ϼ", s -> System.out.println(s));
        operatorString("����ϼ", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        operatorString("����ϼ", s -> System.out.println(s),
                s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    // ����һ������,����ͬһ���ַ�����������
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(name);
    }

    // ����һ����������ͬһ���ַ�������һ��
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
