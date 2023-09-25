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
        //sabrina
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
        //sabrina
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

        //create another partial constructor
        //ben
        Corndog corndog3 = new Corndog(3.99, 1.54f, reese.corndog.HotdogMeat.Turkey, true);
        System.out.println(corndog3);

        //set
        corndog3.setToppings("Ketchup, Mustard, Relish");
        corndog3.setHotdogMeat(reese.corndog.HotdogMeat.Chicken);
        corndog3.setHotdogCost(2.99f);
        corndog3.setIsKosher(false);
        corndog3.setPrice(5.99);
        corndog3.setCalories(999);

        //print changes
        System.out.println(corndog3);

        //create full constructor
        //ben
        Corndog corndog4 = new Corndog("Ketchup, Mustard, Relish", 5.99, 2.99f, reese.corndog.HotdogMeat.Chicken, false, 999);
        System.out.println(corndog4);

        //set
        corndog4.setToppings("Ketchup, Mustard, Relish, Jalapenos");
        corndog4.setHotdogMeat(reese.corndog.HotdogMeat.Beef);
        corndog4.setHotdogCost(3.99f);
        corndog4.setIsKosher(true);
        corndog4.setPrice(6.99);
        corndog4.setCalories(1000);

        //print changes
        System.out.println(corndog4);
 
    }

}
