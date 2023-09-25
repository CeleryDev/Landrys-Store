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
    public void main() {
        CorndogContainer corndogOrder = new CorndogContainer();

        corndogOrder.AddCorndog(new Corndog("Ketchup, Mustard", 4.99, 1.23f, HotdogMeat.Pork, false, 555));
        corndogOrder.AddCorndog(new Corndog("Pickles, Relish, Jalapenos", 9.99, 5.795f, HotdogMeat.Vegan, true, 777));
        corndogOrder.AddCorndog(new Corndog("Ketchup, Mustard, Relish", 5.99, 2.99f, HotdogMeat.Chicken, false, 999));
    }

    private ArrayList<Corndog> corndogsOrder;
    int quantityHeld;
    String color;
    double total;
    boolean orderDelivered;
    Size size;

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
    
    public CorndogContainer() { 
        this.corndogsOrder = new ArrayList<Corndog>();
    }

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
        return s;
    }
}




