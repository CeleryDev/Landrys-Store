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

    public CorndogContainer() { 
        this.corndogsOrder = new ArrayList<Corndog>();
    }

    public CorndogContainer(Corndog corndog) {
        this.corndogsOrder = new ArrayList<Corndog>();
    }

    public CorndogContainer(ArrayList<Corndog> corndogs) {
        this.corndogsOrder = new ArrayList<Corndog>(corndogs);
    }

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

    public int GetLength() {
        return this.corndogsOrder.size();
    }

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

    public String toString() {
        String s = "Container Length: " + this.GetLength() + "\n";

        for (int i = 0; i < this.GetLength(); i++) {
            s += this.GetCorndog(i).toString() + "\n";
        }
        return s;
    }
}




