package thread.threadsafe;

public class Account {
    private String actne;
    private double balance;

    public String getActne() {
        return actne;
    }

    public void setActne(String actne) {
        this.actne = actne;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // qukuan
    public void withdraw(double money){
        double before = this.getBalance();
        double after = before - money;
        this.setBalance(after);

    }
}
