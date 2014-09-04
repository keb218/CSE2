///////////////////////////////////////
// Kelli Barber
// lab02
// Cyclometer Program
//
// This program will print:
// a. number of minutes for each trip
// b. number of counts for each trip
// c. distance of each trip in miles
// d. distance of for the two trips combined
//
// First compile the program 
// javac Cyclometer.java
// Then run the program
// java Cyclometer //

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
    
    //our input data
    int secsTrip1=480; //the first trip is set to 480 seconds
    int secsTrip2=3220; //the second trip is set to 3220 seconds
    int countsTrip1=1561; //the number of rotations for trip 1 is 1561
    int countsTrip2=9037; //number of rotations for trip 2 is 9037
    double wheelDiameter=27.0, //the wheel diamter is 27.0
    PI=3.14159, // this will be used later in formulas
    feetPerMile=5280, //this will be used later to change feet to miles
    inchesPerFoot=12, //used later in calculations
    secondsPerMinute=60; //used later in calculations
    double distanceTrip1, distanceTrip2, totalDistance; //these variables will be defined later
    
    //print out numbers that have been stored for seconds and counts
    System.out.println("Trip 1 took " +
        (secsTrip1/secondsPerMinute) + " minutes and had " +
        countsTrip1+ " counts."); //determines length of trip 1 in minutes, and prints counts
    System.out.println("Trip 2 took " +
        (secsTrip2/secondsPerMinute) +" minutes and had "+
        countsTrip2 + " counts."); //determines length of trip 2 in minutes and displays counts
        
    //run the calculations; store the values. 
    //Calculate the values for the distances.
    
    distanceTrip1=countsTrip1*wheelDiameter*PI; 
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diamter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    //print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles.");
    System.out.println("Trip 2 was "+distanceTrip2+" miles.");
    System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}