public class Renew extends Customer{
    private String name;

    Renew(String name) {
        super('B');
        this.name = name;
    }


    @Override
    String getCustomerInfo() {
        return "Renewal License. Ticket Number " + getTicketNumber() + ". Name: " + name;
    }
}
