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
        
        //create Box full constructor
        //Ben
        
        //change set box 
        //run do while loop for crud
        //Sabrina
        do {
            
            
            System.out.println("Type 1 to add a corndog to your order, 2 to update a corndog in your order, 3 to delete a corndog in your order, 4 to read a corndog in your order, or 5 to end order:");
            menu = in.nextInt();
            switch (menu) {
                //Ben
                case 1:
                    System.out.println("Add a corndog");
                    
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Update a corndog");
                    break;
                case 3:
                    System.out.println("Delete a corndog");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Read a corndog");

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
        System.out.println("Thank you for ordering from Landry's Store. Your final order is: {print array} May I have a name for the order?");
        String name = in.next();
        System.out.println("Your total is {total of order}. " + name + ", please select a tip total: 15%, 18%, 20%, or custom");
        double tip = in.nextDouble();
        //total *=(1+(tip/100));
        //System.out.println("Your new total is: " + total);
    }

}
