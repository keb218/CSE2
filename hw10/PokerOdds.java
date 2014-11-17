/******************
 * Kelli Barber
 * hw10
 * 11/15/14
 * 
 * this program generates
 * random poker hands and
 * counts how many times
 * there are pairs in the 
 * hands
 * **********************/

import java.util.Random; //import random
import java.util.Scanner; //import scanner
public class PokerOdds{
    //main method needed for all programs
  public static void main(String [] arg){
    
    showHands(); //call showHands method
    simulateOdds(); //call simulate odds method
  }


public static void showHands(){ //method showHands
Scanner scan=new Scanner(System.in);
String input;
do{
    int[] deck = new int [52]; //create a deck of cards using array
    int[] hand = {-1, -1, -1, -1, -1}; //sey all values in array to -1
   Random rand= new Random(); //name random value
   for (int g=0; g<deck.length; g++){ //run loop to fill in array values
       deck[g]=g;
   }
   int t=0; //initialize variables
   for (int i=0; i<hand.length; i++){ //run while i is less than hand length
       int n= rand.nextInt(52); //find random int between 0 and 51
       t=hand[i]; //set t = to hand[i]
       hand[i]=deck[n]; //set hand[i]=deck[n]
       deck[n]=t; //set deck[n]=to t, this preserves deck[n]'s values
   }
  
   System.out.print("Clubs: "); //print out clubs
   for (int j=0; j<hand.length; j++){ //run while j is less than hand.length
        if(((int)(hand[j]/13))==0){ //if hand[j]/13 = 0, suit is clubs
            int rank= (int)(hand[j]%13); //determine card value by modulus 13 (%13)
            switch(rank){ //for rank value, print out answer - case is rank value
               case 0: System.out.print("A "); break;
               case 1: System.out.print("K "); break;
               case 2: System.out.print("Q "); break;
               case 3: System.out.print("J "); break;
               case 4: System.out.print("10 "); break;
               case 5: System.out.print("9 "); break;
               case 6: System.out.print("8 "); break;
               case 7: System.out.print("7 "); break;
               case 8: System.out.print("6 "); break;
               case 9: System.out.print("5 "); break;
               case 10: System.out.print("4 "); break;
               case 11: System.out.print("3 "); break;
               case 12: System.out.print("2 "); break;
           }
       }
    }
   System.out.println(); //move to next line
   System.out.print("Diamonds: "); //print out diamonds
    for (int j=0; j<hand.length; j++){ //run loop while j is less than hand.length
       if(((int)(hand[j]/13))==1){ //if hand[j]/13 = 1, suit is diamonds
           int rank= (int)(hand[j]%13); //determine card value by modulus 13 (%13)
           switch(rank){ //for rank value, print out answer
               case 0: System.out.print("A "); break;
               case 1: System.out.print("K "); break;
               case 2: System.out.print("Q "); break;
               case 3: System.out.print("J "); break;
               case 4: System.out.print("10 "); break;
               case 5: System.out.print("9 "); break;
               case 6: System.out.print("8 "); break;
               case 7: System.out.print("7 "); break;
               case 8: System.out.print("6 "); break;
               case 9: System.out.print("5 "); break;
               case 10: System.out.print("4 "); break;
               case 11: System.out.print("3 "); break;
               case 12: System.out.print("2 "); break;
           }
       }
    }
    System.out.println(); //move to next line
    System.out.print("Hearts: "); //print out hearts
    for (int j=0; j<hand.length; j++){ //run loop while j is less than hand length
       if(((int)(hand[j]/13))==2){ //if hand[j]/13 = 2, suit is hearts
           
           int rank= (int)(hand[j]%13); //determine card value by modulus 13 (%13)
           switch(rank){ //for rank value, print out answer
               case 0: System.out.print("A "); break;
               case 1: System.out.print("K "); break;
               case 2: System.out.print("Q "); break;
               case 3: System.out.print("J "); break;
               case 4: System.out.print("10 "); break;
               case 5: System.out.print("9 "); break;
               case 6: System.out.print("8 "); break;
               case 7: System.out.print("7 "); break;
               case 8: System.out.print("6 "); break;
               case 9: System.out.print("5 "); break;
               case 10: System.out.print("4 "); break;
               case 11: System.out.print("3 "); break;
               case 12: System.out.print("2 "); break;
           }
       }
    }
    System.out.println(); //move to next line
     System.out.print("Spades "); //print out spades
    for (int j=0; j<hand.length; j++){ //run loop until j equals hand length
       if(((int)(hand[j]/13))==3){ //if hand[j]/13 = 3, suit is spades
            int rank= (int)(hand[j]%13); //determine card value by modulus 13 (%13)
           switch(rank){ //for rank value, print out answer
               case 0: System.out.print("A "); break;
               case 1: System.out.print("K "); break;
               case 2: System.out.print("Q "); break;
               case 3: System.out.print("J "); break;
               case 4: System.out.print("10 "); break;
               case 5: System.out.print("9 "); break;
               case 6: System.out.print("8 "); break;
               case 7: System.out.print("7 "); break;
               case 8: System.out.print("6 "); break;
               case 9: System.out.print("5 "); break;
               case 10: System.out.print("4 "); break;
               case 11: System.out.print("3 "); break;
               case 12: System.out.print("2 "); break;
           }
       }
    }
    System.out.println(); //move to next line
    System.out.println("Go again? Enter 'y' or 'Y', anything else to quit-"); //ask user if they want to go again
    input=scan.next(); //set next input as input
    }while(input.equals("y") || input.equals("Y")); //run loop while user enters y or Y
}

public static void simulateOdds(){ //method is named simulateOdds
    int[] hand = new int[5]; //new array for a hand 
   Random rand= new Random(); //needed for random method
   int[] rank=new int [13]; //set array for rank to have 13 spots
   int [] deck=new int[52]; //set array to have 52 spots
   int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,r=0,j=0,k=0,l=0,m=0, n=0; //initialize letters to 0
  for (int q=0; q<deck.length; q++){ //fills deck in with values
      deck[q]=q;
  }
   for (int q=0; q<hand.length; q++){ //run loop while q is less than 5
       hand[q]=rand.nextInt(52); //find random number between 0 and 51
       //System.out.print(hand[q]+", "); 
   }
    for (int z=0; z<10000; z++){//run loop 10,000 times
    int t=0; //initialize variables
   for (int xx=0; xx<hand.length; xx++){ //run while i is less than hand length
       int y= rand.nextInt(52); //get random number between 0 and 51
       t=hand[xx]; //set t  equal to hand array at xx
       hand[xx]=deck[y]%13; //divide deck array by %13, set value equal to hand at xx
       deck[y]=t; //set deck position equal to t
   }
   if (exactlyOneDup(hand)){ //call method exactlyOneDup, run hand array through it
       for (int i=0; i<hand.length; i++){//run loop while i<hand length
            for(int x=i+1; x<hand.length; x++){ //run loop while i+1 is less than hand.length
            if(hand[i]==hand[x]){ //check for duplicates
                switch(hand[i]){ //this switch counts how many times exactly one duplicate occurs for each value in 10000 times
                    case 0: a++; rank[0]=a; break; //increment value, set rank of value equal to letter (this occurs for each case)
                    case 1: b++; rank[1]=b; break;
                    case 2: c++; rank[2]=c;break;
                    case 3: d++; rank[3]=d;break;
                    case 4: e++; rank[4]=e;break;
                    case 5: f++; rank[5]=f; break;
                    case 6: g++; rank[6]=g;break;
                    case 7: h++; rank[7]=h;break;
                    case 8: r++; rank[8]=r;break;
                    case 9: j++; rank[9]=j;break;
                    case 10:k++; rank[10]=k;break;
                    case 11:l++; rank[11]=l;break;
                    case 12:m++; rank[12]=m;break;
                }
            }
            }
   }
   }
   else{ //if there is not exaclty one duplicate
       n++; //increment n
   }
}
      String [] rank1={" A", " K", " Q", " J", "10", " 9", " 8", " 7", " 6", " 5", " 4", " 3", " 2"}; //set string array rank1 = to ranks
        for (int p=0; p<rank.length; p++){ //run loop while p is less than rank's length
            System.out.println( rank1[p] + " " +rank[p]); //print out rank[] values and rank1[] values
        }
    System.out.println("------------------"); //print out line
    System.out.println("total not exactly one pair:" +n); //print out number of times hand does not have exactly one pair
}
public static boolean exactlyOneDup(int num []){ //method to find if hand has exactly one duplicate
    boolean dup=false; //begin with dup=false
    int j=0; //initialize j
    for (int i=0; i<num.length; i++){ //run loop while i< num length
          for( int k=i+1; k<num.length; k++){ // run loop while k is less than num length
              if(k!=i && num[i]==num[k]){ //if k = i, there is a duplicate
                  j++; //increment j
              }
          }
      }
    if(j==1){ //i j equals one, return true
        dup=true;
    }
      return dup; //return true or false
}
}