package thread;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("t1启动...");

            try {
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("t1等锁的过程中被打断");
                return;
            }
            try {
                System.out.println("t1获得了锁");
            }finally {
                lock.unlock();
            }
        },"t1");
        lock.lock();
        System.out.println("main获得了锁");
        t1.start();

        try {
            Thread.sleep(1000);
            t1.interrupt();
            System.out.println("main执行被打断");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }

}
