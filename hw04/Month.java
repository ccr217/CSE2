//Caroline Ruffing
// The program computes the days in a given month.

import java.util.Scanner;
public class Month {
    			  // main method required for every Java program
   			  public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print("Enter an int giving the number of the month (1-12): ");
 int month = myScanner.nextInt();
 
    if ((month==1) || (month==3) || (month==5) || (month==7) || (month==8) || (month==10) || (month==12)){
        System.out.print("The month has 31 days");
    }
    else if ((month==4) || (month==6) || (month==9) || (month==11)){
        System.out.print("The month has 30 days");
    }
    else if (month==2) {
        System.out.print("Enter an int giving the year: ");
        int year = myScanner.nextInt();
            boolean leapYear = ((year % 4==0)&& (year % 100 != 0)|| (year %400==0));
            if (leapYear) {
                System.out.print("The month has 29 days");
            }
            else {
                System.out.print("The month has 28 days");
            }
    }
    else {
        System.out.print ("You did not enter and int between 1-12");
    }
}
}