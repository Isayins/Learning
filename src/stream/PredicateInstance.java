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

    // 定义一个方法,对给定的参数进行判断
    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    // 定义一个方法,返回一个逻辑的否定,对应逻辑非
    private static boolean checkStringNot(String s, Predicate<String> pre) {
        return pre.negate().test(s);
    }

    // 定义一个方法,返回一个组合判断,对应短路与
    private static boolean checkStringAnd(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

    // 定义一个方法,返回一个组合判断,对应短路或
    private static boolean checkStringOr(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
    }


}
