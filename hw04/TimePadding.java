import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//hw04
//Time Padding Program
//9/20/14
//
//This program will ask the user 
//to enter the number of seconds
//that have passed during the day 
//and displays them in normal form
///////////////////////////////////

public class TimePadding{
    //main method need for all programs
    public static void main (String[] args){
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //initialize the scanner
        
        System.out.print("Enter the time in seconds - "); //user is asked to enter seconds
        int finalSeconds = myScanner.nextInt(); //finalSeconds is initialized

        int seconds = finalSeconds%60; //seconds entered is divided by 60 and the remainder is kept
        int minutes = (finalSeconds % 3600) / 60; //seconds entered is divided by 3600, then divided by 60
        int hour = finalSeconds/3600; //seconds entered is divided by 3600
        
        if(seconds < 10){ //assuming seconds <10
            if(minutes< 10){ //assuming minutes <10
              System.out.print( "The time is " + hour + ":0" + minutes + ":0" +seconds); //the time (with zeros) is stated
            } else if (minutes > 10){ //minutes are greater than 10
               System.out.print( "The time is " + hour + ":" + minutes + ":0" +seconds); // the time is stated
            }
        
        } else if (seconds > 10){ //seconds are greater than 10
            if(minutes <10){ //minutes are less than ten
                System.out.print( "The time is " + hour + ":0" + minutes + ":" +seconds); // the time is stated
            }else if (minutes > 10){ //minutes are greater than 10
                System.out.print( "The time is " + hour + ":" + minutes + ":" +seconds); // the time is stated
            }
            
        }
    }
}
