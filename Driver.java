import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60,15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);
        Scanner sc = new Scanner(System.in);

        boolean quit = false;

        do {
            System.out.println("1. Sold One Milk" +
                    "\n2. Sold One Bread" +
                    "\n3. Change price of Milk" +
                    "\n4. Change price of Bread" +
                    "\n5. Add Milk to inventory" +
                    "\n6. Add Bread to inventory" +
                    "\n7. See Inventory" +
                    "\n8.Quit");

            int choice = sc.nextInt();
            if(choice==1){
                milk.lowerQuantity(1);
            } else if (choice==2) {
                bread.lowerQuantity(1);
            } else if (choice==3) {
                System.out.println("Enter new price: ");
                double price = sc.nextDouble();
                milk.changePrice(price);
            } else if (choice==4) {
                System.out.println("Enter new price: ");
                double price = sc.nextDouble();
                bread.changePrice(price);
            } else if (choice==5) {
                System.out.println("Enter quantity to raise by: ");
                int quantity = sc.nextInt();
                milk.increaseQuantity(quantity);
            } else if (choice==6) {
                System.out.println("Enter quantity to raise by: ");
                int quantity = sc.nextInt();
                bread.increaseQuantity(quantity);
            }
            else if(choice==7) {
                System.out.print(milk + "\n" + bread);
            } else if (choice==8) {
                quit = true;
                System.out.println("Program ends");
            }
        } while (quit = false);
    }
}
