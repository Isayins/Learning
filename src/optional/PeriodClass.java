package optional;

import java.time.LocalDate;
import java.time.Period;

/**
 * ���������ڼ������������ڡ���������Ի�ȡ�ꡢ�¡��졢����
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

        System.out.println(years);// ��
        System.out.println(months);// ��
        System.out.println(days);// ��
        System.out.println(totalMonths);// ����
    }
}