import java.util.Scanner;

////////////////////////////
//Kelli Barber
//lab03
//BigMac lab
//09/18/14
//
// This program will ask the
// user how many BigMacs they 
// want and whether they want 
// an order of fries.
// The program will then calculate
// the total cost of the meal. //

public class BigMacAgain {
    // main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner; // name the scanner
        myScanner = new Scanner ( System.in ); //initialize the scanner
        
        //define the variables 
        double burger$ = 2.22; //initialize burger price
        double fries$ = 2.15; //initialize fry price
        String answer; //define answer
        int nBurgers; //define burger amount
         
        System.out.print(
            "How many Big Macs would you like to order? " ); //ask the user the amount of Big Macs they want
             
             if (myScanner.hasNextInt()) {  //tell the scanner to check that the answer was an int
                 nBurgers = myScanner.nextInt(); //initialize the burger amount to be what the user entered
                
                if(nBurgers>0) { //intsructing what to do if the burger amount is greater than zero
                 
                    System.out.print("You ordered " + nBurgers + " Big Macs for a cost of "
                    + nBurgers + "x" +burger$ + " = $" +(int)((nBurgers*burger$)*100)/100.0); // The user is told the total cost of Big Macs
                }
                else if(nBurgers<0) { //instructing what to do if the user enters a negative number
                    System.out.print ("You did not enter an int > 0 "); //the user is told that they did not enter correctly
                    return; //the program exits
            }else { // the user does not enter an int originally
                System.out.print("You did not enter an int"); //they are told they did not enter an int
                return; //the program exits
             }
        System.out.print("\n Do you want an order of fries (Y/y/N/n)? "); //the user is asked if they want fries
            answer=myScanner.next(); //their answer is set to what the user enters next
            
            if(((answer.equals("Y")) || (answer.equals("y")))){ //if their answer is Y or y
                System.out.print("You ordered fries at a cost of $" +fries$+ "."); //the user is told the cost of fries
                System.out.print(" \n The total cost of the meal is $" + (int)((fries$+(nBurgers*burger$))*100)/100.0); //the total cost of the meal is calculated and given
              
            }else if (((answer.equals("N")) || (answer.equals("n")))) { //the user enters N or n
                System.out.print("The total cost of the meal is $" + (int)((nBurgers*burger$)*100)/100.0); // the total for the meal is given
            }else {
                System.out.print ("You did not enter one of \'y\', \'Y\', \'n\', or \'N\'"); // the user did not enter y,Y,n, or N. program exits
                return;
             }
             }
    }
             
}   
       
