public class Suspended extends Customer{
    private String name;
    private String violation;

    Suspended(String name, String violation){
        super('D');
        this.name = name;
        this.violation = violation;
    }

    @Override
    String getCustomerInfo() {
        return "Violation: " + violation + ". Ticket Number " + getTicketNumber() + ". Name: " + name;
    }
}
