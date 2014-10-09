/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   To repeat, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] arg){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
        case 25: System.out.println("sum is 25");
        default:
        System.out.println("To repeat, you entered "+n);
        }
    }
    else{
      int n=4; //if an int isnt entered, n is initialized as 4
      System.out.println("You entered "+n);
      int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
        case 25: System.out.println("sum is 25"); //sum will always be 25
        default:
        System.out.println("To repeat, you entered "+n);
        }
    }
  }
}

/* Error report:
 *   Expand this comment:
 *  -line 10 should be (String[] arg)
 *  -the switch statement needs to be inside the if 
 *   statement in order to be in n's scope
 *  -it also has to be in the else statement
 *  -n does not have to be initialized in the switch
 *  -case 4 of the switch was not needed
 */

