package InClassAssignment5;

/**
 * A class representing invoice items for a invoice system
 *
 * @author joshua.crocker
 */

public class InvoiceItem {
    private int quantity;
    private Products product;

    /**
     * A constructor for the Invoice Item class, it takes in a quantity, and product from the products class
     * @param quantity quantity, must be greater than 0
     * @param product product
     */
    public InvoiceItem(int quantity, Products product) {
        this.quantity = Math.max(quantity, 0);
        this.product = product;
    }

    /**
     * get quantity
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * set quantity
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    /**
     * get product
     * @return product
     */
    public Products getProduct() {
        return product;
    }

    /**
     * set product
     * @param product product
     */
    public void setProduct(Products product) {
        this.product = product;
    }

    /**
     * get item total, price * quantity
     * @return item total
     */
    public double getitemTotal() {
        return(this.product.getPrice() * this.quantity);
    }
}
