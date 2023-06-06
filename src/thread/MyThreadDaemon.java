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
        td1.setName("����");
        td2.setName("�ŷ�");
        // �������߳�Ϊ����
        Thread.currentThread().setName("����");
        // �����ػ��߳�
        td1.setDaemon(true);
        td2.setDaemon(true);
        // �����ػ��߳�
        td1.start();
        td2.start();
        // ִ�����̵߳��߼�
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}