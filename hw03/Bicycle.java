import java.util.Scanner;

///////////////////////////
//Kelli Barber
//hw03
//Bicycle program
//9/12/14
//
//This program will compute the distance
//traveled and the average miles per 
//hour from the number of counts on a 
//cyclometer and the number of seconds 
//during which the counts occcured. //

public class Bicycle {
    //main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner; //name the scanner 
        myScanner = new Scanner( System.in ); //myScanner is defined
        System.out.print(
            "Enter the number of counts: "); //user is prompted to enter the counts
            int nCounts = myScanner.nextInt(); // the count are saved as nCounts
        System.out.print(
            "Enter the number of seconds: "); //user is prompted to enter the number of seconds
            int nSeconds = myScanner.nextInt(); // seconds are saved as nSeconds
        double wheelDiameter=27.0, //wheel diamter is set
        PI=3.14159, //PI is defined
        feetPerMile=5280,  //the feet er mile is defined
        inchesPerFoot=12,  //inches per foot is defined 
        secondsPerMinute=60; //seconds per minute is defined
        double totalDistance, totalTime, averageMPH;  //totals to print out are doubles
        //calculations
         totalDistance= nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; // calculate total distance
         totalTime=nSeconds/secondsPerMinute; //calculate total time
         averageMPH=(60/totalTime)*totalDistance; //calculate average mph
         //print out the final totals calculated
         System.out.println("The distance was " + (int)(totalDistance*100)/100.0+ " miles and took " 
         + totalTime + " minutes.");
         System.out.println("The average mph was " + (int)(averageMPH*100)/100.0 + ".");
    }
}
