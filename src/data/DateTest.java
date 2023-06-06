package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println("s = " + s);
        Date parse = sdf.parse(s);
        System.out.println("parse = " + parse);
        System.out.println("d = " + d);
        System.out.println("sdf = " + sdf);
    }
}
