package thread;

/**
 * interrupt
 */
public class thread06 {
    public static void main(String[] args) {
        Thread t = new MyThread2();
        t.start();
        System.out.println("1");
        try {
            t.sleep(1000);// t.sleep()和Thread.sleep()都是让main休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2");
        t.interrupt();// 一秒后就输出“Thread”
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread");// 五秒后就输出“Thread”
    }
}