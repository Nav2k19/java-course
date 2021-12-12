// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
     // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS

    Scanner keyboard = new Scanner (System.in); // Create a Scanner object

    String firstname;
    String itemOrder;
	  String frostingtype;
    String fillingtype;
    String toppings;
    String input;


    double cost = 15.00; //cost of the cupcake

    final double TAX_RATE = 0.08; //Sales tax rate
    double tax;


    System.out.println("Welcome to the Java's Cake & Cupcake Shop! ");
    System.out.println("We made our custom cakes with our secret batter! ");


    System.out.print("What is your first name? ");


    firstname = keyboard.nextLine();

    System.out.print(firstname + ", please see our MENU below: ");
    System.out.print("\n");


    System.out.println("_______________________________________________");      
    System.out.println("        MENU         QUANTITY    BASE COST  ");
    System.out.println("_______________________________________________"); 
    System.out.println("        Cake                     1            $15     ");
    System.out.println("   Set of Cupcakes       6            $15     ");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
    System.out.println("_______________________________________________");


    System.out.print("Do you want CUPCAKES or CAKE? ");
    itemOrder = keyboard.nextLine();

    System.out.print("What kind of frosting do you want? ");
    System.out.print("Vanilla, Chocolate, or Strawberry or Coco? ");
    frostingtype = keyboard.nextLine();

    System.out.print("What kind of filling do you want? ");
    System.out.print("Mocha, Mint, Lemon, Caramel, or Rasberry? ");

    fillingtype = keyboard.nextLine();


    System.out.print("What kind of TOPPINGS do you want? ");
    System.out.print("Sprinkles, Cinnamon, Cocoa, or Nuts? ");

    toppings = keyboard.nextLine();








	 
    // Introduce shop and prompt user to input first name
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION

    System.out.println();
    System.out.println(firstname + " , your order is as follows: ");
    System.out.println("_________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println("Frosting: " + frostingtype);
    System.out.println("Filling: " + fillingtype);
    System.out.println("Toppings: " + toppings);
    System.out.println("_________________________________________");


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
    System.out.printf("The cost of your order is: $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf("The tax is: $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n",(tax + cost));
  
    }   
}