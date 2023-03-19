import java.util.Scanner;
public class Lab8A {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("Choose from the following: " +
                    "\n0. Quit" +
                    "\n1. Multiply 2 numbers" +
                    "\n2. Div 2 numbers" +
                    "\n3. Mod 2 numbers");
            int choice = sc.nextInt();
            if (choice == 0){
                quit = true;
            } else if (choice == 1){
                System.out.println("Enter first number");
                int one = sc.nextInt();
                System.out.println("Enter second number");
                int two = sc.nextInt();

                System.out.println("Answer: " + recursive_multiply(one,two));
            } else if (choice == 2){
                System.out.println("Enter first number");
                int one = sc.nextInt();
                System.out.println("Enter second number");
                int two = sc.nextInt();

                System.out.println("Answer: " + recursive_div(one,two));
            } else if (choice == 3){
                System.out.println("Enter first number");
                int one = sc.nextInt();
                System.out.println("Enter second number");
                int two = sc.nextInt();

                System.out.println("Answer: " + recursive_mod(one,two));
            }
        }
    }

    static int recursive_multiply(int one, int two){
        if(two == 1) {
            return one;
        }else if (two == 0){
            return 0;
        }
        return one + recursive_multiply(one,two - 1);
    }

    static int recursive_div(int one, int two){
        int count;
        if(two == 0){
            return -1;
        } else if (one == two){
            return 1;
        } else if (one < two) {
            return 0;
        } else {
            return 1 + recursive_div(one - two, two);
        }
    }

    static int recursive_mod(int one, int two){
        if(two == 0){
            return -1;
        }else if (one < two){
            return one;
        } else {
            return recursive_mod(one - two, two);
        }
    }

}
