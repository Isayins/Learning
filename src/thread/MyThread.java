package thread;


class MyThreadClass extends Thread {
    @Override
    public  void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThreadClass my1 = new MyThreadClass();
        MyThreadClass my2 = new MyThreadClass();
        my1.setName("�߳�һ");
        my2.setName("�̶߳�");
        my1.start();
        my2.start();
    }
}