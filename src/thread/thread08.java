package thread;

/**
 * 中断操作 正规方法
 */

public class thread08 {
    public static void main(String[] args) {
        MyRunnable2 r = new MyRunnable2();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
    }
}
class MyRunnable2 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i< 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}

