package stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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

        // 数组可以通过Arrays类的静态方法Arrays.stream(T[] array)生成流
        int[] intArray = { 10, 20, 30 };
        IntStream intStream = Arrays.stream(intArray);// 顺序流
        IntStream parallelIntStream = intStream.parallel();// 并行流
        long[] longArray = { 10L, 20L, 30L };
        LongStream longStream = Arrays.stream(longArray);// 顺序流
        LongStream parallelLongStream = longStream.parallel();// 并行流
        double[] doubleArray = { 10.1, 20.2, 30.3 };
        DoubleStream doubleStream = Arrays.stream(doubleArray);// 顺序流
        DoubleStream parallelDoubleStream = doubleStream.parallel();// 并行流

        // 数组可以通过Stream接口的静态方法Stream.of(T... values)生成流
        Stream<String> strArrayStream = Stream.of("hello", "world", "java");// 顺序流
        Stream<String> parallelStrArrayStream = strArrayStream.parallel();// 并行流
        Stream<Integer> intArrayStream = Stream.of(10, 20, 30);// 顺序流
        Stream<Integer> parallelIntArrayStream = intArrayStream.parallel();// 并行流
        Stream<Long> longArrayStream = Stream.of(10L, 20L, 30L);// 顺序流
        Stream<Long> parallelLongArrayStream = longArrayStream.parallel();// 并行流
        Stream<Double> doubleArrayStream = Stream.of(10.1, 20.2, 30.3);// 顺序流
        Stream<Double> parallelDoubleArrayStream = doubleArrayStream.parallel();// 并行流

        // 创建无限流
        Stream<Integer> iterateStream = Stream.iterate(0, i -> i + 2);
        iterateStream.limit(10).forEach(System.out::println);
        Stream<UUID> generateStream = Stream.generate(UUID::randomUUID);
        generateStream.limit(10).forEach(System.out::println);


    }

}
