package thread;

class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

public class MyThreadDaemon {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        td1.setName("关羽");
        td2.setName("张飞");
        // 设置主线程为刘备
        Thread.currentThread().setName("刘备");
        // 设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);
        // 启动守护线程
        td1.start();
        td2.start();
        // 执行主线程的逻辑
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}