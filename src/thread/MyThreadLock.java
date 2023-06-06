package thread;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // �����
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                    tickets--;
                }
            } finally {
                // �ͷ���
                lock.unlock();
            }
        }
    }
}

public class MyThreadLock {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t2 = new Thread(st, "����2");
        Thread t1 = new Thread(st, "����1");

        Thread t3 = new Thread(st, "����3");
        t2.start();
        t1.start();

        t3.start();
    }
}