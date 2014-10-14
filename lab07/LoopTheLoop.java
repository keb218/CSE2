import java.util.Scanner;
/*********************
 * Kelli Barber
 * lab 07
 * Loop The Loop program
 * 10/9/14
 * 
 * This program will ask the user to 
 * enter an int within the range [1-15].
 * That number of stars will print out,
 * then the "star tree" will build down
 * from one to whatever number the user entered
 * ****************************/
 
 public class LoopTheLoop{
     public static void main(String[] arg){
         Scanner myScanner;
         myScanner = new Scanner (System.in);
         
         int nStars=10;
         int i = 0;
         int j = 1;
         
         
         while(true){ 
          System.out.print("Enter a number in the range [1-15] ");
          
          if(myScanner.hasNextInt()){
           nStars = myScanner.nextInt();
           if(nStars >0 && nStars<16 ){
            i=0;
            while(i < nStars){
                System.out.print("*");
                i++;
            }
            System.out.println();
            j=1;
            while(j<(nStars+1)){
             i=0;
             while(i<j){
              System.out.print("*");
              i++;
             }
             System.out.println();
             j++;
            }
           }else{
            System.out.println("Your int was not in the range [1-15]");
           }
           System.out.println("enter Y or y to go again");
           String answer = myScanner.next();
           if (!answer.equals("y") && !answer.equals ("Y")){
            break;
           }
          }else{
          System.out.print("You did not enter an integer");
          break;
         }
        }
     }
 }