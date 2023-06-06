package data;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i = calendar.get(java.util.Calendar.YEAR);
        int i1 = calendar.get(java.util.Calendar.MONTH) + 1 ;
        int i2 = calendar.get(java.util.Calendar.DATE);
        int i3 = calendar.get(java.util.Calendar.HOUR);
        int i4 = calendar.get(java.util.Calendar.MINUTE);
        int i5 = calendar.get(java.util.Calendar.SECOND);
        System.out.println(i + "-" + i1 +"-" + i2 + " " + i3 + ":" + i4 + ":" + i5 );
    }
}
