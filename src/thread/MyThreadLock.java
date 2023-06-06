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
                // 获得锁
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                // 释放锁
                lock.unlock();
            }
        }
    }
}

public class MyThreadLock {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t2 = new Thread(st, "窗口2");
        Thread t1 = new Thread(st, "窗口1");

        Thread t3 = new Thread(st, "窗口3");
        t2.start();
        t1.start();

        t3.start();
    }
}