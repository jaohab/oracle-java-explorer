package scr.duke.choice;

public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2;
        double total;
        
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Customer is " + c1.name + ".");

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        System.out.println(item1.description + ", " + item1.size + ", " + "$" + item1.price);
        //System.out.println("Total to pay =  $" + (total = item1.price + (item1.price*tax)));

        Clothing item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = 'S';
        System.out.println(item2.description + ", " + item2.size + ", " + "$" + item2.price);
        //System.out.println("Total to pay =  $" + (total = item2.price + (item2.price*tax)));

        total = (item2.price*2) + item1.price;
        total = total + (total*tax);
        System.out.println("Total to pay =  $" + total);

    }

}