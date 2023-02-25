package scr.duke.choice;

public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0;
        int measurement = 3;
        
        System.out.println("\nWelcome to Duke Choice Shop!\n");



        // ======= Costumer Set =======

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        //System.out.println("Customer is " + c1.name + ".");



        // ======= Clothing Set =======

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        Clothing item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        Clothing item3 = new Clothing();
        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";

        Clothing item4 = new Clothing();
        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";


        Clothing[] items = {item1, item2, item3, item4};

        for (Clothing item : items) {
            System.out.println(item.description + ", " + item.size + ", " + "$" + item.price);
        }
        System.out.println("");



        // ======= Process =======

        /*
        total = (item2.price*2) + item1.price;
        total = total + (total*tax);
        //System.out.println("Total to pay =  $" + total);
        */

        for (Clothing item : items) {
            if (item.size.equals(c1.size)) {
                total = total + item.price;
                System.out.println(item.description + ", " + item.size + ", " + "$" + item.price); 
            }
            if (total > 15) break; 
        }
        System.out.println("");



        // ======= Apply tax =======

        total = total + (total*tax);
        System.out.println("Total to pay =  $" + total);




        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;

            case 4, 5, 6:
                c1.size = "M";
                break;

            case 7, 8, 9:
                c1.size = "L";
                break;

            default:
                c1.size = "X";
                break;
        }



    }

}