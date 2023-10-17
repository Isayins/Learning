package optional;

import java.time.Instant;

/**
 * 描述：时间戳，可以获取秒、毫秒、纳秒
 */
public class InstantClass {
    public static void main(String[] args) {
        // 创建Instant对象
        Instant instant = Instant.now();

        // 获取秒数
        long currentSecond = instant.getEpochSecond();
        System.out.println(currentSecond);

        // 获取毫秒数
        long currentMilli = instant.toEpochMilli();
        System.out.println(currentMilli);

        // 获取纳秒数
        int currentNano = instant.getNano();
        System.out.println(currentNano);
    }
}