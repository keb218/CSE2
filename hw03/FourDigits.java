import java.util.Scanner; //needed for user inputs

///////////////////////////
//Kelli Barber
//hw03
//FourDigits Program
//9/13/14
//
// This program will ask the user to 
//enter a double. It will then print
// out the first four digits to the 
//right of the decimal point // 

public class FourDigits{
    //main method neeeded for every program
    public static void main(String[] args) {
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        //as a user for a double
        System.out.print(
            "Enter a double and I display the four digits to the right of the decimal point- ");
            double x = myScanner.nextDouble(); //x is defined as the number the user enters
            double x2 = (int)(x*10000); //x is multiplied by 10000 and casted to an int
            int x3 = (int)(x2 % 10000); //x is divided by 10000 and the remainder shows
         String formattedx3 = String.format("%04d", x3 ); //formats the string so that there are always 4 numbers- fills empty spaces with zeros
        //the last four digits are printed out    
        System.out.println(
            "The four digits are " + formattedx3+ "."); //prints out the formatted answer for the user
    }
}