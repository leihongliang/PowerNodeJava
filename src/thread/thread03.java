package thread;

/**
 * 方法二 匿名内部类
 */
public class thread03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i= 0;i<10000; i++) {
                    System.out.println("thread" + i);
                }
            }
        });
        t.start();
        for (int i= 0;i<10000; i++){
            System.out.println("main"+i);
        }
    }
}
