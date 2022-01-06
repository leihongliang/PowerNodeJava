package thread;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

/**
 * 【难】生产者消费者模式
 * example：
 * list集合只能有一个元素，生产一个消费一个
 */
public class thread12 {
    public static void main(String[] args) {
        List list = new ArrayList(1);
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("producer thread");
        t2.setName("consumer thread");

        t1.start();
        t2.start();
    }
}
class Producer implements Runnable{
    private List list;
    public Producer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        // 一直生产
        while (true) {
            synchronized (list){
                // 判定是否执行
                if (list.size() > 0){
                    try {
                        // 当前线程进入等待状态，并释放当前对象list的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + obj);
                // 唤醒消费者消费
                list.notify();
            }
        }
    }
}
class Consumer implements Runnable{
    private List list;
    public Consumer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        // 一直消费
        while (true) {
            synchronized (list){
                // 判定是否执行
                if (list.size() == 0){
                    try {
                        // 当前线程进入等待状态，并释放当前对象list的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName() + obj);
                // 唤醒生产者生产
                list.notify(); // 不会释放锁
            }
        }
    }
}
