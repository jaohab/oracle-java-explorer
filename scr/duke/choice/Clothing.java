package scr.duke.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";
    public final static double MIN_PRICE = 10.0;
    public final static double TAX = 0.2;

    // ======= Description =======

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // ======= Price =======

    public double getPrice() {
        return price + (price * TAX);
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE) {
            this.price = MIN_PRICE;
            System.out.println("The price of item " + this.description + " is less than $10.\n");
        } else {
            this.price = price;
        }
    }

    // ======= Size =======

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // ======= Constructor =======

    public Clothing(String description, double price, int measurement) {
        this.description = description;
        setPrice(price);
        switch (measurement) {
            case 1, 2, 3:
                this.size = "S";
                break;
            case 4, 5, 6:
                this.size = "M";
                break;
            case 7, 8, 9:
                this.size = "L";
                break;
            default:
                this.size = "X";
                break;
        }
    }
        

}
