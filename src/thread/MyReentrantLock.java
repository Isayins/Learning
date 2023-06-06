package thread;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {
    public static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("t1����...");

            try {
                lock.lockInterruptibly();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("t1�����Ĺ����б����");
                return;
            }
            try {
                System.out.println("t1�������");
            }finally {
                lock.unlock();
            }
        },"t1");
        lock.lock();
        System.out.println("main�������");
        t1.start();

        try {
            Thread.sleep(1000);
            t1.interrupt();
            System.out.println("mainִ�б����");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }

}
