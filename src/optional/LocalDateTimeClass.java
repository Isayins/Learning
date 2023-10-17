package optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * ��������������ʱ�䣬���Ի�ȡ�ꡢ�¡��ա�ʱ���֡��롢����
 */
public class LocalDateTimeClass {
    public static void main(String[] args) {
        // ��̬���������ݵ�ǰʱ�䴴������
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println("----------");

        // ��̬����������ָ��ʱ�䴴������
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

        System.out.println(ldt.getYear());// ��
        System.out.println(ldt.getMonthValue());// ��
        System.out.println(ldt.getDayOfMonth());// ��
        System.out.println(ldt.getHour());// ʱ
        System.out.println(ldt.getMinute());// ��
        System.out.println(ldt.getSecond());// ��
        System.out.println(ldt.getNano());// ����
        System.out.println("----------");

        // ��ȡLocalDate
        LocalDate localDate = ldt.toLocalDate();
        System.out.println(localDate.now());
        System.out.println("----------");

        // ��ȡLocalTime
        LocalTime localTime = ldt.toLocalTime();
        System.out.println(localTime.now());
        System.out.println("----------");
    }
}