package thread.threadsafe;

public class AccountThread extends Thread{
    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    // 两个线程共享一个账户对象
    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);
        System.out.println("操作线程："+Thread.currentThread().getName()+" | 账户:"+account.getActno()+"| 取款："+money+" | 余额"+account.getBalance());
    }
}
