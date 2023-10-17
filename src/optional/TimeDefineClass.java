package optional;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TimeDefineClass {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 05, 05);

        /**
         * ������ͨ��localDate.format������ʽ������ʽ���������õ�Ҳ�������Զ����
         */
        // ���ø�ʽ
        String s1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);

        // �Զ����ʽ
        String s2 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(s2);


        /**
         * ������ͨ��LocalDate.parse������������ʽ���������õ�Ҳ�������Զ����
         */

        // ���ø�ʽ
        LocalDate localDate1 = LocalDate.parse("2019-09-12", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        // �Զ����ʽ
        LocalDate localDate2 = LocalDate.parse("2019-09-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate2);


        /**
         * 	������ZonedDate��ZonedTime��ZonedDateTime
         */
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zdt);
    }
}
