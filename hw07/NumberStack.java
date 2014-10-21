 import java.util.Scanner; //import scanner
 /////////////////////////////////
 //Kelli Barber
 //hw08
 //Number Stack Program Program
 //10/17/14
 //
 //This program will ask a user to 
 //enter an int between 1 and 9. It
 //will then print out a number stack
 ///////////////////////////////////

 public class NumberStack {
  //main method needed for all programs
  public static void main(String[] args) {
   Scanner myScanner; //name the scanner
   myScanner = new Scanner(System.in); //define the scanner


   System.out.print("Enter an int between 1 and 9 - "); //ask the user to enter a correct int
   if(myScanner.hasNextInt()){ //check if input is an int
   int count = myScanner.nextInt(); //count is the user's input if int is entered
   
   //define the variables
   int num = 1;
   int i = 0;
   int dash = 0;
   int space = 0;
   
   if(count>0 && count<10){ //check that the input is in the correct range
   System.out.println("This is the while loop"); //define which loop
   while (num <= count) { //check that num is <= the user input
    int line = 0; //redefine variables every loop
    int row = 0;
    while (line < num) { //run loop until line=num
     row = 0;//redefine variables every loop
     dash = 0;
     space=0;
     while (space < (count-num)) { //run while space is less than user input-number
      System.out.print(" "); //print the spaces
      space++; //increment space
     }
     while (row < (num + i)) { //run loop until row = num+i
      System.out.print(num);//print out num
      row++; //increment row
     }
     System.out.print("\n"); //insert tab
     line++; //increment line
    }
    space = 0; //set space =0
    while (space < (count-num)) { //run until space = count-num
      System.out.print(" "); //print out spaces
      space++; //increment space
     }
    while (dash < 1) { //run while dash<1
     while (dash < (num + i)) { //run while dash< num +i
      System.out.print("-"); //print dashes
      dash++; //increment dash
     }
     System.out.print("\n"); //inset tab
    }
    num++; //increment num
    i++;// increment i
    }
    
   System.out.println("This is the do-while loop"); //tells user program is running a do-while loop
   int j = 0; // define variables
   num = 1;
   do { //begin outer do while loop
    int line = 0; //redefine variables
    int row = 0;
    do {
     row = 0;//redefine varaibles
     dash = 0;
     space = 0;
     do{
      System.out.print(" "); //print spaces
      space++; //increment spaces
     }while (space < ((count+1)-num)); //run until space +count+1-num 
     do {
      System.out.print(num); //print out num
      row++; //increment row
     } while (row < (num + j)); //run loop while the row is less than num+j
     System.out.print("\n"); //insert tab
     line++; //incremnet line
    } while (line < num); //run while line is less than num
    do {
     space=0; //redefine space
     do{
      System.out.print(" "); //print out spaces
      space++; //increment space
     }while (space < ((count+1)-num)); //run loop while space is less than count + one - num 
     do {
      System.out.print("-"); //print dashes
      dash++; //increment dash
     } while (dash < (num + j)); //run loop while dash is less than num+j
     System.out.print("\n"); //insert tab
    } while (dash < 1); //run loop while dash < 1
    num++; //increment num
    j++; //increment 
   } while (num <= count); //rrun loop while num is less than or equal to count 

   System.out.println("This is the for loop"); //tell user that the for loop is running 
   i = 0; //define the varialbes
   for (num = 1; num <= count; num++) { //set num equal to 1, run loop while  num<= count, increment num
    int line = 0;//define variables
    int row = 0;
    for (line = 0; line < num; line++) { //set line equal to 0, run loop while line is less than num, increment line
     row = 0; //defnie variables
     dash = 0;
     for(space=0;space < (count-num); space++) { //set space equal to zero, run loop while sppace is less than count-num, increment space
      System.out.print(" "); //print out spaces
     }
     for (row = 0; row < (num + i); row++) { //set row equal to zero, run loop while row<(num+i), increment row
      System.out.print(num); //print out num
     }
     System.out.print("\n"); //insert tab
    }
    for(space=0;space < (count-num); space++) { //set space =0, run loop while space < count-num, increment space
      System.out.print(" "); //insert space
     }
    for (dash = 0; dash < 1; dash++) { //set daso equal to zero, run loop while dash less than 1, increment dash
     for (dash = 0; dash < (num + i); dash++) { //set dash equal to zero, run while dash is less than num+i, increment dash
      System.out.print("-"); //print out dash
     }
     System.out.print("\n"); //insert tab
    }
    i++; //increment i 
   }
   }else{ //if count is not in the range[1,9]
    System.out.println("You did not enter an int in the range"); //tells user that they did not enter an int in the correct range
   }
  }else{ //user did not enter an int
   System.out.println("You did not enter an int"); //tells user that they did not enter an int
  }
 }
}