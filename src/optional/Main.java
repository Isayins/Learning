package optional;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * |              ������          |                               ����                          |
 * |---------------------------- | -----------------------------------------------------------|
 * | dayOfWeekInMonth            | ����ͬһ������ÿ�ܵĵڼ���                                     |
 * | firstDayOfMonth             | ���ص��µĵ�һ��                                             |
 * | firstDayOfNextMonth         | �������µĵ�һ��                                             |
 * | firstDayOfNextYear          | ������һ��ĵ�һ��                                           |
 * | firstDayOfYear              | ���ر���ĵ�һ��                                             |
 * | firstInMonth                | ����ͬһ�����е�һ�����ڼ�                                    |
 * | lastDayOfMonth              | ���ص��µ����һ��                                          |
 * | lastDayOfNextMonth          | �������µ����һ��                                          |
 * | lastDayOfNextYear           | ������һ������һ��                                        |
 * | lastDayOfYear               | ���ر�������һ��                                         |
 * | lastInMonth                 | ����ͬһ���������һ�����ڼ�                                |
 * | next / previous             | ���غ�һ��/ǰһ�����������ڼ�                              |
 * | nextOrSame / previousOrSame | ���غ�һ��/ǰһ�����������ڼ���������ֵ����������ֱ�ӷ���      |
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JULY, 21, 12, 30, 32);
        // ����һ��
        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plus(1, ChronoUnit.YEARS);
        System.out.println(localDateTime);
        System.out.println("----------");

        // ����һ��
        localDateTime = localDateTime.minusYears(1);
        localDateTime = localDateTime.minus(1, ChronoUnit.YEARS);
        System.out.println(localDateTime);
        System.out.println("----------");

        // ָ�����
        localDateTime = localDateTime.withYear(2020);
        localDateTime = localDateTime.with(ChronoField.YEAR, 2020);
        System.out.println(localDateTime);
        System.out.println("----------");

        // ��ȡ����ĵ�һ��
        localDateTime = localDateTime.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(localDateTime);
        System.out.println("----------");

        // �Զ��壺��һ��������
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