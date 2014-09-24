//Caroline Ruffing
// The program will tell the semester a course is offered from the course number.

import java.util.Scanner;
public class TimePadding {
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print("Enter the time in seconds: ");
 int time = myScanner.nextInt();
        
        int hours= time/3600;
        int minutes= (time-(hours*3600))/60;
        int seconds= time-(hours*3600)-(minutes*60);
    if ((minutes<10)&&(seconds<10)){
        System.out.print(""+hours+":0"+minutes+":0"+seconds+"");// printing if minutes and seconds are less than 10
    }
    else if (minutes<10){
        System.out.print(""+hours+":0"+minutes+":"+seconds+"");// printing if minutes are less than 10
    }
    else if (seconds<10){
        System.out.print(""+hours+":"+minutes+":0"+seconds+"");// pringing if seconds are less than 10
    }
    else{
        System.out.print(""+hours+":"+minutes+":"+seconds+"");// printing if seconds and minutes are both over 10
    }
   			}
}