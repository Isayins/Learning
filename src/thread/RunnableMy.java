package thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class RunnableMy {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my, "�߳�һ");
        Thread t2 = new Thread(my, "�̶߳�");
        t1.start();
        t2.start();
    }
}