package optional;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;


/**
* Java 的 java.util.Date 和 java.util.Calendar 类易用性差，不支
* 持时区，而且都不是线程安全的，Java 8的日期和时间类包含 LocalDate、
* LocalTime、LocalDateTime、Instant、Duration 以及 Period，
* 这些类都包含在 java.time 包中，它们是线程安全的，LocalDate 只会获取年月日
* ，LocalTime 只会获取时分秒，LocalDateTime 获取年月日时分秒，
* 相当于 LocalDate + LocalTime，推荐使用LocalDateTime
*/
public class LocalDateClass {
    public static void main(String[] args) {
        // 静态方法，获取当前年月日
        LocalDate localDate = LocalDate.now();

        // 静态方法，构造指定年月日
        LocalDate localDate1 = LocalDate.of(2019, 9, 12);

        // 获取年、月、日、星期几
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int day = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);
        System.out.println("----------");

        // 获取年、月、日、星期几
        int year1 = localDate.get(ChronoField.YEAR);
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println(year1);
        System.out.println(month1);
        System.out.println(day1);
        System.out.println(dayOfWeek1);
    }
}