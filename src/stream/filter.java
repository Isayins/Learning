package stream;

import java.util.ArrayList;

public class filter {
    public static void main(String[] args) {
        // ����һ�����ϣ��洢����ַ���Ԫ��
        ArrayList<String> list = new ArrayList<String>();
        list.add("����ϼ");
        list.add("������");
        list.add("������");
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("���޼�");
        list.add("���޼�");
        list.add("���޼�");
        list.stream().forEach(System.out::println);
        System.out.println("----------");
        // ����1����list���������ſ�ͷ��Ԫ���ڿ���̨���
        list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);
        System.out.println("----------");
        // ����2����list�����г���Ϊ3��Ԫ���ڿ���̨���
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("----------");
        // ����3����list���������ſ�ͷ���ҳ���Ϊ3��Ԫ���ڿ���̨���
        list.stream().filter(s -> s.startsWith("��")).filter(s -> s.length() == 3).forEach(System.out::println);

        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----------");
        // ����4������3��Ԫ�أ���ʣ�µ�Ԫ���ڿ���̨���
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("----------");
        // ����5������2��Ԫ�أ���ʣ�µ�Ԫ����ǰ2���ڿ���̨���
        list.stream().skip(2).limit(2).forEach(System.out::println);
        // ����6���Ѽ���Ԫ���ڿ���̨�����Ҫ���ַ���Ԫ�ز����ظ�
        list.stream().distinct().forEach(System.out::println);

        // ����һ�����ϣ��洢����ַ���Ԫ��
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("linqingxia");
        list1.add("zhangmanyu");
        list1.add("wangzuxian");
        list1.add("liuyan");
        list1.add("zhangmin");
        list1.add("zhangwuji");
        // ����1��������ĸ˳��������ڿ���̨���
        list1.stream().sorted().forEach(System.out::println);
        System.out.println("----------");
        // ����2�������ַ������Ȱ������ڿ���̨���
        list1.stream().sorted((s1, s2) -> {
            int num1 = s1.length() - s2.length();
            int num2 = num1 == 0 ? s1.compareTo(s2) : num1;
            return num2;
        }).forEach(System.out::println);


    }
}