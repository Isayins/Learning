package stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamInstance {
    public static void main(String[] args) {
        // Collection体系的集合直接生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();  // 顺序流
        Stream<String> parallelStream = list.parallelStream();  // 并行流
        HashSet<String> set = new HashSet<>();
        Stream<String> setStream = set.stream(); // 顺序流
        Stream<String> parallelSetStream = set.parallelStream(); // 并行流

        // Map体系的集合间接生成流
        HashMap<String, Integer> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream(); // 顺序流
        Stream<String> parallelkeyStream = map.keySet().parallelStream(); // 并行流
        Stream<Integer> valueStream = map.values().stream(); // 顺序流
        Stream<Integer> parallelvalueStream = map.values().parallelStream(); // 并行流
        Stream<Map.Entry<String,Integer>> entrySetStream = map.entrySet().stream(); // 顺序流
        Stream<Map.Entry<String,Integer>> parallelEntrySetStream = map.entrySet().parallelStream(); // 并行流
    }

}
