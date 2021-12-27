package thread.threadsafe;

/**
 * 主要是研究一下synchronized的两种使用方法
 */
public class Account {
    private String actno;
    private double balance;

    public Account(String actno, int balance) {
        this.actno = actno;
        this.balance = balance;

    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // qukuan
    public void withdraw(double money){
        // 线程同步代码块
        // this代表共享的对象
//         synchronized ("abc"){
        synchronized (this){
            // 两个栈操作堆中同一个对象
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }

/**
    // 实例方法使用synchronized，一定锁的是this，不能是其他对象，这种方法不灵活，意味着整个方法体都需要同步
    public synchronized void withdraw(double money){
        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
 **/
}
