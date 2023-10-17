package optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 描述：本地日期时间，可以获取年、月、日、时、分、秒、纳秒
 */
public class LocalDateTimeClass {
    public static void main(String[] args) {
        // 静态方法，根据当前时间创建对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("----------");

        // 静态方法，根据指定时间创建对象
        LocalDateTime ld2 = LocalDateTime.of(2015, 10, 10, 01, 02, 03);
        System.out.println(ld2);
        System.out.println("----------");

        /**
         * plusYears plusMonths plusWeeks plusDays
         */
        LocalDateTime ldt3 = ld2.plusYears(20);
        System.out.println(ldt3);
        System.out.println("----------");

        /**
         * minusYears minusMonths minusWeeks minusDays
         */
        LocalDateTime ldt4 = ld2.minusMonths(2);
        System.out.println(ldt4);
        System.out.println("----------");

        System.out.println(ldt.getYear());// 年
        System.out.println(ldt.getMonthValue());// 月
        System.out.println(ldt.getDayOfMonth());// 日
        System.out.println(ldt.getHour());// 时
        System.out.println(ldt.getMinute());// 分
        System.out.println(ldt.getSecond());// 秒
        System.out.println(ldt.getNano());// 纳秒
        System.out.println("----------");

        // 获取LocalDate
        LocalDate localDate = ldt.toLocalDate();
        System.out.println(localDate.now());
        System.out.println("----------");

        // 获取LocalTime
        LocalTime localTime = ldt.toLocalTime();
        System.out.println(localTime.now());
        System.out.println("----------");
    }
}