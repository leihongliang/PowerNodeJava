package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的三种方法
 * 获取到线程结果
 * 主线程会阻塞，一直要等待t线程结束返回结果才行
 */
public class thread11 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("begin");
                Thread.sleep(1000*10);
                System.out.println("end");
                int a=1;
                int b=2;
                return a+b;
            }
        });
        // 创建线程对象
        Thread t = new Thread(task);
        t.start();
        // 这里是main方法，这是在主线程中，get()方法会导致当前线程阻塞
        Object obj = task.get();
        System.out.println(obj);
        // 要等待十秒钟
        System.out.println("main thread");
    }
}
