 import java.util.Scanner;
 /***************************************
  * Kelli Barber
  * lab09
  * 10/22/14
  *
  * This program uses three different
  * methods that are called by the
  * main program. It will determine
  * the larger of three ints and
  * whether they are in descending order
  * ************************************/

public class Methods {
    //method to get number from scanner
    public static int getInt(Scanner scan) { 
        int value=0; //set value to 0
        System.out.println("Enter an int- ");
         while(!scan.hasNextInt()){ //check if user enters int
             System.out.println("Enter a valid int, try again- "); //ask user to try again
             scan.next(); //save users number
         }
        value = scan.nextInt(); //set value as users input
        return value;
    }
    //method to check for larger number
    public static int larger(int a, int b) {
         int answer=0;//set answer=0;
         if (a > b) {//check that a >b
             answer = a; // answer is a
         } 
         else if (b > a) { // check if b>a
             answer = b; //answer is b
         }
         return answer; //return the answer
     }
     public static boolean ascending(int a, int b, int c) {
         
         return (a < b & b < c); //return whether this statement is true or false
     }
     public static void main(String[] arg) {
         //main method needed for all programs
         Scanner scan = new Scanner(System.in); //name scanner scan
         int a, b, c; //declare variables
         System.out.println("Enter three ints"); 
         a = getInt(scan); //call method getInt
         b = getInt(scan);
         c = getInt(scan);
         System.out.println("The larger of " + a + " and " + b + " is " + larger(a, b)); //print out larger value
         System.out.println("The larger of " + a + ", " + b + ", and " + c +
             " is " + larger(a, larger(b, c))); //print out larger value of three values
         System.out.println("It is " + ascending(a, b, c) + " that " + a + ", " + b +
            ", and " + c + " are in ascending order"); //print out whether values were entered in ascendig value
     }
 }