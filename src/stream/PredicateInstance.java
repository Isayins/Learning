package stream;

import java.util.function.Predicate;

public class PredicateInstance {
    public static void main(String[] args) {
        boolean b1 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkStringNot("helloworld", s -> s.length() > 8);
        System.out.println(b2);
        boolean b3 = checkStringAnd("helloworld", s -> s.length() > 8,s -> s.length() < 10);
        System.out.println(b3);
        boolean b4 = checkStringOr("helloworld", s -> s.length() > 8,s -> s.length() < 10);
        System.out.println(b4);
    }

    // ����һ������,�Ը����Ĳ��������ж�
    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    // ����һ������,����һ���߼��ķ�,��Ӧ�߼���
    private static boolean checkStringNot(String s, Predicate<String> pre) {
        return pre.negate().test(s);
    }

    // ����һ������,����һ������ж�,��Ӧ��·��
    private static boolean checkStringAnd(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    // ����һ������,����һ������ж�,��Ӧ��·��
    private static boolean checkStringOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
    }


}
