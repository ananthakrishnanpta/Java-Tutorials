public class InvoiceTotal {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 19.99;
        double total = quantity * unitPrice;

        System.out.printf("Total: $%.2f%n", total);
    }
}
