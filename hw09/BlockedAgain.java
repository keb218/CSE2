 import java.util.Scanner; //import scanner
 /***************************************
  * Kelli Barber
  * lab09
  * 11/1/14
  *
  * This program addresses large problems
  * in terms of subproblems and teaches
  * modularity
  *
  * ************************************/
 public class BlockedAgain {
  //method to force the user to enter an int
  public static int getInt() {
   Scanner scan = new Scanner(System.in); 
   System.out.println("Enter an int between 1 and 9, inclusive: "); //tell user to enter an int between 1 and 9
   int y = checkRange(checkInt()); //call the method checkRange, which then calls the method checkInt
   //y=checkInt(checkRange());
   return y; //return the value acquired from checkRange()
  }
  //method to check if the value entered is an int
  public static int checkInt() {
   int count = 0; //set count to zero
   Scanner scan = new Scanner(System.in); //define the scanner
   while (!(scan.hasNextInt())) { //run while the user does not enter an int
    System.out.println("You did not enter an int, try again: "); //tell the user they didnt enter an int
    scan.next(); //save the new input everytime
   }
   count = scan.nextInt(); //save count as the int the user enters
   return count; //return the final int entered
  }
  //this method checks that the int entered is in the correct range
  public static int checkRange(int x) { 
   Scanner scan = new Scanner(System.in); //name the scanner
   //checkInt();
   while (x < 1 || x > 9) { //check that the uesr's input is [1,9]
    System.out.println("You did not enter an int in [1,9], try again: "); //tell the user that their value is not [1,9]
    x = scan.nextInt(); //set y as the next int the user entrrs
   }
   return x; //return x to getInt
  }
  //method to print out pyramid
  public static int allBlocks(int x) { 
   int num = 1; //define variables
   int count = x;

   blocks(x); //call the method blocks

   return 0; //return nothing
  }
  //method to print out numbers in pyramid
  public static int blocks(int x) {
   int num = 1; //define the variables
   int i = 0;
   int space = 0;
   int count = x;
   for (num = 1; num <= count; num++) { //set num equal to 1, run loop while  num<= count, increment num
    int line = 0; //define variables
    int row = 0;
    for (line = 0; line < num; line++) { //set line equal to 0, run loop while line is less than num, increment line
     row = 0; //defnie variables
     for (space = 0; space < (count - num); space++) { //set space equal to zero, run loop while sppace is less than count-num, increment space
      System.out.print(" "); //print out spaces
     }
     for (row = 0; row < (num + i); row++) { //set row equal to zero, run loop while row<(num+i), increment row
      System.out.print(num); //print out num
     }
     System.out.print("\n"); //insert tab
    }
    i++; //increment i
    line(num, x, i); //call line method
   }
   return 0;
  }
  //method to print out spaces and dashes
  public static int line(int number, int y, int j) {
   int num = number; //define variables
   int i = j;
   int space = 0;
   int count = y;
   int dash = 0;

   for (space = 0; space < (count - num); space++) { //set space =0, run loop while space < count-num, increment space
    System.out.print(" "); //insert space
   }
   //set dash equal to zero, run loop while dash less than 1, increment dash
   for (dash = 1; dash < (num + i); dash++) { //set dash equal to zero, run while dash is less than num+i, increment dash
    System.out.print("-"); //print out dash
   }
   System.out.print("\n"); //send code to next line


   return 0;
  }
  //main method needed for all programs
  public static void main(String[] s) {
   int m; //define varaible
   //force user to enter int in range 1-9, inclusive.
   m = getInt(); //call getInt method
   allBlocks(m); //call allBlocks method
  }
 }