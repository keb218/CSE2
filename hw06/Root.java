 import java.util.Scanner;
/////////////////////////////////
//Kelli Barber
//hw06
//Root Program
//10/13/14
//
//This program will compute the 
//square root of a number.  It will 
//then print it out
///////////////////////////////////

public class Root{
    //main method needed for all strings
    public static void main(String[] args){
        Scanner myScanner; //name the scanner
        myScanner= new Scanner (System.in); //define the scanner
        
        System.out.println("Enter a double greater than zero, and I will find the square root"); //user is told to enter a double
        double x =myScanner.nextDouble(); //the input from the user is saved as 'x'
        
        double low = 0; //low is set to zero
        double high = (1+x); //high is set to one plus whatever value the user entered
        double middle = (low+high)/2.0; //middle is found by averaging the values
        
        if(x>0){ //check that x is positive and not equal to zero
            while((high-low)>(0.000000001*(1+x))){ //run the program until the difference between high and low is tiny
                if ((middle*middle)>x){ //check if the sqaure of middle is greater than x
                    high=middle; //set high equal to middle
                }else{ //square of middle is lower than x
                    low=middle;  //low is set to middle
                }
                middle = (low+high)/2.0; //redefine middle as average
            }
            System.out.println("The square root of the number is " +middle); //print out the sqaure root for the user's input
        }else{
            System.out.println("You cannot find the square root"); //user enterer 0 or negative
        }
    }
}