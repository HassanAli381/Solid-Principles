package SingleResponsibility.GoodExample.Invoice;

public class InvoicePersistence {
    Invoice invoice;
    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // save to file logic
        System.out.println("Saved to file successfully");
    }
}
