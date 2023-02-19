import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the Fibonacci Series for: ");
        int num = sc.nextInt();

        System.out.println("Fib of 10 by iteration is: " + new FibIteration().calculate_fix(num));
        System.out.println("Fib of 10 by formula is: " + new FibFormula().calculate_fix(num));
    }
}
