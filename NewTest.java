public class NewTest extends Customer{
    private String name;
    private String dateOfBirth;

    NewTest(String name, String dateOfBirth) {
        super('A');
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    String getCustomerInfo() {
        return "New Drivers License. Ticket Number " + getTicketNumber() + ". Name: " + name + " DOB: " +dateOfBirth;
    }
}
