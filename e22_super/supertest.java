public class supertest {
    public static void main(String[] args) {
        CreditAccount ca = new CreditAccount("lhl",123,60);
        System.out.println(ca.getBalance());//不写super（）输出为0.0
        System.out.println(ca.getCredit());
        CreditAccount ca2 = new CreditAccount();

    }
}
class BankAccount{
    private String actno;
    private double balance;
    public BankAccount(){

    }

    public BankAccount(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class CreditAccount extends BankAccount{
    private double credit;//子类特有
    public CreditAccount(String actno,double balance,double credit){
//        私有属性只能在本类中访问
//        this.actno = actno;
//        this.balance = balance;
        super(actno, balance);//没有会调用无参的构造方法赋默认值,我自己调用有参的那个
        this.credit = credit;

    }

    public CreditAccount() {

    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }
}