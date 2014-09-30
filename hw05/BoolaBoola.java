//Caroline Ruffing
// The program has three boolean variables to each of which the value of true or false is randomly assigned. 
//Then, at random, combine the three variables with random choices of && and || and stores the result. 

import java.util.Scanner;
public class BoolaBoola{
    			  // main s required for every Java program
   			  public static void main(String[] args) {

Scanner input; 
boolean a;
boolean b;
boolean c;



int randomA= (int)(Math.random()*2);
int randomB= (int)(Math.random()*2);
int randomC= (int)(Math.random()*2);
int opporation= (int)(Math.random()*4);

    if (randomA== 1) {
        a = true;
    }
    else { 
        a = false;
    }
    if (randomB== 1) {
        b = true;
    }
    else { 
        b = false;
    }
    if (randomC== 1) {
        c = true;
    }
    else { 
        c = false;
    }
    
boolean random1= a&&b&&c;
boolean random2= a&&b||c;
boolean random3= a||b||c;
boolean random4= a||b&&c;

Scanner myScanner;
myScanner = new Scanner (System.in);
    String responce;
    
if (opporation==0){
System.out.println("Does "+a+"&&"+b+"&&"+c+" have the value true (t/T) or false (f/F)?" );
    responce= myScanner.next();
    if (responce.equals("f") || responce.equals("F")){
        if (random1== false){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
    if (responce.equals("t") || responce.equals("T")){
        if (random1== true){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
}
if (opporation==1){
System.out.println("Does "+a+"&&"+b+"||"+c+" have the value true (t/T) or false (f/F)?" );
    responce= myScanner.next();
    if (responce.equals("f") || responce.equals("F")){
        if (random2== false){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
    if (responce.equals("t") || responce.equals("T")){
        if (random2== true){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
}
if (opporation==2){
System.out.println("Does "+a+"||"+b+"||"+c+" have the value true (t/T) or false (f/F)?" );
    responce= myScanner.next();
    if (responce.equals("f") || responce.equals("F")){
        if (random3== false){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
    if (responce.equals("t") || responce.equals("T")){
        if (random3== true){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
}
if (opporation==3){
System.out.println("Does "+a+"||"+b+"&&"+c+" have the value true (t/T) or false (f/F)?" );
    responce= myScanner.next();
    if (responce.equals("f") || responce.equals("F")){
        if (random4== false){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
    if (responce.equals("t") || responce.equals("T")){
        if (random4== true){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
        }
    }
}
}
}