package optional;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * 描述：本地时间，可以获取时、分、秒
 */
public class LocalTimeClass {
    public static void main(String[] args) {
        // 静态方法，获取当前时分秒
        LocalTime localTime = LocalTime.now();
        // 静态方法，获取指定时分秒
        LocalTime localTime1 = LocalTime.of(14, 14, 14);

        // 获取时、分、秒
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println("----------");

        // 获取时、分、秒
        int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
        int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);
        int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println(hour1);
        System.out.println(minute1);
        System.out.println(second1);
        System.out.println("----------");
    }
}
