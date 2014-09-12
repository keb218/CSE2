import java.util.Scanner;
//////////////////////////
//Kelli Barber
//lab03
//BigMac program
//09/11/14
//
// This program will ask the user how 
// many Big Macs that they are ordering,
// then it will calculate the price and
// the sales tax for each burger,
// as well as the total cost.//

public class BigMac {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner; //name the scanner
        myScanner = new Scanner( System.in );
        System.out.print(
            "Enter the number of Big Macs(an integer>0): "); 
        int nBigMacs = myScanner.nextInt(); //the user input will be saved as int
        System.out.print("Enter the cost per Big Mac as "+
            "a double (in the form xx.xx): " );
        double bigMac$ = myScanner.nextDouble(); //user inputs price, saved as double
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            taxRate/=100; //user enters percent, but I want proportion
            double cost$;
            int dollars, //whole dollar amount of cost
                dimes, pennies; //for storing digits
                    //to the right of the decimal point
                    //for the cost$
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //get the whole amount, dropping decimal fraction
            dollars=(int)cost$;
            //get dimes amount, e.g.,
            //(int)(6.73 * 10) % 10 -> 67 % 10 -> 7
            //where the % (mod) operator returns the remainder 
            //after the division: 583%100 -> 83, 27%5 -> 2
            dimes = (int)(cost$*10)%10;  //cost is converted to int for dimes
            pennies = (int) (cost$*100)%10; //cost is converted to int for pennies
            //print out the final amounts
            System.out.println("The total cost of " +nBigMacs
            + " Big Macs, at $" +bigMac$ + " per Big Mac, with a " +
            " sales tax of" + (int)(taxRate*100) + "%, is $" 
            +dollars+ '.' +dimes+pennies);
            
    }
}