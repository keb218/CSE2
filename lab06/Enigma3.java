/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
      System.out.println("k is " + k);
         break;
      default: out+=40;
          n/=3;
          k-=7;
           System.out.println("k is " + k);
            System.out.println("n is " + n);
    }
    if(n*k%12< 12){
      n-=20;
      out+=n;
       System.out.println("out is " + out);
    }
    if(n*n>k){
      n=42;
      out+=n+k;
       System.out.println("out is " + out);
    }
    else {
      n=45;
      out+=n+k;
       System.out.println( "out is " + out);
    }
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
         System.out.println("P is " + k);
          System.out.println("N is " + n);
        break;
      case 97:
        n-=14;
        k-=2;
         System.out.println("K is " + k); 
         System.out.println("ll is " + n);
        break;
      case 98:
        n/=5;
        k/=9;
         System.out.println("v is " + k);
          System.out.println("h is " + n);
      default:
        n-=3;
        k-=5;
         System.out.println("j is " + k);
          System.out.println("l is " + n);
    }
     out+=1/n + 1/n;  //when 1/k was in, it was a divide by zero. I changed it to 1/n 
    System.out.println("out is " +out);
  }
}

/*
 * Error report:
 * 
 * line 62 is a divide by zero error
 * line 59 k becomes zero, in line 62, 1 is divided by k, so its divided by zero
 * 
 */
