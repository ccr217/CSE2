//Caroline Ruffing 
// CSE 002 Section 111
//HW03
//Root Java Program

import java.util.Scanner;
public class Root {
    			  // main method required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print( "Enter the number you wish to find the cube root of: ");
int nGiven = myScanner.nextInt();

//find cube root
    double estimate= (nGiven/3);
    double guess,guess1,guess2,guess3,guess4;
    
//run calculations
    guess= (2*estimate*estimate*estimate+nGiven)/(3*estimate*estimate);
    guess1= (2*guess*guess*guess+nGiven)/(3*guess*guess);
    guess2=(2*guess1*guess1*guess1+nGiven)/(3*guess1*guess1);
    guess3=(2*guess2*guess2*guess2+nGiven)/(3*guess2*guess2);
    guess4=(2*guess3*guess3*guess3+nGiven)/(3*guess3*guess3);

//print
System.out.println ("The cube root of "+nGiven+" is approximatly "+guess4+"");
        }

}