package thread;

class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThreadSleep {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();
        ts1.setName("²Ü²Ù");
        ts2.setName("Áõ±¸");
        ts3.setName("ËïÈ¨");
        ts1.start();
        ts2.start();
        ts3.start();
    }
}