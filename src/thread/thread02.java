package thread;

/**
 * 实现线程方法二
 * 编写一个类实现Runnable接口
 */
public class thread02 {
    public static void main(String[] args) {
        // 创建一个可运行的对象
        MyRunnable r = new MyRunnable();
        // 将可运行的对象封装成一个线程
        Thread t = new Thread(r);
        t.start();
        for (int i= 0;i<1000; i++){
            System.out.println("main"+i);
        }

    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i= 0;i<1000; i++){
            System.out.println("thread"+i);
        }
    }
}