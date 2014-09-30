//Caroline Ruffing
// The program takes fast food orders

import java.util.Scanner;
public class BurgerKing{
    			  // main s required for every Java program
   			  public static void main(String[] args) {

Scanner input; 
int dieFaceNumber; 
int numberOfRow; 
int howManyThrows; 

System.out.println("Enter a letter to indicate a choice of: ");
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.println("    Fries (F or f) ");

Scanner myScanner;
myScanner = new Scanner (System.in);
    String food = myScanner.next();
        
        switch (food){
            
        case "B":
            String burger;
            
            System.out.println("Enter A or a for all the fixins");
            System.out.println("C or c for cheese");
            System.out.println("N or n for none of the above ");
            burger = myScanner.next();
                
                switch (burger){
                    case "A":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "C":
                        System.out.println("You ordered a cheeseburger.");
                        break;
                    case "c":
                        System.out.println("You ordered a cheeseburger.");
                        break;
                    case "N":
                        System.out.println("You ordered a plain burger.");
                        break;
                    case "n":
                        System.out.println("You ordered a plain burger.");
                        break;
                }
            break;
            
        case "b":
            
            System.out.println("Enter A or a for all the fixins");
            System.out.println("C or c for cheese");
            System.out.println("N or n for none of the above ");
            burger = myScanner.next();
                
                switch (burger){
                    case "A":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "a":
                        System.out.println("You ordered a burger with all the fixins.");
                        break;
                    case "C":
                        System.out.println("You ordered a cheeseburger.");
                        break;
                    case "c":
                        System.out.println("You ordered a cheeseburger.");
                        break;
                    case "N":
                        System.out.println("You ordered a plain burger.");
                        break;
                    case "n":
                        System.out.println("You ordered a plain burger.");
                        break;
                }
            break;
            
        case "S":
            String soda;
            
            System.out.println("Do you want Pepsi (p or P),");
            System.out.println("Coke (c or C),");
            System.out.println("Sprite (s or S) or ");
            System.out.println("Mountain Dew (M or m) ");
            soda = myScanner.next();
                
                switch (soda){
                    case "P":
                        System.out.println("You ordered a Pespsi.");
                        break;
                    case "p":
                        System.out.println("You ordered a Pespsi.");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke.");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke.");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite.");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite.");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                }
            break;
            
        case "s":
            
            System.out.println("Do you want Pepsi (p or P),");
            System.out.println("Coke (c or C),");
            System.out.println("Sprite (s or S) or ");
            System.out.println("Mountain Dew (M or m) ");
            soda = myScanner.next();
                
                switch (soda){
                    case "P":
                        System.out.println("You ordered a Pespsi.");
                        break;
                    case "p":
                        System.out.println("You ordered a Pespsi.");
                        break;
                    case "C":
                        System.out.println("You ordered a Coke.");
                        break;
                    case "c":
                        System.out.println("You ordered a Coke.");
                        break;
                    case "S":
                        System.out.println("You ordered a Sprite.");
                        break;
                    case "s":
                        System.out.println("You ordered a Sprite.");
                        break;
                    case "M":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                    case "m":
                        System.out.println("You ordered a Mountain Dew.");
                        break;
                }
            break;
        
        case "F":
            String fries;
            
            System.out.println("Do you want a small or large order of fries (S, s, L, or l) ");
            fries = myScanner.next();
                
                switch (fries){
                    case "S":
                        System.out.println("You ordered small fries.");
                        break;
                    case "s":
                        System.out.println("You ordered small fries.");
                        break;
                    case "L":
                        System.out.println("You ordered large fries.");
                        break;
                    case "l":
                        System.out.println("You ordered large fries.");
                        break;
                }
            break;
        
        case "f":
            
            System.out.println("Do you want a small or large order of fries (S, s, L, or l) ");
            fries = myScanner.next();
                
                switch (fries){
                    case "S":
                        System.out.println("You ordered small fries.");
                        break;
                    case "s":
                        System.out.println("You ordered small fries.");
                        break;
                    case "L":
                        System.out.println("You ordered large fries.");
                        break;
                    case "l":
                        System.out.println("You ordered large fries.");
                        break;
                }
            break;
            
            default: 
            System.out.println("You did not enter B, b, S, s, F, or f.");
            break;
        }
    }
}