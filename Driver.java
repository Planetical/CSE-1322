import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        double balance = 0;
        Checking checking = new Checking(balance);
        Savings savings = new Savings();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Withdraw from Checking" +
                    "\n2. Withdraw from Savings" +
                    "\n3. Deposit to Checking" +
                    "\n4. Deposit to Savings" +
                    "\n5. Balance of Checking" +
                    "\n6. Balance of Savings" +
                    "\n7. Award Interest to Savings now" +
                    "\n8. Quit");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking? ");
                    double withdraw = sc.nextDouble();
                    checking.withdrawal(withdraw);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings? ");
                    withdraw = sc.nextDouble();
                    savings.withdrawal(withdraw);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    double deposit = sc.nextDouble();
                    checking.deposit(deposit);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    deposit = sc.nextDouble();
                    savings.deposit(deposit);
                    break;
                case 5:
                    System.out.println("Your balance for checking " + checking.getaccount_number() + " is " + checking.getBalance());
                    break;
                case 6:
                    System.out.println("Your balance for saving " + savings.getaccount_number() + " is " + savings.getBalance());
                    break;
                case 7:
                    savings.interest(balance);
                    break;
                case 8:
                    quit = true;
                    break;
            }
        }while (quit == false);
    }
}
