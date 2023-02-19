import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Customer> list= new ArrayList<>();
        menu(list);
    }

    public static void menu(ArrayList<Customer> list) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;
        do {
            System.out.println("1. Take test for new license" +
                    "\n2. Renew existing license" +
                    "\n3. Move from out of state" +
                    "\n4. Answer citation/suspended license" +
                    "\n5. See current queue" +
                    "\n6. Quit"
            );
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("What is your name? ");
                    String name = sc.next();
                    System.out.println("What is your date of birth? ");
                    String dateOfBirth = sc.next();
                    list.add(new NewTest(name,dateOfBirth));
                    break;
                case 2:
                    System.out.println("What is your name? ");
                    name = sc.next();
                    list.add(new Renew(name));
                    break;
                case 3:
                    System.out.println("What is your name? ");
                    name = sc.next();
                    System.out.println("What state did you move from? ");
                    String state = sc.next();
                    list.add(new Move(name,state));
                    break;
                case 4:
                    System.out.println("What is your name? ");
                    name = sc.next();
                    System.out.println("What was the violation you committed? ");
                    String violation = sc.next();
                    list.add(new Suspended(name,violation));
                    break;
                case 5:
                    for(int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).getCustomerInfo());
                    }
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select a valid response.");
                    break;
            }
        } while (quit == false);
    }
}
