package scr.duke.choice;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    // ======= Name =======

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ======= Size =======

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(Integer measurement) {
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

    // ======= Items =======

    public Clothing[] getItems() {
        return items;
    }

    public void addItems(Clothing[] item) {
        this.items = item;
    }

    // ======= Total Cost =======

    public double getTotalClothingCost() {
        Double total = 0.0;
        for (Clothing item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    // ======= Constructor =======

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

}
