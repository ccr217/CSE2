//Caroline Ruffing 
// CSE 002 Section 111
//HW03
//Bicycle Java Program

import java.util.Scanner;
public class Bicycle {
    			  // main method required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print( "Enter the number of seconds: ");
int nSeconds = myScanner.nextInt();
 

System.out.print("Enter the number of counts: " );
int nCounts = myScanner.nextInt();

 // intermediate variables and output data
        double wheelDiameter=27.0, // bike wheel diameter
        PI=3.14159, // pi to a significant decimal
        feetPerMile=5280, // feet per mile
        inchesPerFoot=12, // inches per foot
        secondsPerMinute=60, // seconds per minute
        minutesPerHour=60;// minutes per hour
        double distance, time, mph;
        
// run calculations
 distance=nCounts*wheelDiameter*PI/(inchesPerFoot*feetPerMile);
 time= nSeconds/secondsPerMinute;
 mph= distance/(time/minutesPerHour);

System.out.println ("The distance was " +distance+ " miles and took " +time+ " minutes");
System.out.println ("The average mph was " +mph+ "");



         		  }  //end of main method   
  } //end of class
  
  