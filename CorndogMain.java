/*Sabrina Reese + Ben
 * Cmdr Schenk
 * CSA Period 7
 * 19 September 2023
 * Corndog Main
 */


package reese.teach;

public class CorndogMain {
    public static void main(String[] args){
        //create default constructor
        Corndog corndog = new Corndog();
        System.out.println(corndog);

        //set
        corndog.setToppings("Ketchup, Mustard");
        corndog.setPrice(4.99);
        corndog.setHotdogMeat(reese.teach.HotdogMeat.Pork);
        corndog.setHotdogCost(1.23f);
        corndog.setIsKosher(false);
        corndog.setCalories(555);

        //print
        System.out.println(corndog);
        
        //create partial constructor
        Corndog corndog2 = new Corndog("Pickle", 4.50);
        System.out.println(corndog2);

        //set 
        corndog2.setToppings("Pickles, Relish, Jalapenos");
        corndog2.setHotdogMeat(reese.teach.HotdogMeat.Vegan);
        corndog2.setHotdogCost(5.795f);
        corndog2.setIsKosher(true);
        corndog2.setPrice(9.99);
        corndog2.setCalories(777);

        //print chagnes
        System.out.println(corndog2);
 
    }

}
