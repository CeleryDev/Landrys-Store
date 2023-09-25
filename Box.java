/*Sabrina Reese + Ben Feibus
 * Cmdr Schenk
 * CSA Period 7
 * 25 September 2023
 * Corndog Container */


package reese.teach;
import java.util.Scanner;


public class Box {
    //Sabrina
    //Vars creation
    private String color;
    private int quantityHeld;
    private Size size;
    private Boolean orderDelievered;
    private Corndog[] order;
    private double total;


    //Sabrina
    //partial constructor
    public Box(Boolean orderDelievered, Corndog[] order, double total) {
        this.color = "Red";
        this.quantityHeld=12;
        this.size = reese.teach.Size.S;
        this.orderDelievered = orderDelievered;
        this.order = order;
        this.total = total;
    }

    //default constructor
    public Box() {
        this.color = "Blue";
        this.quantityHeld=15;
        this.size = reese.teach.Size.M;
        this.orderDelievered = false;
        this.order = order;
        this.total = 0.0;
    }

    //full constructor
    public Box(String color, int quantityHeld, Size size, Boolean orderDelievered, Corndog[] order, double total) {
        this.color = color;
        this.quantityHeld = quantityHeld;
        this.size = size;
        this.orderDelievered = orderDelievered;
        this.order = order;
        this.total = total;
    }

    //ben
    //Create corndog
    public String add(){

    }
    //read corndog
    public String read(){

    }
    //update corndog
    public String update(){

    }
    //delete corndog
    public String delete(){

    }

    //getters and setters for box vars
    //sabrina
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantityHeld() {
        return this.quantityHeld;
    }

    public void setQuantityHeld(int quantityHeld) {
        this.quantityHeld = quantityHeld;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Boolean getOrderDelievered() {
        return this.orderDelievered;
    }

    public void setOrderDelievered(Boolean orderDelievered) {
        this.orderDelievered = orderDelievered;
    }

    public Corndog[] getOrder() {
        return this.order;
    }

    public void setOrder(Corndog[] order) {
        this.order = order;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}
