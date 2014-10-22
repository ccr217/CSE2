//Caroline Ruffing
// The program simulates roulette, craps, and picking a card

import java.util.Scanner;
public class RandomGames{
    			  // main s required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

    String game;
    
    System.out.println("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
    game =input.next();
    
    switch (game){
        case r:
            int number= (int)(36* Math.random());
            System.out.println("Roulette "+number+"");
            break;
        case R:
            System.out.println("Roulette "+number+"");
            break;
        case c:
            int die1= (int)(6* Math.random());
            int die2= (int)(6* Math.random());
            int dieTotal= die1+die2;
            System.out.println("Craps "+die1+"+"+die2+"="+dieTotal+"");
            break;
        case C:
            System.out.println("Craps "+die1+"+"+die2+"="+dieTotal+"");
            break;
        
        case p:
            int card= (int)(12* Math.random())+2;
            switch (card){
                case 2:
                    System.out.println(""+card+ "of");
                    break;
                case 3:
                    System.out.println(""+card+ "of");
                    break;
                case 4:
                    System.out.println(""+card+ "of");
                    break;
                case 5:
                    System.out.println(""+card+ "of");
                    break;
                case 6:
                    System.out.println(""+card+ "of");
                    break;
                case 7:
                    System.out.println(""+card+ "of");
                    break;
                case 8:
                    System.out.println(""+card+ "of");
                    break;
                case 9:
                    System.out.println(""+card+ "of");
                    break;
                case 10:
                    System.out.println(""+card+ "of");
                    break;
                case 11:
                    System.out.println("Jack of");
                    break;
                case 12:
                    System.out.println("Queen of");
                    break;
                case 13:
                    System.out.println("King of");
                    break;
                case 14:
                    System.out.println("Ace of");
                    break;
            }
            int suit= (int)(4* Math.random())+1;
            switch (suit){
                case 1:
                    System.out.println("Hearts");
                    break;
                case 2:
                    System.out.println("Diamonds");
                    break;
                case 3:
                    System.out.println("Spades");
                    break;
                case 4:
                    System.out.println("Clubs");
                    break;
            }
            break;
            case P:
            switch (card){
                case 2:
                    System.out.println(""+card+ "of");
                    break;
                case 3:
                    System.out.println(""+card+ "of");
                    break;
                case 4:
                    System.out.println(""+card+ "of");
                    break;
                case 5:
                    System.out.println(""+card+ "of");
                    break;
                case 6:
                    System.out.println(""+card+ "of");
                    break;
                case 7:
                    System.out.println(""+card+ "of");
                    break;
                case 8:
                    System.out.println(""+card+ "of");
                    break;
                case 9:
                    System.out.println(""+card+ "of");
                    break;
                case 10:
                    System.out.println(""+card+ "of");
                    break;
                case 11:
                    System.out.println("Jack of");
                    break;
                case 12:
                    System.out.println("Queen of");
                    break;
                case 13:
                    System.out.println("King of");
                    break;
                case 14:
                    System.out.println("Ace of");
                    break;
            }
            switch (suit){
                case 1:
                    System.out.println("Hearts");
                    break;
                case 2:
                    System.out.println("Diamonds");
                    break;
                case 3:
                    System.out.println("Spades");
                    break;
                case 4:
                    System.out.println("Clubs");
                    break;
            }
            break;
}
}
}