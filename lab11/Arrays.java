import java.util.Scanner;
/*************************
 * Kelli Barber
 * lab 11
 * 11/10/14
 * 
 * This program uses elementary
 * array operations to find
 * the lowest and highest entries
 * along with the sum
 * ************************/
 
 public class Arrays{
     public static void main (String [] args){
        Scanner scan= new Scanner (System.in);
        int [] list1=new int [10];
        System.out.print("Enter ten ints- ");
        for (int i=0; i<list1.length; i++)
        {
            list1[i]=scan.nextInt();
        }
        int index=0;
        int min=list1[0];
        for (int i=1; i<list1.length; i++){
            if(list1[i]<min){
                min=list1[i];
                index=i;
            }
        }System.out.println("lowest entry is " + min);
        int index2=0;
        int max= list1[0];
        for(int i=1; i<list1.length;i++){
            if (list1[i]>max){
                max=list1[i];
                index2=i;
            }
        }
        System.out.println("highest entry is " +max);
        
        
        int sum=0;
        for (int k: list1){
          sum+=k;  
        }System.out.println("The sum is " +sum);
        int [] list2 = new int [list1.length];
        //int j=0;
        for (int i=0; i<list1.length; i++){
            list2[i]=list1[9-i];
            System.out.println(list1[i] + "  " +list2[i]);
        }
     }
 }