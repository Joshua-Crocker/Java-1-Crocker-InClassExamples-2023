package InClassAssignment5;

public class InvoiceItem {
    private int quantity;
    private Products product;

    public InvoiceItem(int quantity, Products product) {
        this.quantity = Math.max(quantity, 0);
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public double getitemTotal() {
        double price = this.product.getPrice();
        int quantity = this.quantity;
        return(price * quantity);
    }
}
