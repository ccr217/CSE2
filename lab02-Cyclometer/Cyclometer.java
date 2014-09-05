//Caroline Ruffing 
// CSE 002 Section 111
//Lab 02
//Cyclometer Java Program

//  define a class
public class Cyclometer {
    
    // main method required for every Java program
    public static void main (String [] args) {
    
        // input data
        int secsTrip1=480; // time for Trip 1
        int secsTrip2=3220; // time for Trip 2
        int countsTrip1=1561; // rotations for Trip 1
        int countsTrip2=9037; // rotations for Trip 2
    
        // intermediate variables and output data
        double wheelDiameter=27.0, // bike wheel diameter
        PI=3.14159, // pi to a significant decimal
        feetPerMile=5280, // feet per mile
        inchesPerFoot=12, // inches per foot
        secondsPerMinute=60; // seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance; // allows decimal values
        
        // print Trip 1 seconds and count
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        // print Trip 2 seconds and count
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        //run the calculations
        distanceTrip1=countsTrip1*wheelDiameter*PI; // calc distance of Trip 1 in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; // calc distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // calc distance of Trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; // calc total distance
         
        //Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");

    } // end of main method
    
} //end of class