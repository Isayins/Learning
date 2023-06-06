package thread;


class Box {
    // 定义一个成员变量，表示第几瓶牛奶
    private int milk;
    // 定义一个成员变量，表示奶箱的状态
    private boolean state = false;

    // 存储牛奶
//    public  void put(int milk) {
    public synchronized void put(int milk) {
        // 如果有牛奶，等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工送第" + this.milk + "瓶奶");
        // 生产完毕之后，修改奶箱状态
        state = true;
        // 唤醒其它等待的线程
        notifyAll();
    }

    // 获取牛奶
//    public  void get() {
    public synchronized void get() {
        // 如果没有牛奶，等待生产
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        // 消费完毕之后，修改奶箱状态
        state = false;
        // 唤醒其它等待的线程
        notifyAll();
    }
}

// 生产者
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

// 消费者
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