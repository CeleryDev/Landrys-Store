/*Sabrina Reese + Ben Feibus
 * Cmdr Schenk
 * CSA Period 7
 * 25 September 2023
 * Corndog Container */


package reese.teach;
import java.util.*;
import reese.teach.Corndog;
import reese.teach.HotdogMeat;

public class CorndogContainer {
    //Ben
    //create vars
    private ArrayList<Corndog> corndogsOrder;
    int quantityHeld;
    String color;
    double total;
    boolean orderDelivered;
    Size size;

     //Sabrina
    //partial constructor
    public CorndogContainer(boolean orderDelievered, ArrayList<Corndog> corndogsOrder, double total) {
        this.color = "Red";
        this.quantityHeld=12;
        this.size = reese.teach.Size.S;
        this.orderDelivered = orderDelievered;
        this.corndogsOrder = corndogsOrder;
        this.total = total;
    }

    //default constructor
    public CorndogContainer() {
        this.color = "Blue";
        this.quantityHeld=15;
        this.size = reese.teach.Size.M;
        this.orderDelivered = false;
        this.corndogsOrder = new ArrayList<Corndog>();
        this.total = 0.0;
    }

    //full constructor
    public CorndogContainer(String color, int quantityHeld, Size size, boolean orderDelievered,ArrayList<Corndog> corndogsOrder, double total) {
        this.color = color;
        this.quantityHeld = quantityHeld;
        this.size = size;
        this.orderDelivered = orderDelievered;
        this.corndogsOrder = corndogsOrder;
        this.total = total;
    }

    //ben
    
    //partial constructor
    public CorndogContainer(Corndog corndog) {
        this.corndogsOrder = new ArrayList<Corndog>();
    }

    public CorndogContainer(ArrayList<Corndog> corndogs) {
        this.corndogsOrder = new ArrayList<Corndog>(corndogs);
    }

    //getters+setters
    public String GetColor() {
        return this.color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public int GetQuantityHeld() {
        return this.quantityHeld;
    }

    public void SetQuantityHeld(int quantityHeld) {
        this.quantityHeld = quantityHeld;
    }

    public double GetTotal() {
        return this.total;
    }

    public void SetTotal(double total) {
        this.total = total;
    }

    public boolean GetOrderDelivered() {
        return this.orderDelivered;
    }

    public void SetOrderDelivered(boolean orderDelivered) {
        this.orderDelivered = orderDelivered;
    }
    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int GetLength() {
        return this.corndogsOrder.size();
    }

    //crud
    public void AddCorndog(Corndog corndog) {
        this.corndogsOrder.add(corndog);
    }

    public void AddCorndog() {
        this.corndogsOrder.add(new Corndog());
    }

    public void RemoveCorndog() {
        this.corndogsOrder.remove(this.corndogsOrder.size() - 1);
    }

    public void RemoveCorndog(int index) {
        this.corndogsOrder.remove(index);
    }

    public Corndog GetCorndog(int index) {
        return this.corndogsOrder.get(index);
    }

    public void SetCorndog(int index, Corndog corndog) {
        this.corndogsOrder.set(index, corndog);
    }

    //print all
    public String toString() {
        String s = "Container Length: " + this.GetLength() + "\n";

        for (int i = 0; i < this.GetLength(); i++) {
            s += this.GetCorndog(i).toString() + "\n";
        }
        s+="Box Report \n";
        s += this.color + "\n";
        s += this.quantityHeld + "\n";
        s += this.total + "\n";
        s += this.orderDelivered + "\n";
        s += this.size + "\n";
        return s;
    }

    //Sabrina
    //calc total
    public double total(){
        double t = 0.0;
        for (int i = 0; i < this.GetLength(); i++) {
            t += this.GetCorndog(i).getPrice();
        }
        return t;
    }
}
