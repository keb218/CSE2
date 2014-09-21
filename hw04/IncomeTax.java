import java.util.Scanner;

/////////////////////////////////
//Kelli Barber
//hw04
//Income Tax Program
//9/20/14
//
//This program will ask the user
//to enter their income and then
//the program will write the amount
//of tax on the income
////////////////////////////////////

public class IncomeTax{
    //main method needed for all programs
    public static void main(String[] args) {
        Scanner myScanner; //name the scanner
        myScanner = new Scanner (System.in); //define the scanner
        //prompt the user to enter their income as an int
        System.out.print("Enter your income as an int giving the number of thousands- ");
        
        if(myScanner.hasNextInt()){ //myScanner is using the method hasNextInt
            int income = myScanner.nextInt(); //income is defined as the int entered by the user
            
            if (income > 0) { //income entered is greater than zero
               if ( income < 20){ //income entered is greater than 20,000
                   System.out.println("The tax rate on $" +income+ ",000 is 5% and the tax is $" 
                   + (int)((income*0.05)*100000)/100.0); //The income and tax is written
               }else if (income >=20 & income < 40){ //income is greater than 20,000 and less than 40,000
                   System.out.print("The tax rate on $"+ income + ",000 is 7% and the tax is $"
                   +(int)((income*0.07)*100000)/100.0); //the income and tax is written
               }else if (income >= 40 & income < 78){ //income is greater than 40,000 and less than 78,000
                   System.out.print("The tax rate on $"+ income + ",000 is 12% and the tax is $"
                   +(int)((income*0.12)*100000)/100.0); //the income and tax is written and calculated
               }else if (income >=78){ //income is greater than 78,000
                   System.out.print("The tax rate on $"+ income + ",000 is 14% and the tax is $"
                   +(int)((income*0.14)*100000)/100.0); //the income and tax is written and calculated
               }
            }else if( income < 0){ //income is less than 0
                   System.out.print("You did not enter a positive int."); 
                   return;
            }
        }else{ //income is not an int
            System.out.print("You did not enter an int");
            return;
        }
        
    }
}