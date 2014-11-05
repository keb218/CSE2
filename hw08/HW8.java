 import java.util.Scanner; //import scanner
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

 public class HW8 {
   //method of char type, imports scanner and strin
   public static char getInput(Scanner scan, String str) {
     String input = scan.next(); //input is set as first value user enters
     char c1 = str.charAt(0); //c1-first char of str
     char c2 = str.charAt(1); //c2-first char of str

     while (true) { //infinite loop
       while (input.length() != 1) { //run while length is not equal to 1
         System.out.println("You should enter exactly one character- "); //tell user to enter one char
         input = scan.next(); //save input as input
       }
       char x1 = input.charAt(0); //set x1 equal to the character entered

       if (x1 == c1) { //check if x1 = c1
         return c1; //return  first character in inputted string 
       }
       else if (x1 == c2) { //if x=c2
         return c2; //return second character in inputted string
       }
       else { //if x1 does not equal c1 or c2
         System.out.println("You did not enter a character from the list 'Cc'; try again- "); //tell user to try again
         input=scan.next(); //save what user enters as input
       }
     }
   }
   //method if type char, imports scanner, string, and int
   public static char getInput(Scanner scan, String str, int five) {
     int x = 0; //initializes x as 0
     char user; //defines user
     str = scan.next(); //sets str as what user enters
     while (x < five) { //runs while x<5
       if (!str.equals("y") && !str.equals("Y") && !str.equals("n") && !str.equals("N")) { // if str does not equal y,Y,n,N
         System.out.println("You did not enter a character from the list 'yYnN'; try again- ");//tells user to try again
         str = scan.next(); //saves str as users next input
       }
       else {
         break; // if str =y,Y,N,orN, break
       }
       x++; //increment x
     }
     if (x == 5) { //if x =5
       System.out.println("You have failed after five times"); //tell user they failed
     }
     user = str.charAt(0); //convert str to char
     return user; //return char
   }
   //method type char, overloaded method "get input",input is scanner, string, and string
   public static char getInput(Scanner scan, String str, String str1) {
     // set c0...c9 equal to place in second string
     char c0 = str1.charAt(0); 
     char c1 = str1.charAt(1);
     char c2 = str1.charAt(2);
     char c3 = str1.charAt(3);
     char c4 = str1.charAt(4);
     char c5 = str1.charAt(5);
     char c6 = str1.charAt(6);
     char c7 = str1.charAt(7);
     char c8 = str1.charAt(8);
     char c9 = str1.charAt(9);
     
     while (true) {//infinite loop
     System.out.println(str); //print out first inputted string
     System.out.println("Enter one of:'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',- "); //user should enter one of these
     String input = scan.next(); //input is set as uesrs input

     
       while (input.length() != 1) { //runs while inputs length is not zero
         System.out.print("You should enter exactly one character- "); //user is told to enter one character
         input = scan.next(); //input is set as the users new input
       }
       char x1 = input.charAt(0); //string is converted to char
       int y = 0; //y is initialized
       //for each if statement, x1 is set equal to c0....c9. if x1 equals one of c0...c9, one of c0...c9 is returned
       if (x1 == c0) {
         return c0;
       }
       else if (x1 == c1) {
         return c1;
       }
       else if (x1 == c2) {
         return c2;
       }
       else if (x1 == c3) {
         return c3;
       }
       else if (x1 == c4) {
         return c4;
       }
       else if (x1 == c5) {
         return c5;
       }
       else if (x1 == c6) {
         return c6;
       }
       else if (x1 == c7) {
         return c7;
       }
       else if (x1 == c8) {
         return c8;
       }
       else if (x1 == c9) {
         return c9;
       }
       else {//if x1 doesnt equal c0..c9 tell user that they did not enter an acceptable character
         System.out.println("You did not enter an acceptable character");
         
       }
     }
   }
   //main method needed for all programs
   public static void main(String[] arg) { 
     char input; //define input
     Scanner scan = new Scanner(System.in); //define scanner
     System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //tell user to enter c or C
     input = getInput(scan, "Cc"); //call first getInput method, run method
     System.out.println("You entered '" + input + "'"); //tell user what they entered
     System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //call second getInput method, run method
     input = getInput(scan, "yYnN", 5); //give up after 5 attempts
     if (input != ' ') { //when input is not equal to nothing ('')
       System.out.println("You entered '" + input + "'"); //tell user what they entered
     }
     input = getInput(scan, "Choose a digit.", "0123456789"); //call third getInput method, run method
     System.out.println("You entered '" + input + "'"); //tell user what they entered
   }
 }