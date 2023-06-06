package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamInstance {
    public static void main(String[] args) {
        // Collection��ϵ�ļ���ֱ��������
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();  // ˳����
        Stream<String> parallelStream = list.parallelStream();  // ������
        HashSet<String> set = new HashSet<>();
        Stream<String> setStream = set.stream(); // ˳����
        Stream<String> parallelSetStream = set.parallelStream(); // ������

        // Map��ϵ�ļ��ϼ��������
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream(); // ˳����
        Stream<String> parallelkeyStream = map.keySet().parallelStream(); // ������
        Stream<Integer> valueStream = map.values().stream(); // ˳����
        Stream<Integer> parallelvalueStream = map.values().parallelStream(); // ������
        Stream<Map.Entry<String,Integer>> entrySetStream = map.entrySet().stream(); // ˳����
        Stream<Map.Entry<String,Integer>> parallelEntrySetStream = map.entrySet().parallelStream(); // ������
    }

}
