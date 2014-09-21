import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//hw04
//Month Program
//9/20/14
//
//This program will ask the user 
//to enter an integer for month.
//The program will then say how
//many days it has
////////////////////////////////////

public class Month{
    //main method needed for all programs
    public static void main(String[] args){
         Scanner myScanner; //name the scanner
         myScanner = new Scanner (System.in); //define the scanner
         //prompt the user to enter an int for a month
         System.out.print("Enter an int giving the number of months (1-12) - ");
         
         if(myScanner.hasNextInt()){ //myScanner is using the method hasNextInt
            int month = myScanner.nextInt(); //month is initialized as the int entered
            if (month > 0 & month <13){ //month entered needs to be between 1 & 12
                if(month == 4 || month == 6 || month == 9 || month == 11){ //months are 4,6,9,or 11
                 System.out.print("The month has 30 days"); //months have 30 days
                }else if (month != 4 & month != 6 & month != 9 & month != 11 & month !=2){ //months are not 2,4,6,9,11
                    System.out.print("The month has 31 days"); //months have 31 days
                }else if (month == 2) { //month entered = 2
                    System.out.print ("Enter an int giving the year - "); //user is prompted for the year
                    int year = myScanner.nextInt(); //year is defined as nextInt
                    if ((year % 400 == 0) || (year % 4 ==0) && (year % 100 != 0)){ //leapyear is calculated
                        System.out.print("The month has 29 days"); //if its a leap year, month has 29 days
                    }else{
                        System.out.print("The month has 28 days"); //if not a leap year, month has 28 days
                    }
                }
             
            }else {
               System.out.print("You did not enter an int between 1 and 12"); //if user enters number outside of range, they are told 
            }   
        }
    }
}