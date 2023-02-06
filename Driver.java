import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Lot> lots = new ArrayList<Lot>();
        mainMenu(lots);
    }

    public static Lot getNextLot(ArrayList<Lot> lots) {
        if (lots.isEmpty()) {
            return new Lot();
        } else {
            Lot nextLot = lots.get(0);
            lots.remove(0);
            return nextLot;
        }
    }

    public static void addItem(ArrayList<Lot> lots) {
        sc.nextLine();
        System.out.print("Please give a description for the item: ");
        String description = sc.nextLine();
        System.out.print("Please give a starting bid for the item: ");
        int startingBid = sc.nextInt();
        System.out.print("Please give a bid increment for the item: ");
        int bidIncrement = sc.nextInt();

        lots.add(new Lot(description,startingBid,bidIncrement));
    }

    public static void bid(Lot lot) {
        System.out.println("Please give the amount you want to bid. The minimum amount to bet is " + lot.nextBid());
        int bid = sc.nextInt();
        if (bid >= lot.nextBid()) {
            lot.setCurrentBid(bid);
        } else {
            System.out.println("Bid is not high enough.");
        }
    }

    public void markSold(Lot lot) {
        lot.markSold();
    }

    private static void mainMenu(ArrayList<Lot> lots){
        Lot currentLot = null;
        int choice;
        boolean quit = false;
        do {
            if(currentLot == null || currentLot.getDescription() == "Unknown item") {
                System.out.println("We are not currently bidding");
            } else {
                System.out.println("Current Lot: " + currentLot + " " + currentLot.getDescription());
            }

            System.out.println("1. Add Lot to Auction" +
                    "\n2. Start bidding on next Lot" +
                    "\n3. Bid on current Lot" +
                    "\n4. Mark current Lot sold" +
                    "\n5. Quit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    addItem(lots);
                    break;
                case 2:
                    if (lots.size() == 0) {
                        System.out.println("There is nothing to bid on, add an item first");
                    } else if (currentLot != null && !currentLot.getSold()) {
                        System.out.println("You must mark the current lot as sold before bringing up the next Lot");
                    } else {
                        currentLot = getNextLot(lots);
                    }
                    break;
                case 3:
                    if(currentLot == null || currentLot.getDescription() == "Unknown item" || currentLot.getSold() == true){
                        System.out.println("You must first bring a Lot up for bidding");
                    }else {
                        bid(currentLot);
                    }
                    break;
                case 4:
                    if(currentLot == null || currentLot.getDescription() == "Unknown item" || currentLot.getSold() == true) {
                        System.out.println("You must first bring a Lot up for bidding");
                    } else {
                        currentLot.markSold();
                    }
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }while (quit == false);
    }

}
