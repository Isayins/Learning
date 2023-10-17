package optional;

import java.time.Duration;
import java.time.Instant;

/**
 * 描述：用于计算两个“时间”间隔，可以获取天、时、时、分、秒、毫秒、纳秒
 */
public class DurationClass {
    public static void main(String[] args) {
        Instant ins1 = Instant.now();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant ins2 = Instant.now();

        Duration duration = Duration.between(ins1, ins2);
        long days = duration.toDays();// 天
        long hours = duration.toHours();// 时
        long minutes = duration.toMinutes();// 分
        long seconds = duration.getSeconds();// 秒
        long millis = duration.toMillis();// 毫秒
        long nanos = duration.toNanos();// 纳秒

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);
    }
}