 import java.util.Scanner;
/////////////////////////////////
//Kelli Barber
//hw05
//BoolaBoola Program
//9/28/14
//
//This program will randomly assign 
//true and false to three variables. 
//An expression prints out, and the
//user is asked to state the result
//of the expression.
///////////////////////////////////

public class BoolaBoola{
    //main method needed for all java programs
    public static void main(String[] args){
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        
        boolean value1 = Math.random()< 0.5; //value1 is true if random number is less than .5
        boolean value2 = Math.random()< 0.5; //value2 is true if random number is less than .5
        boolean value3 = Math.random()< 0.5; //value3 is true if random number is less than .5
        
        int random = (int)((Math.random()*2)+1); //random is set to one or two
        int random1= (int)((Math.random()*2)+1); //random1 is set to one or two
        
        if(random==1 && random1==1){ //random and random1 = 1 (which stands for &&)
            boolean variable = (value1 && value2 && value3); //set variable equal to true or false based on this statement
            System.out.println("Does " +value1+ " && " +value2+ " && " +value3+ " have the value true( T/f) or false (F/f) ?"); //ask user whether the statement is true
            String userAnswer = myScanner.nextLine(); //save the user's answer as userAnswer
            
            if(variable ==true){ //when variable = true
                switch(userAnswer){ //brings in the user's answer
                    case "t": //if user enters t
                    case "T" : //if user enters T
                        System.out.print("Correct"); break; //the user is correct
                    case "f" : //if user enters f
                    case "F" : //if user enters F
                        System.out.print("Wrong; try again"); break;  //the user is incorrect
                    default: System.out.print("Wrong; try again"); //any other entry- the user is incorrect
                }
            }else { //when variable = false
                switch(userAnswer){ //brings in user's answer
                    case "t": //if user enters t
                    case "T" :  //if user enters T  
                        System.out.print("Wrong; try again"); break; //user is wrong
                    case "f" : //user enters f
                    case "F" : //user enters F
                        System.out.print("Correct"); break;  //user is correct
                    default: System.out.print("Wrong; try again"); //user is wrong
                }
            }
        }
            if(random==1 && random1==2){ //random = 1 and random1 = 2 (which stands for ||)
            boolean variable1 = (value1 && value2 || value3); //set variable1 equal to true or false based on this statement
            System.out.println("Does " +value1+ " && " +value2+ " || " +value3+ " have the value true( T/f) or false (F/f) ?"); //ask user if the statement is true
            String userAnswer = myScanner.nextLine(); //save user's answer as userAnswer
            
                if(variable1 ==true){ // when variable1= true
                    switch(userAnswer){ //brings in userAnswer
                        case "t": //if user enters t
                        case "T" : //if user enters T 
                            System.out.print("Correct"); break; //user is correct
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Wrong; try again"); break;  //user is incorrect
                        default: System.out.print("Wrong; try again"); //anything else is wrong
                    }
                }else{ //if variable1 = false
                    switch(userAnswer){ //brings in userAnswer
                        case "t": //if user enters t
                        case "T" : //if user enters T  
                            System.out.print("Wrong; try again"); break; //user is incorrect
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Correct"); break;  //user is correct
                        default: System.out.print("Wrong; try again"); //anything else, the user is incorect
                    }
                }
            }
            if(random==2 && random1==1){ //random = 2 and random1 = 1
            boolean variable2 = (value1 || value2 && value3); //variable2 is set to true or false based on this
            System.out.println("Does " +value1+ " || " +value2+ " && " +value3+ " have the value true( T/f) or false (F/f) ?"); //ask user if the statement is true
            String userAnswer = myScanner.nextLine(); //saves the user's answer
            
                if(variable2 ==true){ // when variable2 = true
                    switch(userAnswer){ //brings in userAnswer
                        case "t": //if user enters t
                        case "T" : //if user enters T   
                            System.out.print("Correct"); break; //user is correct
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Wrong; try again"); break; //user is wrong 
                        default: System.out.print("Wrong; try again"); //user is wrong
                    }
                }else{ //when variable = false
                    switch(userAnswer){ //brings in user's answer
                        case "t": //if user enters t 
                        case "T" :  //if user enters T  
                            System.out.print("Wrong; try again"); break; //user is incorrect
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Correct"); break; //user is correct  
                        default: System.out.print("Wrong; try again"); //anything else is wrong
                    }
                }
            }
            if(random==2 && random1==2){ //random = 2 and random1 = 2 (both ||)
            boolean variable3 = (value1 || value2 || value3); //variable3 is set to true or false based on this
            System.out.println("Does " +value1+ " || " +value2+ " || " +value3+ " have the value true( T/f) or false (F/f) ?"); //asks user if statment is true
            String userAnswer = myScanner.nextLine(); //saves user's answer
            
                if(variable3 ==true){ //when variable3=true
                    switch(userAnswer){ //brings in userAnswer
                        case "t": //if user enters t
                        case "T" :  //if user enters T  
                            System.out.print("Correct"); break; //user is correct
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Wrong; try again"); break; //user is wrong  
                        default: System.out.print("Wrong; try again"); //anything else, user is wrong
                    }
                }else { //when variable3 is false
                    switch(userAnswer){ //brings in userAnswer
                        case "t": //if user enters t
                        case "T" :  //if user enters T  
                            System.out.print("Wrong; try again"); break; //user is wrong
                        case "f" : //user enters f
                        case "F" : //user enters F
                            System.out.print("Correct"); break; //user is correct  
                        default: System.out.print("Wrong; try again"); //user is incorrect
                    }
                }
            }
    }
}