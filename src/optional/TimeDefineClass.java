package optional;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TimeDefineClass {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 05, 05);

        /**
         * 描述：通过localDate.format方法格式化，格式可以是内置的也可以是自定义的
         */
        // 内置格式
        String s1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);

        // 自定义格式
        String s2 = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(s2);


        /**
         * 描述：通过LocalDate.parse方法解析，格式可以是内置的也可以是自定义的
         */

        // 内置格式
        LocalDate localDate1 = LocalDate.parse("2019-09-12", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate1);

        // 自定义格式
        LocalDate localDate2 = LocalDate.parse("2019-09-12", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate2);


        /**
         * 	描述：ZonedDate、ZonedTime、ZonedDateTime
         */
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zdt);
    }
}
