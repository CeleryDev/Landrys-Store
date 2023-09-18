/*Sabrina Reese + Ben
 * Cmdr Schenk
 * CSA Period 7
 * 19 September 2023
 * Corndog Class
 */


package reese.teach;

import reese.teach.hotdogMeat;

public class Corndog {
    String toppings;
    double price;
    float hotdogCost;
    hotdogMeat hotdogMeat;
    boolean isKosher;
    int calories;


    
    public Corndog(){
        this.toppings="None";
        this.price = 3.99;
        this.hotdogCost = 1.54f;
        this.hotdogMeat= hotdogMeat.Turkey;
        this.isKosher = true;
        this.calories =250;
    }
    public Corndog(String toppings, double price){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost= 2.55f;
        this.hotdogMeat= hotdogMeat.Pork;
        this.isKosher = false;
        this.calories =350;
    }
    
    public Corndog(double price, float hotdogCost, reese.teach.hotdogMeat hotdogMeat, boolean isKosher ){
        this.toppings= "None";
        this.price=price;
        this.hotdogCost= hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =200;
    }
    public Corndog(String toppings, double price, float hotdogCost, reese.teach.hotdogMeat hotdogMeat, boolean isKosher, int calories ){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost=hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =calories;
    }

    public String getToppings(){
        return this.toppings;
    }
    public void setToppings(String toppings){
        this.toppings = toppings;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    
    public float getHotdogCost(){
        return this.hotdogCost;
    }
    
    public void setHotdogCost(float hotdogCost){
        this.hotdogCost = hotdogCost;
    }

    public hotdogMeat getHotdogMeat(){
        return this.hotdogMeat;
    }
    public void setHotdogMeat(hotdogMeat hotdogMeat){
        this.hotdogMeat = hotdogMeat;
    }


    public boolean getIsKosher(){
        return this.isKosher;
    }
    
    public void setIsKosher(boolean isKosher){
        this.isKosher = isKosher;
    }

    public int getCalories(){
        return this.calories;
    }
    
    public void setCalories(int calories){
        this.calories = calories;
    }

    public String toString() {
        String s = "Corndog Report\n";
        s += this.toppings + "\n";
        s += this.price + "\n";
        s += this.hotdogCost + "\n";
        s += this.hotdogMeat + "\n";
        s += this.isKosher + "\n";
        s += this.calories + "\n";
        return s;

    }

}
