package thread;

/**
 * 实现线程方法
 * 继承thread
 */
public class thread01 {
    // main方法，主线程
    public static void main(String[] args) {
        // 新建一个分支线程对象
        MyThread t = new MyThread();
        // start是启动一个分支线程，在jvm开辟一个栈空间，随即start方法结束(不结束不会执行下一行代码)
        // 同时自动调用run方法，在分支栈底部，和main平级
        t.start();
        for (int i= 0;i<1000; i++){
            // 输出结果有先有后
            System.out.println("main"+i);
        }

    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i= 0;i<1000; i++){
            System.out.println("thread"+i);
        }
    }
}