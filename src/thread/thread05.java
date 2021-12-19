package thread;

/**
 * 线程会进入休眠状态吗？
 */
public class thread05 {
    public static void main(String[] args) {
        Thread t = new MyThread1();
        t.start();
        try {
            t.sleep(5000);// main休眠，Thread不会受到任何影响
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");


    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i= 0; i< 10; i++){
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
