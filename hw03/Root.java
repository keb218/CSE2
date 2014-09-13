import java.util.Scanner;

//////////////////////////////////
//Kelli Barber
//hw03
//Root program
//9/13/14
//
//This program will ask the user to 
//enter a double, and then will print
//out an estimate of the cube root of 
//the number and the value of this 
//crude guess when cubed. //

public class Root {
    //main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner; //name the scanner
        myScanner = new Scanner ( System.in );       // define myScanner
        System.out.print(
            "Enter a double, and I will print its cube root- "); //user is told to enter a double
            double x = myScanner.nextDouble(); //the number user enters is stored as 'x'
            double guess = x/3; //guess is defined 
            double guess0 = (guess*guess*guess+x)/(3*guess*guess); //guess begins to become more accurate
            double guess1 = (2*guess0*guess0*guess0+x)/(3*guess0*guess0); // each guess is slightly closer to the cube root
            double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1); //guess 2 is closer still
            double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2); //guess 3 is the closest so far
           // double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
            double crudeAnswer = guess3*guess3*guess3; //the number most accurate is defined as crude answer
        //print out the cube root and the close guess of the crude when cubed    
        System.out.println(
            "The cube root is " + guess3 + ":"
            + guess3 + "*" +guess3+ "*" +guess3 + " = "
            + crudeAnswer+ ".");
            
            
    }       
}
