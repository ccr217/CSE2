//Caroline Ruffing
// The program will tell the semester a course is offered from the course number.

import java.util.Scanner;
public class CourseNumber {
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner (System.in);

System.out.print("Enter a six digit number giving the course semester: ");
 int courseNumber = myScanner.nextInt();
 
    if ((courseNumber>=186510) && (courseNumber<=201440)){
        int year= (courseNumber/100);
        int term= (courseNumber- (year*100));
            if (term==10){
             System.out.print("The course was offered in the Spring semester of "+year+"");
            }
            else if (term==20){
             System.out.print("The course was offered in the Summer 1 semester of "+year+"");
            }
            else if (term==30){
             System.out.print("The course was offered in the Summer 2 semester of "+year+"");
            }
            else if (term==40){
             System.out.print("The course was offered in the Fall semester of "+year+"");
            }
            else{
             System.out.print(""+term+" is not a legitimate semester");

            }
    }
    else{
        System.out.print("The number was outside the range [186510,201440]");
    }
   			}
}