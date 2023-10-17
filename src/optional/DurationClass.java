package optional;

import java.time.Duration;
import java.time.Instant;

/**
 * ���������ڼ���������ʱ�䡱��������Ի�ȡ�졢ʱ��ʱ���֡��롢���롢����
 */
public class DurationClass {
    public static void main(String[] args) {
        Instant ins1 = Instant.now();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant ins2 = Instant.now();

        Duration duration = Duration.between(ins1, ins2);
        long days = duration.toDays();// ��
        long hours = duration.toHours();// ʱ
        long minutes = duration.toMinutes();// ��
        long seconds = duration.getSeconds();// ��
        long millis = duration.toMillis();// ����
        long nanos = duration.toNanos();// ����

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);
    }
}