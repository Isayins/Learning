package stream;

import java.util.function.Supplier;

public class supplierInstance {
    public static void main(String[] args) {

        String s = getString(()->"ÁÖÇàÏ¼");
        System.out.println(s);
        Integer i = getInteger(() -> 30);
        System.out.println(i);
    }

    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
