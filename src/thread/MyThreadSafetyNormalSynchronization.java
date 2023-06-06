package thread;


//class SellTicket implements Runnable {
//    private int tickets = 100;
//
//    @Override
//    public void run() {
//        while (tickets>0) {
//            sellTicket();
//        }
//    }
//
//    private synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//            tickets--;
//        }
//    }
//}

public class MyThreadSafetyNormalSynchronization {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}