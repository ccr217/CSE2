//Caroline Ruffing 
// CSE 002 Section 111
//Homework 02
//Arithmetic Java Program

//  define a class
public class Arithmetic {
    
    // main method required for every Java program
    public static void main (String [] args) {
    
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes 
        double envelopeCost$=3.25;
        double taxPercent=0.06;

        //run the calculations
        double sockTax$=sockCost$*taxPercent; //tax on socks
        double glassTax$=glassCost$*taxPercent; // tax on glasses
        double envelopeTax$=envelopeCost$*taxPercent; // tax on envelopes
        
        double socksNoTax$= sockCost$*nSocks;// cost of all socks before tax
        double glassesNoTax$= glassCost$*nGlasses;// cost of all glasses before tax
        double envelopesNoTax$= envelopeCost$*nEnvelopes;// cost of all envelopes before tax
        
        double totalSocksTax$= nSocks*sockTax$; // tax on all the socks
        double totalGlassesTax$= nGlasses*glassTax$; // tax on all the glasses
        double totalEnvelopesTax$= nEnvelopes*envelopeTax$; // tax on all the envelopes
        
        double totalSockCost$=nSocks*(sockTax$+sockCost$); // Total cost all of socks with sales tax
        double totalGlassCost$=nGlasses*(glassTax$+glassCost$); // Total cost of all glasses with sales tax
        double totalEnvelopeCost$=nEnvelopes*(envelopeTax$+envelopeCost$); // Total cost of all envelopes with sales tax
        
        double totalPurchases$=(sockCost$*nSocks)+(glassCost$*nGlasses)+(envelopeCost$*nEnvelopes); // Total cost of purchases before tax
        double totalTax$=totalPurchases$*taxPercent; // Total sales tax
        double totalPurchasesTax$=totalPurchases$+totalTax$; // Total cost with tax
        
        //Print out the output data.
        System.out.println("Socks");
        System.out.println("-----");
        System.out.println("Pairs bought: "+nSocks+"");
        System.out.println("Cost per pair: (before tax) $"+sockCost$+"");
        System.out.println("Total cost of socks (before tax): $"+socksNoTax$+"");
        System.out.println("Total tax of socks: $"+totalSocksTax$+"");
        System.out.println("Total cost of socks (after tax): $"+totalSockCost$+"");
        System.out.println(" ");
        
        System.out.println("Drinking Glasses");
        System.out.println("----------------");
        System.out.println("Glasses bought: "+nGlasses+"");
        System.out.println("Cost per glass (before tax): $"+glassCost$+"");
        System.out.println("Total cost of glasses (before tax): $"+glassesNoTax$+"");
        System.out.println("Total tax of glasses: $"+totalGlassesTax$+"");
        System.out.println("Total cost of glasses (after tax): $"+totalGlassCost$+"");
        System.out.println(" ");
        
        System.out.println("Envelopes");
        System.out.println("---------");
        System.out.println("Envelopes bought: "+nEnvelopes+"");
        System.out.println("Cost per Envelopes: (before tax) $"+envelopeCost$+"");
        System.out.println("Total cost of envelopes (before tax): $"+envelopesNoTax$+"");
        System.out.println("Total tax of envelopes: $"+totalEnvelopesTax$+"");
        System.out.println("Total cost of envelopes (after tax): $"+totalEnvelopeCost$+"");
        System.out.println(" ");

        System.out.println("Totals");
        System.out.println("------");
        System.out.println("Total cost of items (before tax): $"+totalPurchases$+"");
        System.out.println("Total tax: $"+totalTax$+"");
        System.out.println("Total cost of items (including tax): $"+totalPurchasesTax$+"");
        System.out.println(" ");
    } // end of main method
    
} //end of class