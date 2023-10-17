package optional;

import java.time.Instant;

/**
 * ������ʱ��������Ի�ȡ�롢���롢����
 */
public class InstantClass {
    public static void main(String[] args) {
        // ����Instant����
        Instant instant = Instant.now();

        // ��ȡ����
        long currentSecond = instant.getEpochSecond();
        System.out.println(currentSecond);

        // ��ȡ������
        long currentMilli = instant.toEpochMilli();
        System.out.println(currentMilli);

        // ��ȡ������
        int currentNano = instant.getNano();
        System.out.println(currentNano);
    }
}