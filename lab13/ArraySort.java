import java.util.Scanner;
import java.util.Random;
/*************************
 * Kelli Barber
 * lab 13
 * 12/1/2014
 * 
 * This program will sort 
 * lists by length and by value
 * ************************/
 public class ArraySort{
     public static void main(String [] args){
         //Scanner scan = new Scanner (System.in);
        Random rand= new Random();
        int [] [] twoDArray=new int [5][];
        //int m=0;
        for(int m=0; m<5; m++){
            twoDArray[m]= new int[(m*3)+5];
        }
        System.out.println("The array before sorting");
        for(int i=0; i<twoDArray.length; i++){
            for(int j=0; j<twoDArray[i].length; j++){
                twoDArray[i][j]=rand.nextInt(40);
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The array after sorting");
        for(int i=0; i<twoDArray.length; i++){
            for(int j=0; j<twoDArray[i].length; j++){
                for(int n = j+1; n<twoDArray[i].length; n++){
                if (twoDArray[i][n]<twoDArray[i][j]){
                    int temp = twoDArray[i][j];
                    twoDArray[i][j]=twoDArray[i][n];
                    twoDArray[i][n]=temp;
                }
                }
            }
        }
         for(int i=0; i<twoDArray.length; i++){
            for(int j=0; j<twoDArray[i].length; j++){
                //twoDArray[i][j]=rand.nextInt(40);
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
         }
    }
}