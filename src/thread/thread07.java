package thread;

/**
 * 强行中断
 */

public class thread07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.stop();
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i= 0; i< 10; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}