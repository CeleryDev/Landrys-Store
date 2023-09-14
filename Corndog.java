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

    public String getToppings(){return this.toppings;}
    public void setToppings(String toppings){this.toppings = toppings;}
    
    public double getPrice(){return this.price;}
    public void setPrice(double price){this.price = price;}

    public float getHotdogCost(){return this.hotdogCost;}
    public void setHotdogCost(float hotdogCost){this.hotdogCost = hotdogCost;}

    public Enum getHotdogMeat(){return this.hotdogMeat;}
    public void setHotdogMeat(Enum hotdogMeat){this.hotdogMeat = hotdogMeat;}

    public boolean getIsKosher(){return this.isKosher;}
    public void setIsKosher(boolean isKosher){this.isKosher = isKosher;}

    public int getCalories(){return this.calories;}
    public void setCalories(int calories){this.calories = calories;}

    public void displayCorndog() {
        System.out.println("Corndog Report");
        System.out.println("===========================");
        System.out.println("Toppings: " + this.toppings);
        System.out.println("Price: " + this.price);
        System.out.println("Hotdog Cost: " + this.hotdogCost);
        System.out.println("Hotdog Meat: " + this.hotdogMeat);
        System.out.println("Is Kosher: " + this.isKosher);
        System.out.println("Calories: " + this.calories);
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
