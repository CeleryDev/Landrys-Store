/*Sabrina Reese + Ben Feibus
 * Cmdr Schenk
 * CSA Period 7
 * 19 September 2023
 * Corndog Class
 */


package reese.teach;

import reese.teach.HotdogMeat;

public class Corndog {
    //create vars 
    //Sabrina Reese
    String toppings;
    double price;
    float hotdogCost;
    HotdogMeat hotdogMeat;
    boolean isKosher;
    int calories;


    //create default constructor
    public Corndog(){
        this.toppings="None";
        this.price = 3.99;
        this.hotdogCost = 1.54f;
        this.hotdogMeat= reese.teach.HotdogMeat.Turkey;
        this.isKosher = true;
        this.calories =250;
    }
    //create partial constructor
    public Corndog(String toppings, double price){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost= 2.55f;
        this.hotdogMeat= reese.teach.HotdogMeat.Pork;
        this.isKosher = false;
        this.calories =350;
    }
    //create partial constructor
    public Corndog(double price, float hotdogCost, reese.teach.HotdogMeat hotdogMeat, boolean isKosher ){
        this.toppings= "None";
        this.price=price;
        this.hotdogCost= hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =200;
    }

    //create full constructor
    public Corndog(String toppings, double price, float hotdogCost, reese.teach.HotdogMeat hotdogMeat, boolean isKosher, int calories ){
        this.toppings= toppings;
        this.price=price;
        this.hotdogCost=hotdogCost;
        this.hotdogMeat= hotdogMeat;
        this.isKosher = isKosher;
        this.calories =calories;
    }

    //Ben Feibus
    //getters and setters
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

    public HotdogMeat getHotdogMeat(){
        return this.hotdogMeat;
    }
    public void setHotdogMeat(HotdogMeat hotdogMeat){
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

    //Ben 
    //to string print report
    public String toString() {
        String s = "Corndog Report for Landry's Store\n";
        s += this.toppings + "\n";
        s += this.price + "\n";
        s += this.hotdogCost + "\n";
        s += this.hotdogMeat + "\n";
        s += this.isKosher + "\n";
        s += this.calories + "\n";
        return s;

    }

}
