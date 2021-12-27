package thread.threadsafe2;

/**
 * doOther方法执行的时候需要等待soSome方法结束吗？
 * 不同对象，但doSome和doOther都有static
 * 需要等待，其回去寻找类锁
 */
public class test2 {
    public static void main(String[] args) {
        Myclass2 mc1 = new Myclass2();
        Myclass2 mc2 = new Myclass2();
        Thread t1 = new MyThread2(mc1);
        Thread t2 = new MyThread2(mc2);

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
class MyThread2 extends Thread{
    private Myclass2 mc;
    public MyThread2(Myclass2 mc){
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

class Myclass2 {
    // 锁this
    public synchronized static void doSome(){
        System.out.println("dosome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    // 不需要获取对象锁
    public synchronized static void doOther(){
        System.out.println("doother begin");
        System.out.println("doother over");
    }

}

