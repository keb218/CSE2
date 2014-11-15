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
 import java.util.Scanner;
public class FindDuplicates{
public static Boolean hasDups(int num [] ){
      boolean dup= false;
      for (int i=0; i<num.length; i++){
          for(int k=i+1; k<num.length; k++){
              if(k!=i && num[i]==num[k]){
                  dup=true;
              }
          }
      }
      return dup;
}

public static boolean exactlyOneDup(int num []){
    boolean dup=false;
    int j=0;
    for (int i=0; i<num.length; i++){
          for(int k=i+1; k<num.length; k++){
              if(k!=i && num[i]==num[k]){
                  j++;
              }
          }
      }
    if(j==1){
        dup=true;
    }
      return dup;
}


  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
}
