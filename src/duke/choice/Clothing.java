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
public class Clothing {
    private String description;
    private double price;
    
    //String size = setSize(Default="M");
    private String size = "M";
    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;
    
     public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        //this.price = price * (1 + TAX_RATE);
        //price = price.getPrice() * (1 + TAX_RATE);
        return price+(price*TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
            
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
 
}
