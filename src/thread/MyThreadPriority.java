package thread;

class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

public class MyThreadPriority {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();
        // 设置线程的名称
        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");
        // 返回线程优先级
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());
        // 设置线程优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);
        // 启动所有的线程
        tp1.start();
        tp2.start();
        tp3.start();
    }
}