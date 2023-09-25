/*Sabrina Reese + Ben Feibus
 * Cmdr Schenk
 * CSA Period 7
 * 25 September 2023
 * Corndog Container Main
 */


package reese.teach;

import java.util.Scanner;

public class CorndogContainerMain {
    //Sabrina
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Integer menu = 0;
        System.out.println("Welcome to Landry's Store!");
        //sabrina 
        CorndogContainer box =new CorndogContainer();
        //CorndogContainer box = new CorndogContainer("Green", 15, reese.teach.Size.M,  false,corndogsOrder,  0.0);
        System.out.println(box);

        //set
        box.setSize(reese.teach.Size.S);
        box.SetQuantityHeld(12);
        box.SetColor("Red");
        box.SetTotal(1.25);
        //change set box 
        System.out.println(box);
        //run do while loop for crud
        //Sabrina
        do {
            
            
            System.out.println("Type 1 to add a corndog to your order, 2 to update a corndog in your order, 3 to delete a corndog in your order, 4 to read a corndog in your order, or 5 to end order:");
            menu = in.nextInt();
            switch (menu) {
                //Sabrina
                case 1:
                    System.out.println("Add 3 corndogs");
                    
                    box.AddCorndog(new Corndog("Ketchup, Mustard", 4.99, 1.23f, HotdogMeat.Pork, false, 555));
                    box.AddCorndog(new Corndog("Pickles, Relish, Jalapenos", 9.99, 5.795f, HotdogMeat.Vegan, true, 777));
                    box.AddCorndog(new Corndog("Ketchup, Mustard, Relish", 5.99, 2.99f, HotdogMeat.Chicken, false, 999));
                    System.out.println(box);
                    break;
                case 2:
                    System.out.println("Update a corndog");
                    System.out.println("Enter index");
                    int index = in.nextInt();
                    box.SetCorndog(index, new Corndog(3.99, 1.54f, reese.teach.HotdogMeat.Turkey, true));
                    System.out.println(box);
                    break;
                case 3:
                    System.out.println("Delete the last corndog");
                    box.RemoveCorndog();
                    break;
                case 4:
                    System.out.println("Read a corndog");
                    System.out.println("Enter index");
                    int index1 = in.nextInt();
                    System.out.println(box.GetCorndog(index1)); 
                    break;
                case 5:
                    break;
                default:
                    System.out.println("You selected something wrong. Try again.");
                    break;
            }
        } while (menu!=5);
        //calculate total+ get name
        //Sabrina
        double total1 = box.total();
        box.SetTotal(total1);
        System.out.println("Thank you for ordering from Landry's Store. Your final order is:" + box +"May I have a name for the order?");
        String name = in.next();
        
        System.out.println("Your total is " +total1+ name + ", please select a tip total: 15%, 18%, 20%, or custom");
        double tip = in.nextDouble();
        //get tip amt
        total1 *=(1+(tip/100));
        System.out.println("Your new total is: " + total1);
        box.SetOrderDelivered(true);
        box.SetTotal(total1);

        System.out.println(box);

    }

}
