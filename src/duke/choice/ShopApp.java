/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author andre
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        // First Welcome!!
        System.out.println("Welcome to Duke Choice Shop!");

        ////private String name;
        ////public int measurement;
        Customer c1 = new Customer("Pinky", 14);
        //First Exercise
        ////Customer c1 = new Customer();
        ////c1.setName("Pinky");
        ////c1.setSize("S");
        //System.out.println("Hi! my name is " + c1.getName() + ", " + c1.getSize() + ".");

        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

//        My way
//        Clothing item3 = new Clothing("Green Scarf", 5, "S");
//        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
//        My way
//        Clothing item3 = new Clothing();
//        Clothing item4 = new Clothing();
//
//        Clothing[] items = {item1, item2, item3, item4};
        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//
//        items[2].setDescription("Green Scarf");
//        items[2].setPrice(5);
//        items[2].setSize("S");
//
//        items[3].setDescription("Blue T-Shirt");
//        items[3].setPrice(10.5);
//        items[3].setSize("S");
//        My way
//        item3.description = "Green Scarf";
//        item3.price = 5;
//        item3.size = "S";
//
//        item4.description = "Blue T-Shirt";
//        item4.price = 10.5;
//        item4.size = "S";
        //System.out.println("Item 1" + ", " + item1.description + ", " + item1.price + "," + item1.size);
        //System.out.println("Item 2" + ", " + item2.description + ", " + item2.price + "," + item2.size);
        //My example 
        //System.out.println("Welcome " + c1.name + "!" + " Well, First offer I have for you is " + item1.description + " the price is " + item1.price + " and the size is " + item1.size + "," + " and the another is " + item2.description + " the price is " + item2.price + " and the size is " + item2.size + ".");
        // total = (item1.price + item2.price * 2) * ( 1 + tax);
        // My example
        // total = (item1.price + item2.price * 2) + ((item1.price + item2.price * 2) * tax);
        //System.out.println("Total = " + total);
        //My exemple
        //System.out.println("The amount of 2 " + item2.description + " plus 1 " + item1.description + " is " + ((item2.price * 2) + item1.price) + " plus tax of " + (tax * 100) + "%" + " the total is " + total);
        int measurement = 8;

        c1.addItems(items);
        ////c1.setSize(measurement);
        System.out.println("Hi! my name is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost() + ".");

        for (Clothing item : c1.getItems()) {
//            if (c1.getSize().equals(item.getSize())) {
//                total = total + item.getPrice();
//                System.out.println("Item " + "," + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
            System.out.println("Items " + item.getDescription() + ", " + item.getPrice() + ", " + item.getSize());
//                
//                total = total + total * tax;
//                
//                if (total > 15) {
//                    break;
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();

            }
        }

        try {
            //average = (count == 0) ? 0 : average/count; way to avoid the exception
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);

        } catch (ArithmeticException e) {
            System.out.println("Don't divide by 0");
        }

    }
//
//        System.out.println("Total = " + total);
}
