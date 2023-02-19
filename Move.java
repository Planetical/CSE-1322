public class Move extends Customer {
    String name;
    String state;

    Move(String name, String state){
        super('C');
        this.name = name; this.state = state;
    }


    @Override
    String getCustomerInfo() {
        return "Moved from " + state + ". Ticket Number " + getTicketNumber() + ". Name: " + name;
    }
}
