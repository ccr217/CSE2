//Caroline Ruffing 
// CSE 002 Section 111
//HW03
//Four Digits Java Program


import java.util.Scanner;
public class FourDigits{
    			  // main method required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print( "Enter a number with four decimals: ");
double nGiven = myScanner.nextDouble();

int given= (int)nGiven;
nGiven-=given;
nGiven*=10000;
       
int decimals= (int)nGiven;

System.out.print( "The first four decimals are "+decimals+"");
}
}
