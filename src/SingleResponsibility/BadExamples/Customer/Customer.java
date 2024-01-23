package SingleResponsibility.BadExamples.Customer;

public class Customer {
    private String name;

    public Customer() {}
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void StoreCustomer(String customerName) {
        // store customer into Database logic
        System.out.println("Customer Stored in the DB Successfully");
    }

    public void generateCustomerReport(String customerName) {
        System.out.println("Report for " + this.name);
        // generate a report logic
    }

}
