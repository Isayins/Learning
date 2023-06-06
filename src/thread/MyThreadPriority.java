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
        // �����̵߳�����
        tp1.setName("����");
        tp2.setName("�ɻ�");
        tp3.setName("����");
        // �����߳����ȼ�
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());
        // �����߳����ȼ�
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);
        // �������е��߳�
        tp1.start();
        tp2.start();
        tp3.start();
    }
}