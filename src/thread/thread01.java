package thread;

/**
 * 实现线程方法一
 * 编写一个类，直接继承thread，重写run方法
 */
public class thread01 {
    // main方法，主线程
    public static void main(String[] args) {
        // 创建线程对象
        MyThread t = new MyThread();
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);// Thread[main,5,main]
        System.out.println(t.currentThread());
        t.setName("Thread-0");
        System.out.println(t.getName());
        // start是启动一个分支线程，在jvm开辟一个栈空间，随即start方法结束(不结束不会执行下一行代码)
        // 同时自动调用run方法，在分支栈底部，和main平级
        t.start();
        System.out.println(t.currentThread());
        for (int i= 0;i<1000; i++){
            // 输出结果有先有后
            System.out.println("main"+i);
        }

    }
}
// 定义线程类
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i= 0;i<1000; i++){
            Thread t = Thread.currentThread();// Thread[Thread-0,5,main]
            System.out.println("thread"+t+i);
        }
    }
}