package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionInterface {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("cccc");
        array1.add("aaa");
        array1.add("bb");
        array1.add("d");
        System.out.println("≈≈–Ú«∞" + array1);
        Collections.sort(array1,getComparator1());
        System.out.println("≈≈–Ú∫Û" + array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("cccc");
        array2.add("aaa");
        array2.add("bb");
        array2.add("d");
        System.out.println("≈≈–Ú«∞" + array2);
        Collections.sort(array2,getComparator2());
        System.out.println("≈≈–Ú∫Û" + array2);
    }
    private static Comparator<String> getComparator1(){
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.length()-o2.length();
            }
        };
    }

    private static Comparator<String> getComparator2(){
        return (s1,s2)->s1.length()-s2.length();
    }
}
