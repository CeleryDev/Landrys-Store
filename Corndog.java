/*Sabrina Reese + Ben
 * Cmdr Schenk
 * CSA Period 7
 * 19 September 2023
 * Corndog Class
 */


package reese.teach;

public class Corndog {
    String toppings;
    double price;
    float hotdogCost;
    Enum hotdogMeat;
    boolean isKosher;
    int calories;

    private Corndog(){
        this.toppings="None";
        this.price = 3.99;
        this.hotdogCost = 1.54f;
        this.hotdogMeat= ;
        this.isKosher = true;
        this.calories =250;
    }
    private Corndog(String toppings, double price){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost= 2.55f;
        this.hotdogMeat= ;
        this.isKosher = false;
        this.calories =350;
    }
    private Corndog(double price, float hotdogCost, Enum hotdogMeat, boolean isKosher ){
        this.toppings= "None";
        this.price=price;
        this.hotdogCost= hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =200;
    }
    private Corndog(String toppings, double price, float hotdogCost, Enum hotdogMeat, boolean isKosher, int calories ){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost=hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =calories;
    }




}
