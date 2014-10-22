//Caroline Ruffing 
// CSE 002 Section 111
//Lab 07

import java.util.Scanner;
public class LoopTheLoop{
    			  // main s required for every Java program
   			  public static void main(String[] args) {

int counter = 0;
int counter2 = 0;
int nStars = 10;
    while (counter<nStars){
    counter++;
        while (counter2<counter){
        System.out.print("*");
        counter2++;
        break;
        }
    System.out.println("");
    }
}

}