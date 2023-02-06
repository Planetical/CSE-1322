public class Checking extends Account {
    public Checking(double balance) {
        super(balance);
    }


    @Override
    void withdrawal(double withdraw) {
        super.withdrawal(withdraw);

        if(getBalance() < 0) {
            super.withdrawal(20);
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
        }
    }
}
