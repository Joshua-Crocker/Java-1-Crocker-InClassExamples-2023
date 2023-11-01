package InClassAssignment5;

/**
 * A class representing products for an invoice system
 *
 * @author joshua.crocker
 */

public class Products {
    private int id;
    private String description;
    private double price;

    /**
     * A constructor for the products class, which takes in a ID, Description, and a price.
     *
     * @param description product description
     * @param id product ID, must be a positive number
     * @param price product price, must be a positive number
     */
    public Products(int id, String description, double price) {
        if(id >= 0) {
            this.id = id;
        }
        this.description = description;
        if(price >= 0) {
            this.price = price;
        }
    }
    /**
     * get ID
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * set ID, must be a positive number
     * @param id product ID
     */
    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        }
    }

    /**
     * get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set description
     * @param description product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * set price, Must be a positive number
     * @param price product price
     */
    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        }
    }

}
