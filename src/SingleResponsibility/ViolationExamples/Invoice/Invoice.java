package SingleResponsibility.BadExamples.Invoice;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate, double total) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = total;
    }

    // getters and setters ...

    public double calculateTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);
        return price * (1 + taxRate);
    }

    public void printInvoice() {
        System.out.println("Quantity = " + quantity);
        System.out.println("Discount Rate = " + discountRate);
        System.out.println("Tax Rate = " + taxRate);
        System.out.println("Total = " + total);
    }

    public void saveToFile(String fileName) {
        // save to file logic
        System.out.println("Saved to file successfully");
    }

}
