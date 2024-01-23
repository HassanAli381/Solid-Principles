package SingleResponsibility.GoodExample.Invoice;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Quantity = " + invoice.getQuantity());
        System.out.println("Discount Rate = " + invoice.getDiscountRate());
        System.out.println("Tax Rate = " + invoice.getTaxRate());
        System.out.println("Total = " + invoice.getTotal());
    }

}
