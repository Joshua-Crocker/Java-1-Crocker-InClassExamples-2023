package InClassAssignment5;

public class Products {
    private int id;
    private String description;
    private double price;

    public Products(int id, String description, double price) {
        if(id >= 0) {
            this.id = id;
        } else {
            System.out.println("Id has to be a positive number.");
        }
        this.description = description;
        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price has to be a positive number.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        } else {
            System.out.println("Id has to be a positive number.");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price has to be a positive number.");
        }
    }

}
