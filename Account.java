public class Account {
    static int nextNum = 10000;
    private int account_number;
    private double balance;

    public Account() {
        this.balance = 0;
        nextNum++;
        this.account_number = nextNum;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public int getaccount_number() {
        return this.account_number;
    }

    public double getBalance() {
        return this.balance;
    }

    void setBalance(double balance) {
       this.balance = balance;
    }

    void withdrawal(double balance, double withdrawal) {
        balance -= withdrawal;
    }

    void deposit(double balance, double deposit) {
        balance += deposit;
    }
}
