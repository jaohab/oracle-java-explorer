package scr.duke.choice;

public class ShopApp {

    public static void main(String[] args) {

        System.out.println("\nWelcome to Duke Choice Shop!\n");

        // ======= Customer Set =======

        Customer c1 = new Customer("Pinky", 3);
        System.out.println("Customer is " + c1.getName() + ".\n");

        // ======= Clothing Set =======

        System.out.println("Minimum price is $" + Clothing.MIN_PRICE + "\n");

        Clothing item1 = new Clothing("Blue Jacket", 20.9, 3);
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, 3);
        Clothing item3 = new Clothing("Green Scarf", 5d, 3);
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, 3);

        // ======= Cart =======

        Clothing[] items = { item1, item2, item3, item4 };

        c1.addItems(items);

        for (Clothing item : c1.getItems()) {
            System.out.println(item.getDescription() + ", " + item.getSize() + ", " + "$" + item.getPrice());
        }

        System.out.println("\nTotal to pay = $" + c1.getTotalClothingCost() + "\n");

        // ======= TRY/CATCH =======

        int average = 0;
        int count = 0;
        for (Clothing item : items) {
            if (item.getSize().equals("L")) count++;
        }
        try {
            average = ((int) c1.getTotalClothingCost()) / count;
        } catch (ArithmeticException e) {
            System.err.println("Can't divide by 0!");
            average = (int) c1.getTotalClothingCost();
        }
        System.out.println("\nAverage price = $" + average + "\n");

    }

}