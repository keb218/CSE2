import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//hw04
//Course Number Program
//9/20/14
//
//This program will ask the user 
//to enter their six digit course
//code. The program will write the 
//year and semester of the course
////////////////////////////////////

public class CourseNumber{
    public static void main(String[] args){
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        //prompt the user to enter an int for the course number
        System.out.print("Enter a six digit number giving the course semester- ");
       
        
        if(myScanner.hasNextInt()){ //if user enters an int
            int courseNum = myScanner.nextInt(); //initialize courseNum as the number the user enters
            
            if (courseNum < 186510 || courseNum > 201440){ //checks that the number is in range
                System.out.print("The number was outside the range [186510, 201440]"); //tells user if it is not in range
            }else if (courseNum % 100 == 10){ // checks if the last two digits are 10
                System.out.print("The course was offered in the Spring semester of " + (int)(courseNum/100)); //course is in the spring
            }else if(courseNum % 100 == 20){ //checks if last two digits are 20
                System.out.print("The course was offered in the Summer 1 semester of " + (int)(courseNum/100)); //course is in summer 1
            }else if(courseNum % 100 == 30){ //checks if last two digits are 30
                System.out.print("The course was offered in the Summer 2 semester of " + (int)(courseNum/100)); // course is in summer 2
            }else if (courseNum % 100 == 40){ //checks if last two digits are 40
                System.out.print("The course was offered in the Fall semester of " + (int)(courseNum/100)); //course is in the fall
            }else if (courseNum % 100 != 10 & courseNum % 100 != 20 & courseNum % 100 != 30 & courseNum % 100 != 40 ){ //checks if invalid number is entered
                System.out.print( (courseNum % 100) + " is not a legitimate semester");// number is not legitimate
            }
        }else{ //user does not enter an int
            System.out.print("You did not enter an int"); //user is told that the number is incorrect
        }    
    }
}