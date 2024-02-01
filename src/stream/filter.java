package stream;

import java.util.ArrayList;

public class filter {
    public static void main(String[] args) {
        // 创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张敏");
        list.add("张无忌");
        list.add("张无忌");
        list.add("张无忌");
        list.stream().forEach(System.out::println);
        System.out.println("----------");
        // 需求1：把list集合中以张开头的元素在控制台输出
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("----------");
        // 需求2：把list集合中长度为3的元素在控制台输出
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("----------");
        // 需求3：把list集合中以张开头的且长度为3的元素在控制台输出
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----------");
        // 需求4：跳过3个元素，把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----------");
        // 需求5：跳过2个元素，把剩下的元素中前2个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
        // 需求6：把集合元素在控制台输出，要求字符串元素不能重复
        list.stream().distinct().forEach(System.out::println);

        // 创建一个集合，存储多个字符串元素
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("linqingxia");
        list1.add("zhangmanyu");
        list1.add("wangzuxian");
        list1.add("liuyan");
        list1.add("zhangmin");
        list1.add("zhangwuji");
        // 需求1：按照字母顺序把数据在控制台输出
        list1.stream().sorted().forEach(System.out::println);
        System.out.println("----------");
        // 需求2：按照字符串长度把数据在控制台输出
        list1.stream().sorted((s1, s2) -> {
            int num1 = s1.length() - s2.length();
            int num2 = num1 == 0 ? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);


    }
}