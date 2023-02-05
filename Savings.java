public class Savings extends Account {
    public Savings() {
        Account savings = new Account();
    }

    void interest(double balance){
        double interest = balance * 0.15F;
        double newTotal = balance + interest;

        System.out.println("Customer earned " + interest + " in interest");
    }

    @Override
    void withdrawal(double balance, double withdraw) {
        balance -= withdraw;

        if(balance < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            balance -= 10;
        }
    }

    @Override
    void deposit(double balance, double deposit) {
        int depositCount = 0;
        balance += deposit;
        depositCount++;
        System.out.println("This is deposit " + depositCount);

        if (depositCount >= 6) {
            System.out.println("Charging a fee of $10");
            balance -= 10;
        }
    }
}
