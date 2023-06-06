package stream;

import java.util.function.Function;

public class FunctionInstance {
    public static void main(String[] args) {
        convert("100", s->Integer.parseInt(s));
        convert(100,i->String.valueOf(i));
        convert("100",s->Integer.parseInt(s),i->String.valueOf(i));
    }

    // ����һ������,��һ���ַ�������ת��Ϊint����,�ڿ���̨���
    private static void convert(String s, Function<String,Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    // ����һ������,��һ��int����ת��Ϊ�ַ�������,�ڿ���̨���
    private static void convert(int i ,Function<Integer,String> fun){
        String s = fun.apply(i);
        System.out.println(s);
    }

    // ����һ������,��һ���ַ���ת��Ϊint����,��һ��int����ת��Ϊ�ַ���,�ڿ���̨���
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }





}
