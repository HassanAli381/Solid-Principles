package SingleResponsibility.GoodExample.Customer;

public class CustomerReportGenerator {
    Customer customer;
    public  CustomerReportGenerator(Customer customer) {
        this.customer = customer;
    }
    public void generateReport() {
        System.out.println("Report for " + customer.getName());
        // generate a report logic
    }
}
