//Caroline Ruffing
//10/27/2014
//Section 112

import java.util.Scanner;
public class HW8{
  
  public static char getInput(Scanner scan, String x){
    while (true){
      if (scan.hasNext()){
        String input= scan.next();
        if (input.length()!=1){
            System.out.print("You should enter exactly one character- ");
        }//end if
        else{
        char input2= input.charAt(0);
        for (int i=0; i<x.length(); i++){
            if (input2== x.charAt(i)){
                return x.charAt(i);
            }
        }//end for
                System.out.print("You did not enter a character from the list "+x+"; try again- ");
        }// end else

    }
    }// while
  }// method
  
  public static char getInput(Scanner scan, String x, int y){
    int j=0;
    while (j<y){
      if (scan.hasNext()){
        String input= scan.next();
        if (input.length()!=1){
            System.out.print("You should enter exactly one character- ");
        }//end if
        else{
        char input2= input.charAt(0);
        for (int i=0; i<x.length(); i++){
            if (input2== x.charAt(i)){
                return x.charAt(i);
            }
        }//end for
                System.out.print("You did not enter a character from the list "+x+"; try again- ");
        }// end else

    }
    j++;
    }// while
    System.out.println(" ");
    System.out.println("You failed after "+y+ " tries");
    return ' ';
  }// method

  public static char getInput(Scanner scan, String x, String y){
       while (true){
           System.out.println(x);
           System.out.print("Enter one of: ");
        for (int i=0; i<y.length(); i++){
            System.out.print("'"+y.charAt(i)+"', ");
        }
        System.out.print("- ");
      if (scan.hasNext()){
        String input= scan.next();
        if (input.length()!=1){
            System.out.println("Enter exactly one character");
        }//end if
        else{
        char input2= input.charAt(0);
        for (int i=0; i<y.length(); i++){
            if (input2== y.charAt(i)){
                return y.charAt(i);
            }
        }//end for
                System.out.println("You did not enter an acceptable character");
        }// end else

    }
    }// while 
  }//method 
    
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}
