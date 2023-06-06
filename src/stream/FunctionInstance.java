package stream;

import java.util.function.Function;

public class FunctionInstance {
    public static void main(String[] args) {
        convert("100", s->Integer.parseInt(s));
        convert(100,i->String.valueOf(i));
        convert("100",s->Integer.parseInt(s),i->String.valueOf(i));
    }

    // 定义一个方法,把一个字符串类型转换为int类型,在控制台输出
    private static void convert(String s, Function<String,Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    // 定义一个方法,把一个int类型转换为字符串类型,在控制台输出
    private static void convert(int i ,Function<Integer,String> fun){
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 定义一个方法,把一个字符串转换为int类型,把一个int类型转换为字符串,在控制台输出
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }





}
