 import java.util.Scanner;
/////////////////////////////////
//Kelli Barber
//hw06
//Roulette Program
//10/13/14
//
//This program will use a random 
// number generator to simulate a 
//person's betting on 100 spins. 
//It will then collect data on the 
//outcome, and tell the user if they
//won or lost money
///////////////////////////////////

public class Roulette{
    //main method needed for all programs
    public static void main(String[] args){
        Scanner myScanner; //name the scanner
        myScanner= new Scanner(System.in); //define the scanner
    //initialize all variables as 0    
        int spin=0;
        int loser=0;
        int simulation=0;
        int money=0;
        int profit = 0;
        int totalMoney=0;
        int luck=0;
        
        while(simulation<1000){ //simulation runs until it equals 1000
            int bet = (int)(Math.random()*38); //portray user's bet
            spin =0; //set spin to zero
            luck=0; //set luck to zero
            while(spin < 100){ //runs until spin equala 100
                int spinValue = (int)(Math.random()*38); //portrays spin for roulette
                if(bet==spinValue){ //check if player's bet and spin are equal
                    luck++; //if equal, luck increases by one
                }
                spin++; //spin increases
            } 
           money = luck*36; //money made is found for each round
           totalMoney += luck*36; //total money made is found
           if (money> 100) { //when money is greater than 100, user made money
              profit++; //profit count increases
           } else if (money==0){ //when money made =0, user lost everything
               loser++; //loser count increases
            
           }
            simulation++; //simulation count increases
        }
        //user is told how much they made, how many times they lost, and how many times they won
        System.out.println("Out of 1000 simulations, your total winnings are $" +totalMoney+  
        " and you lost everything " +loser+ " times and you made a profit " +profit+ " times");
    }
}