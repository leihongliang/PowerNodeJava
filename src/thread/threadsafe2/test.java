package thread.threadsafe2;

/**
 * doOther方法执行的时候需要等待soSome方法结束吗?
 * 不需要，doother没有，synchronized，不需要获取对象锁，
 */
public class test {
    public static void main(String[] args) {
        Myclass mc = new Myclass();
        Thread t1 = new MyThread(mc);
        // 不同的mc就要等待
        Thread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);// 主线程睡眠。保证t1线程先执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
class MyThread extends Thread{
    private Myclass mc;
    public MyThread(Myclass mc){
        this.mc = mc;
    }
    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class Myclass {
    // 锁this
    // 加一个static
    public synchronized void doSome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    // 不需要获取对象锁
    // 加上synchronized就要等待
    public void doOther(){
        System.out.println("doother begin");
        System.out.println("doother over");
    }

}

