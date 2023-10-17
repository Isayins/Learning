package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        String[] strs = new String[]{"����","����","����"};
        System.out.println(strs);

        collection.add("����");
        collection.add("����");
        collection.add("����");
        collection.add("����");
        collection.add("����");
        collection.add("����");
        System.out.println(collection.toString());
        collection.remove("����");
        System.out.println(collection.toString());

        boolean empty = collection.isEmpty();
        System.out.println(empty);

        int size = collection.size();
        System.out.println(size);

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (String s : collection) {
            System.out.println(s);
        }
        collection.clear();
        System.out.println(collection.toString()+"111");
    }
}
