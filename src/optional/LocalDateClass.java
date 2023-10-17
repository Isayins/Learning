package optional;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;


/**
* Java �� java.util.Date �� java.util.Calendar �������Բ��֧
* ��ʱ�������Ҷ������̰߳�ȫ�ģ�Java 8�����ں�ʱ������� LocalDate��
* LocalTime��LocalDateTime��Instant��Duration �Լ� Period��
* ��Щ�඼������ java.time ���У��������̰߳�ȫ�ģ�LocalDate ֻ���ȡ������
* ��LocalTime ֻ���ȡʱ���룬LocalDateTime ��ȡ������ʱ���룬
* �൱�� LocalDate + LocalTime���Ƽ�ʹ��LocalDateTime
*/
public class LocalDateClass {
    public static void main(String[] args) {
        // ��̬��������ȡ��ǰ������
        LocalDate localDate = LocalDate.now();

        // ��̬����������ָ��������
        LocalDate localDate1 = LocalDate.of(2019, 9, 12);

        // ��ȡ�ꡢ�¡��ա����ڼ�
        int year = localDate.getYear();
        Month month = localDate.getMonth();
        int day = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfWeek);
        System.out.println("----------");

        // ��ȡ�ꡢ�¡��ա����ڼ�
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