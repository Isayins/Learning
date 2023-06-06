package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("张三");
        list.add("李四");
        list.add("李四");
        list.add("王五");
        list.add("王五");
        System.out.println(list.toString());

        String s = list.get(0);
        System.out.println(s);

        list.set(2,"xiaoqi");
        System.out.println(list.toString());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s1 : list) {
            System.out.println(s1+"s1");
        }
        list.removeAll(list);

//        list.clear();
        System.out.println("list"+list);

    }
}
