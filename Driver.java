import java.util.Scanner;
public class Driver {
     public static void main(String[] args) {
         boolean quit = false;
         Scanner sc = new Scanner(System.in);
         do{
             System.out.println("0 - Exit" +
                     "\n1 - Addition" +
                     "\n2 - Subtraction" +
                     "\n3 - Multiplication" +
                     "\n4 - Division");
             System.out.println("Please choose an option: ");
             int choice = sc.nextInt();
             if (choice == 0) {
                 quit = true;
                 break;
             }
             System.out.println("Please enter the first number ");
             float first = sc.nextFloat();
             System.out.println("Please enter the second number ");
             float second = sc.nextFloat();
             Calculator calculator = new Calculator();
             if(choice == 1) {
                 System.out.println(calculator.add(first,second));
             } else if (choice == 2) {
                 System.out.println(calculator.subtract(first,second));
             } else if (choice == 3) {
                 System.out.println(calculator.multiply(first,second));
             } else if (choice == 4) {
                 System.out.println(calculator.division(first,second));
             }
         }while (quit == false);
     }

}
