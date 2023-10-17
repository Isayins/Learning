package optional;

import java.time.LocalDate;
import java.time.Period;

/**
 * 描述：用于计算两个“日期”间隔，可以获取年、月、天、总月
 */
public class PeriodClass {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2020, 1, 21);

        Period period = Period.between(ld2, ld1);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        long totalMonths = period.toTotalMonths();

        System.out.println(years);// 年
        System.out.println(months);// 月
        System.out.println(days);// 天
        System.out.println(totalMonths);// 总月
    }
}