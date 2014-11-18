/*************************
 * Kelli Barber
 * hw10
 * 11/15/14
 * 
 * This program asks the 
 * user to enter ten ints,
 * and then checks to see 
 * if there are duplicates.
 * */
    import java.util.Scanner; //import scanner
public class FindDuplicates{
   public static String listArray(int num[]){ //method called listArray
    String out="{";
    for(int j=0;j<num.length;j++){ //run loop while j is less than num's length
      if(j>0){ //if j is greater than 0, print ","
        out+=", ";
      }
      out+=num[j]; //print out value in num[]
    }
    out+="} ";
    return out; //return string of out
  }

public static Boolean hasDups(int num [] ){ //method to find out if hand has duplicates
      boolean dup= false;//set dup to false
      for (int i=0; i<num.length; i++){ //run loop while i is less than num length
          for(int k=i+1; k<num.length; k++){ //run loop while k is less than num length
              if(k!=i && num[i]==num[k]){ //when num[k]==num[m], dup is true
                  dup=true;
              }
          }
      }
      return dup; //return true or false
}

public static boolean exactlyOneDup(int num []){ //method to find if hand has exactly one dup
    boolean dup=false; //set dup to false
    int j=0; //initialize varaible
    for (int i=0; i<num.length; i++){ //run loop while i is less than num length
          for( int k=i+1; k<num.length; k++){ //run loop while k is less than num length
              if(k!=i && num[i]==num[k]){ //when num[k]=num[j], increment j
                  j++;
              }
          }
      }
    if(j==1){ //when j is one, dup is true
        dup=true;
    }
      return dup; //return true or false
}


  public static void main(String [] arg){
    //main method needed for all programs
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];// initialize arrays
    String answer=""; //define new string
    do{
      System.out.print("Enter 10 ints- "); //ask user to enter 10 ints
      for(int j=0;j<10;j++){ //run loop while j is less than 10
        num[j]=scan.nextInt(); //set num[j]=the next int the user enters
      }
      String out="The array "; //add to the string
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ //call method hasDups for num
        out+="has "; //add to the string
      }
      else{
        out+="does not have "; //add to the string
      }
      out+="duplicates."; //add to the string
      System.out.println(out); //print out string for out
      out="The array "; //add to the string
      out+=listArray(num);  //call listArray for num
      if(exactlyOneDup(num)){ //call exactlyOneDup for num
        out+="has "; //add to the string
      }
      else{
        out+="does not have "; //add to the string
      }
      out+="exactly one duplicate."; //add to the string
      System.out.println(out); //print out the string out
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //ask user if they want to go again
      answer=scan.next(); //set answer as the user input
    }while(answer.equals("Y") || answer.equals("y")); //run loop while answer equals y or Y
}
}