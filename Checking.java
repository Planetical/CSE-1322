public class Checking extends Account {
    public Checking() {
        Account checking = new Account();
    }

    @Override
    void withdrawal(double balance, double withdraw) {
        balance -= withdraw;

        if(getBalance() < 0) {
            balance -= 20;
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
        }
    }
}
