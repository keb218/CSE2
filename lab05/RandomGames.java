import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//lab05
//Random games Program
//9/25/14
//
//This program will ask the user 
//to choose one of three games
//to play. If the user chooses
//roulette, then the scanner will
//print the results of a play of 
//roulette.
///////////////////////////////////

public class RandomGames {
    //main method needed for all programs
    public static void main(String[] args){
        Scanner myScanner; // name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        //ask the user which game they want to play
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        //gamechoice is set as the users answer
        String gameChoice = myScanner.nextLine();
        //user enters a correct letter
        if( gameChoice.equals("R") || gameChoice.equals("r") || gameChoice.equals("C") || gameChoice.equals("c") || gameChoice.equals("P") || gameChoice.equals("p")){
            if(gameChoice.equals("R") || gameChoice.equals("r")){ //user chooses roulette
               int rNumber = (int)(Math.random()*38); //random number is generated
               //System.out.print(rNumber);
               int number; 
               String doubleZero = "00"; //define doublezero as 00
               switch (rNumber) { //begin switch statement
                   case 37 : doubleZero = "00"; // if random number is = 37 , "00" is printed
                   System.out.print("Roulette = " + doubleZero); // print "00"
                   break;
                   default : number = rNumber; //set number as the random number
                   System.out.print("Roulette = " + rNumber); // print out the random number
               }
            }
            else{ //user enters c or p
                System.out.print("This option has yet to be implemented ");
            }
        }else if (gameChoice.length() != 1){ // user enters more letters than 1
            System.out.print("A single character expected"); 
        }else { // users input is not one of the correct choices
            System.out.print("'"+gameChoice+ "' is not one of 'R','r','C','c','P', or'p'" );
        }
    }
}