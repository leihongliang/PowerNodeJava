package thread;

/**
 * 守护线程
 * 数据备份
 */
public class thread09 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("beifenshuju");

        // 设置t为守护线程
        t.setDaemon(true);
        t.start();

        //主线程结束后，备份线程也会结束
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() +(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BakDataThread extends Thread{
    public void run(){
        int i = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() +(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}