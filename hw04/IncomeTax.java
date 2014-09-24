//Caroline Ruffing
// The program computes income tax.

import java.util.Scanner;
public class IncomeTax {
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print("Enter an int giving the number of thousands: ");
 int income = myScanner.nextInt();

 int tax=0;
 
 
 //decide which tax bracket the income falls then calculate the tax
 
    if (income>=0 && income < 20){
        income*=1000;
        tax= income*5/100;
        System.out.print("The tax rate on $"+income+" is 5%, and the tax is $"+tax+" \n");
    }
    else if (income >= 20 && income <40){
       income*=1000;
        tax= income*7/100;
        System.out.print("The tax rate on $"+income+" is 7%, and the tax is $"+tax+" \n");
    }
    else if (income >= 40 && income <78){ 
        income*=1000;
        tax= income*12/100;
        System.out.print("The tax rate on $"+income+" is 12%, and the tax is $"+tax+" \n");
    }
    else if (income > 78){ 
        income*=1000;
        tax= income*14/100;
        System.out.print("The tax rate on $"+income+" is 14%, and the tax is $"+tax+" \n");
    }
    else if (income < 0){  
        System.out.print("You did not enter a positive int \n");
    }
    
}// end method
}//end class

 