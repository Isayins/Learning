package optional;


import java.util.Optional;

/**
* Optional 类是一个容器类，代表一个值存在或不存在，
* 原来用 null 表示一个值不存在，现在 Optional类
* 可以更好的表达这个概念并且可以避免[空指针异常]
* (https://so.csdn.net/so/search?q=空指针异常&spm=1001.2101.3001.7020)
*
*/
public class OptionalClass {
    public static void main(String[] args) {
        // 创建一个 Optional 实例
        Optional<String> op1 = Optional.of("Hello,World");

        // 创建一个空的 Optional 实例
        Optional<Object> op2 = Optional.empty();

        // 若参数不为 null，创建 Optional 实例，否则创建空实例
        Optional<Object> op3 = Optional.ofNullable(null);

        // 判断是否包含值
        boolean isPresent = op1.isPresent();
        System.out.println(isPresent);

        // 如果调用对象包含值，返回该值，否则返回参数
        Object orElse = op2.orElse("Hello,World");
        System.out.println(orElse);

        // 如果调用对象包含值，返回该值，否则返回 s 获取的值
        Object orElseGet = op3.orElseGet(() -> 10 + 20);
        System.out.println(orElseGet);

        // 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
        Optional<String> op4 = op1.map((s) -> s.toUpperCase());
        System.out.println(op4.get());
    }
}