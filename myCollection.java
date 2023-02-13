import java.util.Scanner;
public class myCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item array[] = new Item[5];
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("b")){
                System.out.println("Please enter the name of the Book ");
                String title = sc.nextLine();
                System.out.println("Please enter the author of the Book ");
                String author = sc.nextLine();
                System.out.println("Please enter the ISBN of the Book ");
                int isbn_number = sc.nextInt();
                sc.nextLine();


                array[i] = new Book(isbn_number,author,title);
            } else if (type.equalsIgnoreCase("p")) {
                System.out.println("Please enter the name of Periodical ");
                String title = sc.nextLine();
                System.out.println("Please enter the issue number ");
                int issueNum = sc.nextInt();
                sc.nextLine();

                array[i] = new Periodical(title,issueNum);
            }
        }

        System.out.println("Your Items:");

        for(int i = 0; i < 5; i++) {
            if(array[i].getListing().contains("Periodical")) {
                System.out.println(array[i].getListing());
                System.out.println();
            } else if (array[i].getListing().contains("Book")) {
                System.out.println(array[i].getListing());
                System.out.println();
            }
        }
    }
}
