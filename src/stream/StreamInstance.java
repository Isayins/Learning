package stream;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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

        // �������ͨ��Arrays��ľ�̬����Arrays.stream(T[] array)������
        int[] intArray = { 10, 20, 30 };
        IntStream intStream = Arrays.stream(intArray);// ˳����
        IntStream parallelIntStream = intStream.parallel();// ������
        long[] longArray = { 10L, 20L, 30L };
        LongStream longStream = Arrays.stream(longArray);// ˳����
        LongStream parallelLongStream = longStream.parallel();// ������
        double[] doubleArray = { 10.1, 20.2, 30.3 };
        DoubleStream doubleStream = Arrays.stream(doubleArray);// ˳����
        DoubleStream parallelDoubleStream = doubleStream.parallel();// ������

        // �������ͨ��Stream�ӿڵľ�̬����Stream.of(T... values)������
        Stream<String> strArrayStream = Stream.of("hello", "world", "java");// ˳����
        Stream<String> parallelStrArrayStream = strArrayStream.parallel();// ������
        Stream<Integer> intArrayStream = Stream.of(10, 20, 30);// ˳����
        Stream<Integer> parallelIntArrayStream = intArrayStream.parallel();// ������
        Stream<Long> longArrayStream = Stream.of(10L, 20L, 30L);// ˳����
        Stream<Long> parallelLongArrayStream = longArrayStream.parallel();// ������
        Stream<Double> doubleArrayStream = Stream.of(10.1, 20.2, 30.3);// ˳����
        Stream<Double> parallelDoubleArrayStream = doubleArrayStream.parallel();// ������

        // ����������
        Stream<Integer> iterateStream = Stream.iterate(0, i -> i + 2);
        iterateStream.limit(10).forEach(System.out::println);
        Stream<UUID> generateStream = Stream.generate(UUID::randomUUID);
        generateStream.limit(10).forEach(System.out::println);


    }

}
