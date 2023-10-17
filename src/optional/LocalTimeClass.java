package optional;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * ����������ʱ�䣬���Ի�ȡʱ���֡���
 */
public class LocalTimeClass {
    public static void main(String[] args) {
        // ��̬��������ȡ��ǰʱ����
        LocalTime localTime = LocalTime.now();
        // ��̬��������ȡָ��ʱ����
        LocalTime localTime1 = LocalTime.of(14, 14, 14);

        // ��ȡʱ���֡���
        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println("----------");

        // ��ȡʱ���֡���
        int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
        int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);
        int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println(hour1);
        System.out.println(minute1);
        System.out.println(second1);
        System.out.println("----------");
    }
}
