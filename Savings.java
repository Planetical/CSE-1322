public class Savings extends Account {
    private int depositCount = 0;
    public Savings() {
        Account savings = new Account();
    }

    void interest(double balance){
        double interest = getBalance() * 0.15F;
        System.out.println("Customer earned " + interest + " in interest");
        deposit(interest);
    }

    @Override
    void withdrawal(double withdraw) {
        super.withdrawal(withdraw);

        if(getBalance() < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(10);
        }
    }

    @Override
    void deposit(double deposit) {
        super.deposit(deposit);
        depositCount++;
        System.out.println("This is deposit " + depositCount);

        if (depositCount >= 6) {
            System.out.println("Charging a fee of $10");
            super.withdrawal(10);
        }
    }
}
