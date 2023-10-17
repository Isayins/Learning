package optional;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * |              方法名          |                               描述                          |
 * |---------------------------- | -----------------------------------------------------------|
 * | dayOfWeekInMonth            | 返回同一个月中每周的第几天                                     |
 * | firstDayOfMonth             | 返回当月的第一天                                             |
 * | firstDayOfNextMonth         | 返回下月的第一天                                             |
 * | firstDayOfNextYear          | 返回下一年的第一天                                           |
 * | firstDayOfYear              | 返回本年的第一天                                             |
 * | firstInMonth                | 返回同一个月中第一个星期几                                    |
 * | lastDayOfMonth              | 返回当月的最后一天                                          |
 * | lastDayOfNextMonth          | 返回下月的最后一天                                          |
 * | lastDayOfNextYear           | 返回下一年的最后一天                                        |
 * | lastDayOfYear               | 返回本年的最后一天                                         |
 * | lastInMonth                 | 返回同一个月中最后一个星期几                                |
 * | next / previous             | 返回后一个/前一个给定的星期几                              |
 * | nextOrSame / previousOrSame | 返回后一个/前一个给定的星期几，如果这个值满足条件，直接返回      |
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JULY, 21, 12, 30, 32);
        // 增加一年
        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plus(1, ChronoUnit.YEARS);
        System.out.println(localDateTime);
        System.out.println("----------");

        // 减少一年
        localDateTime = localDateTime.minusYears(1);
        localDateTime = localDateTime.minus(1, ChronoUnit.YEARS);
        System.out.println(localDateTime);
        System.out.println("----------");

        // 指定年份
        localDateTime = localDateTime.withYear(2020);
        localDateTime = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println(localDateTime);
        System.out.println("----------");

        // 获取该年的第一天
        localDateTime = localDateTime.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(localDateTime);
        System.out.println("----------");

        // 自定义：下一个工作日
        localDateTime = localDateTime.with((l) -> {
            LocalDateTime ldt = (LocalDateTime) l;
            DayOfWeek dow = ldt.getDayOfWeek();
            if (dow.equals(DayOfWeek.FRIDAY)) {
                return ldt.plusDays(3);
            } else if (dow.equals(DayOfWeek.SATURDAY)) {
                return ldt.plusDays(2);
            } else {
                return ldt.plusDays(1);
            }
        });
        System.out.println(localDateTime);
        System.out.println("----------");
    }
}