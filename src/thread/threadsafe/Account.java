package thread.threadsafe;

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
}
