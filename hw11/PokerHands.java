//import classes needed for program
import java.util.Scanner;
import java.util.Random;
import java.util.Comparator;
/*************************
 * Kelli Barber
 * hw11
 * 12/1/2014
 * 
 * This program will ask the user
 * to enter a five card hand. The
 * program will then print out
 * rank.
 * ************************/
 public class PokerHands{
    //main method needed for all programs 
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);//name scanner
        int [] deck = new int [51];//array for deck
        int [] hand = new int [5];//array for hand
        int [] freqRank = new int [13]; // array to count the frequency of each rank
        int [] freqCount = new int [5]; //array to count the frequencies of the frequency of each rank
        int cardNum=0; //initialize card num to zero
        //int count=1;
        for(int i =0; i<deck.length; i++){//initialize values of the deck to be between 0 and 51
            deck[i]=i;
        }
       while(true){ //infinite loop
           System.out.println("\n Enter 'Y' or 'y' to enter a(nother) hand");
           for(int i=0; i<freqRank.length; i++){
               freqRank[i]=0;
           }
           String input = scan.next(); // save users input as string
           if(input.equals("Y") || input.equals("y")){ //check if user entered y or Y
           }else{ break;} //if they didnt enter y or Y, break out of loop
         for(int j=0;j<hand.length;j++){ // run while j is less than hand.length
           System.out.print("Enter the suit: 'c', 'd', 'h', or 's' -");
           String input1= scan.next(); //save suit as input1
           switch (input1){ //for clubs, cardNum starts at 0, for diamonds, 13, hearts, 26, spades, 39
               case "c": cardNum=0; break;
               case "d": cardNum=13; break;
               case "h": cardNum=26; break;
               case "s": cardNum=39; break;
               default: System.out.println("You did not enter a valid respone"); break; //if the user doesnt enter c,h,d,s
           }
           System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', '9', '8', '7', '6', '5', '4', '3', '2' - ");
           String input2 = scan.next(); //set input2 as rank entered
           switch (input2){ //for each rank entered, add the value of the cardNum, count the freqRank
               case "a" : cardNum +=0; freqRank[0] += 1; break;
               case "k" : cardNum +=1; freqRank[1] += 1; break;
               case "q" : cardNum +=2; freqRank[2] += 1; break;
               case "j" : cardNum +=3; freqRank[3] += 1; break;
               case "10": cardNum +=4; freqRank[4] += 1; break;
               case "9" : cardNum +=5; freqRank[5] += 1; break;
               case "8" : cardNum +=6; freqRank[6] += 1; break;
               case "7" : cardNum +=7; freqRank[7] += 1; break;
               case "6" : cardNum +=8; freqRank[8] += 1; break;
               case "5" : cardNum +=9; freqRank[9] += 1; break;
               case "4" : cardNum +=10;freqRank[10] += 1; break;
               case "3" : cardNum +=11;freqRank[11] += 1; break;
               case "2" : cardNum +=12;freqRank[12] += 1; break;
               default: System.out.println("You did not enter a correct value"); break; // if the user does not enter a valid rank
           }
           int counter=0;
           int correct=0;
           hand[j] = cardNum; //set value for each card in hand
           if (j>0){
               for(int i= j-1; i>=0; i--){ 
               if(hand[j] == hand[i]){
                   System.out.println("You already entered that card.");
                    counter++; 
                    switch (input2){ //for each rank entered, add the value of the cardNum, count the freqRank
               case "a" : freqRank[0] -= 1; break;
               case "k" : freqRank[1] -= 1; break;
               case "q" : freqRank[2] -= 1; break;
               case "j" : freqRank[3] -= 1; break;
               case "10": freqRank[4] -= 1; break;
               case "9" :  freqRank[5] -= 1; break;
               case "8" : freqRank[6] -= 1; break;
               case "7" :  freqRank[7] -= 1; break;
               case "6" : freqRank[8] -= 1; break;
               case "5" : freqRank[9] -= 1; break;
               case "4" : freqRank[10] -= 1; break;
               case "3" : freqRank[11] -= 1; break;
               case "2" : freqRank[12] -= 1; break;
               default: System.out.println("You did not enter a correct value"); correct++; break; //tell user they didnt enter a correct value, increment correct, and break
               }
               }
           }
           if(correct==1){ //cif the user entered an incorrect value
               break; //break out of program
           }
           }
           if(counter>0){ //if counter is greater than 0, decrement j
               j--;
           }
       }
       for(int i=0; i<freqRank.length; i++){ //run while i is less than freqRank.length
           //count the freqRanks that are 0,1,2,3,4, add to freqCount
           if (freqRank[i]==0){
               freqCount[0]++;
           }else if(freqRank[i]==1){
               freqCount[1]++;
           }else if(freqRank[i]==2){
               freqCount[2]++;
           }else if(freqRank[i]==3){
               freqCount[3]++;
           }else if (freqRank[i]==4){
               freqCount[4]++;
           }
       }
      showOneHand(hand);//call method showOneHand for hand
       handWinner(freqRank, hand); //call method handWinner using freqRank, freqCount, and hand
       
    }
    }
    
     public static void showOneHand(int hand[]){ //method called showOneHand
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "}; //string array holding suits
	String face[]={ //array string holding ranks
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out=""; //initialize string out
	for(int s=0;s<4;s++){ //run while s is less than 4
  	out+=suit[s]; // add suit [s] to the string out
  	for(int rank=0;rank<13;rank++) ////run while rank is less than 13
    	for(int card=0;card<5;card++) //run while card is less than 5
     	if(hand[card]/13==s && hand[card]%13==rank) //find rank and suit of card
      	out+=face[rank]; //add rank and suit to out
  	out+='\n'; //enter
	}
	System.out.println(out); //print out the string out
  }
  
 public static void handWinner(int [] rank, int hand[]){ //method to find the type of hand
        int [] count=new int[5];
        
         for(int i=0; i<rank.length; i++){ //run while i is less than freqRank.length
           //count the freqRanks that are 0,1,2,3,4, add to freqCount
           if (rank[i]==0){
               count[0]++;
           }else if(rank[i]==1){
               count[1]++;
           }else if(rank[i]==2){
               count[2]++;
           }else if(rank[i]==3){
               count[3]++;
           }else if (rank[i]==4){
               count[4]++;
           }
       }
        int straightCount=0;
            for(int j=0; j<rank.length-1; j++){
                if(rank[j]-rank[j+1]==0){
                    straightCount++;
                }
        }
       // System.out.println("straightCount is "+ straightCount);
        if (rank[0]==1&&rank[1]==1&&rank[2]==1&&rank[3]==1&&rank[4]==1){ //if a,k,q,j,10 are entered
           System.out.println("This is a Royal Flush"); //print out suit
        }
        else if((straightCount>9&&straightCount<12)&& //check if straight count is either 10 or 11
        //check if all cards are in the same suit
               ((hand[0]/13==0 && hand[1]/13==0 && hand[2]/13==0 && hand[3]/13==0 && hand[4]/13==0)||
               (hand[0]/13==1 && hand[1]/13==1 && hand[2]/13==1 && hand[3]/13==1 && hand[4]/13==1)||
               (hand[0]/13==2 && hand[1]/13==2 && hand[2]/13==2 && hand[3]/13==2 && hand[4]/13==2)||
               (hand[0]/13==3 && hand[1]/13==3 && hand[2]/13==3 && hand[3]/13==3 && hand[4]/13==3)||
               (hand[0]/13==4 && hand[1]/13==4 && hand[2]/13==4 && hand[3]/13==4 && hand[4]/13==4))){
            System.out.println("This is a Straight Flush");//print out hhand type
            }
        
        else if(count[0]==11&&count[1]==1&&count[4]==1){ // check that the frewCount counted 11 zeros, one 1 and one 4
            System.out.println("This is a 4 of a kind"); //tell user they got four of a kind
        }
        else if(count[0]==11&&count[2]==1&&count[3]==1) {//check that count has 11 zeros, 1 two, and 1 three
            System.out.println("This is a Full House"); //print out hand type
        }
        else if((hand[0]/13==0 && hand[1]/13==0 && hand[2]/13==0 && hand[3]/13==0 && hand[4]/13==0)||//check if all cards are in the same suit
               (hand[0]/13==1 && hand[1]/13==1 && hand[2]/13==1 && hand[3]/13==1 && hand[4]/13==1)||
               (hand[0]/13==2 && hand[1]/13==2 && hand[2]/13==2 && hand[3]/13==2 && hand[4]/13==2)||
               (hand[0]/13==3 && hand[1]/13==3 && hand[2]/13==3 && hand[3]/13==3 && hand[4]/13==3)||
               (hand[0]/13==4 && hand[1]/13==4 && hand[2]/13==4 && hand[3]/13==4 && hand[4]/13==4)){
            System.out.println("This is a flush");//print out hand type 
        }
        else if(straightCount>9&&straightCount<12) {//check if straight count is 10 or 11 
                    System.out.println("This is a Straight"); //print out hand type
        }
        else if(count[0]==10&&count[1]==1&&count[2]==2){ // check if two pairs using count
                        System.out.println("This is a Two Pair"); // print hand type
        }
      else if(count[0]==9&&count[2]==1&&count[1]==3){ // check for one pair using count
                    System.out.println("This is a One Pair"); //print hand type
    }
       else{
            System.out.println("This is a High Card"); // if nothing else, high card
        }
     
            
 }
 }
 
 
 
 
 
 