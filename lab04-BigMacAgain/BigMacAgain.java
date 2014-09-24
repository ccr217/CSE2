//Caroline Ruffing
// The program computes the cost of buying a some Big Macs and fries.

import java.util.Scanner;
public class BigMacAgain {
    			  // main method required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print("Enter the number of Big Macs: ");
 int nBigMacs = myScanner.nextInt();
 
    if(myScanner.hasNextInt()) {
        double costBigMacs$=nBigMacs*2.22; //Calculate the cost of the Big Macs
        System.out.print("The cost of "+nBigMacs+" is "+nBigMacs+"*$2.22= $"+costBigMacs$); // print cost of Big Macs
        System.out.print("");
        System.out.print("Do you want an order of fries (Y/y/N/n)? ");
    }
    else{
        System.out.println("You did not enter an int");
        return;    //leaves the program, i.e.
                //the program terminates
    }
        }//end of main method
}//end of class