/*Sabrina Reese + Ben Feibus
 * Cmdr Schenk
 * CSA Period 7
 * 25 September 2023
 * Corndog Container */


package reese.teach;
import java.util.Scanner;

public class Box {
    private String color;
    private int quantityHeld;
    private Size size;
    private Boolean orderDelievered;
    private Corndog[] order;
    private double total;


    
    public Box(String color, int quantityHeld, Size size, Boolean orderDelievered, Corndog[] order, double total) {
        this.color = color;
        this.quantityHeld = quantityHeld;
        this.size = size;
        this.orderDelievered = orderDelievered;
        this.order = order;
        this.total = total;
    }



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

    public static void Crud(){
        Scanner in = new Scanner(System.in);
        Integer menu = 0;
        do {
            System.out.println("Welcome to Landry's Store!");
            System.out.println("Type 1 to add a corndog to your order, 2 to update a corndog in your order, 3 to delete a corndog in your order, 4 to read a corndog in your order, or 5 to end order:");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Add a corndog");
                    String[] corndog = new String[6];
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Update a corndog");
                    break;
                case 3:
                    System.out.println("Delete a corndog");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Read a corndog");

                    break;
                case 5:
                    break;
                default:
                    System.out.println("You selected something wrong. Try again.");
                    break;
            }
        } while (menu!=5);
        System.out.println("Thank you for ordering from Landry's Store. Your final order is: {print array} May I have a name for the order?");
        String name = in.next();
        System.out.println("Your total is {total of order}. " + name + ", please select a tip total: 15%, 18%, 20%, or custom");
        double tip = in.nextDouble();
        total *=(1+(tip/100));
        System.out.println("Your new total is: " + total);
    }

}
