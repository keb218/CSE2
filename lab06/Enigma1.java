/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String[] arg){
    double percent; //initialize variable
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble()); //x is set as what user enters
   System.out.println("You entered "+x+"%"); //x is printed as a percent
   //print out the proportion remaining for select percentages
   double newX =(1-x/100); //formula to find proportion remaining
      System.out.println("The proportion remaining is "+ newX);
   }


/* Error report: 
The program was made much more complicated than it needed to be.
Without the if statement, we can define a new varaible using the
formula, and let every number be solved rather than just 7, 41, 14
33, and 60. Now, all the values between 0 and 99 work correctly.
*/