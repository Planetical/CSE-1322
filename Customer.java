public abstract class Customer {
    private char letter;
    private int number;
    static int numA = 0,numB = 0,numC = 0,numD = 0;

    Customer(){
        letter = 'X';
        number = 0;
    }

    Customer(char letter) {
        this.letter = letter;
        if (letter == 'A') {
            numA++;
            numA = number;
        } else if (letter == 'B') {
            numB++;
            numB = number;
        } else if (letter == 'C'){
            numC++;
            numC = number;
        } else if (letter == 'D') {
            numD++;
            numD = number;
        } else {
            letter = 'X';
            number = 0;
            System.out.println("Error, letter must be A, B, C, or D");
        }
    }

    protected String getTicketNumber() {
        String ticketNumber = letter + String.valueOf(number);
        return ticketNumber;
    }

    abstract String getCustomerInfo();

}
