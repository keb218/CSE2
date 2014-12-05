import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//hw05
//Burger King Program
//9/27/14
//
//This program will ask the user 
//to enter a choice of a burger,
//soda, or fries. The program prompts
//the user to enter the details of 
//their choices.
///////////////////////////////////

public class BurgerKing{
    //main method needed for all programs
    public static void main(String[] args){
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        
        //ask the user what they want to order
        System.out.print("Enter a letter to indicate a choice of \n   Burger (B or b) \n   Soda (S or s) \n   Fries (F or f) ");
        String menuChoice = myScanner.nextLine(); //set menuchoice as the user's answer
        String fixins; //define the variable fixins
        String soda; //define the variable soda
        String fries; //define the variable fries
        
        if(menuChoice.length() ==1) { //check that menu choice has a length of 1
            switch (menuChoice) { //start first switch statement
                case "b" : //case B and b begin
                case "B" :
                    //user is prompted to enter A, a, C, c, N, or n for fixin choices
                    System.out.print("Enter A or a for \"all the fixins\" \n  C or c for cheese \n  N or n for none of the above ");
                    fixins = myScanner.nextLine(); //fixin is set as the user's choice
                    switch(fixins){ //next switch statement begins
                        case "A" : //A and a is if the user wants all the fixins
                        case "a" :
                            //the user is told what they ordered
                            System.out.print("You ordered a burger with all the fixins"); break;
                        case "C" : //C and C is if the user wants cheese
                        case "c" :
                            //the user is told what they ordered
                            System.out.print("You ordered a burger with cheese"); break;
                        case "N" : // N and n is if the user does not want any fixins
                        case "n" :
                            //the user is told what they ordered
                            System.out.print("You ordered a burger with no fixins"); break;
                        default : //the default is if the user does not enter one of the options
                        System.out.print("You did not enter a valid response");
                    }break;
                case "S": //s and S is if the user wants a soda
                case "s":
                    //the user is asked what type of soda they want
                    System.out.print("Do you want Pepsi (P or p), \n Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
                    soda = myScanner.nextLine(); //soda is set as the user's choice
                    switch(soda){ //next switch statement begins
                        case "P" : // P and p is if the user wants pepsi
                        case "p" :
                            //The user is told what they ordered
                            System.out.print("You ordered a Pepsi"); break;
                        case "c" : //C and C is if the user wants coke
                        case "C" :
                            //the user is told what they ordered
                            System.out.print("You ordered a Coke"); break;
                        case "S" : // S and s if if the user wants sprite
                        case "s" :
                            //the user is told what they ordered
                            System.out.print("You ordered a Sprite");break;
                        case "M" : //M and m is if the user wants mountain dew
                        case "m" :
                            //the user is told what they ordered
                            System.out.print("You ordered a Mountain Dew"); break;
                        default : //default is if the user does not enter a valid response
                            System.out.print("You did not enter a valid response");
                    }break;
                case "f" : //f and F are if the user wants fries
                case "F" :
                    //the user is asked what size fries they want
                    System.out.print("Do you want a larger or small order of fries (L, l, S, or s)-");
                    fries = myScanner.nextLine(); //fries is set as the user's answer
                    switch(fries){ 
                        case "l" : //l and L is if the user wants large fries
                        case "L" :
                            //the user is told what they ordered
                            System.out.print("You ordered large fries"); break;
                        case "s" : //S and s is if the user ordered small fries
                        case "S" :
                            //the user is told what they ordered
                            System.out.print("You orderd a small order of fries"); break;
                        default :  //default is if they didnt enter a valid response
                            System.out.print("You did not enter a valid response");
                    }break;
                default : //default of the first switch statement is if they didnt enter a valid letter
                    System.out.print("You did not enter any of B, b, S, s, F, or f");
                }
        } else { //the user did not enter a single character
            System.out.print("A single character expected");
        }
    }
}