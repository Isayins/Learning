package thread;


class Box {
    // ����һ����Ա��������ʾ�ڼ�ƿţ��
    private int milk;
    // ����һ����Ա��������ʾ�����״̬
    private boolean state = false;

    // �洢ţ��
//    public  void put(int milk) {
    public synchronized void put(int milk) {
        // �����ţ�̣��ȴ�����
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // ���û��ţ�̣�������ţ��
        this.milk = milk;
        System.out.println("���̹��͵�" + this.milk + "ƿ��");
        // �������֮���޸�����״̬
        state = true;
        // ���������ȴ����߳�
        notifyAll();
    }

    // ��ȡţ��
//    public  void get() {
    public synchronized void get() {
        // ���û��ţ�̣��ȴ�����
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // �����ţ�̣�������ţ��
        System.out.println("�û��õ���" + this.milk + "ƿ��");
        // �������֮���޸�����״̬
        state = false;
        // ���������ȴ����߳�
        notifyAll();
    }
}

// ������
class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.put(i);
        }
    }
}

// ������
class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}

public class ConsumerAndProducer {
    public static void main(String[] args) {
        Box b = new Box();
        Producer p = new Producer(b);
        Customer c = new Customer(b);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}