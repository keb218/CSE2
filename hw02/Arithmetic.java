/////////////////////
//Kelli Barber
//hw02
//Arithmetic Program
//8/06/14
//
//This program will display:
// 1. The total cost of each item
// 2. The sales tax for each item
// 3. The total cost of purches before tax
// 4. actual amount of transaction(including tax)
//
//The goal of this program is to calculate 
//sales tax and total cost for items. //

public class Arithmetic {
    //main method needed for every program
    public static void main(String[] args){
        
        //input data
        //number of pairs of socks
        int nSocks=3; 
        //cost per pair of socks 
        //"$" is part of variable name
        double sockCost$=2.58; 
        
        //number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //tax percent for Pennsylvania
        double taxPercent=0.06;
        
        //total cost for each item
        double totalSockCost$, totalGlassesCost$, totalEnvelopeCost$;
        //Sales tax for each set of items
        double socksSalesTax, glassesSalesTax, envelopeSalesTax;
        //final cost of items
        double finalSockPrice, finalGlassPrice, finalEnvelopePrice;
        //total cost of items before tax, total tax charged, total cost after transaction
        double costWithoutTax, totalTax, finalCost;
      
        //calculations
        //Cost of multiple pairs of socks
        totalSockCost$=nSocks*sockCost$;
        //Total sales tax on socks
        socksSalesTax=totalSockCost$*taxPercent;
        //total price with sales tax
        finalSockPrice= totalSockCost$+socksSalesTax;
        //Cost of multiple glasses
        totalGlassesCost$=nGlasses*glassCost$;
        //Total Sales tax on glasses
        glassesSalesTax=totalGlassesCost$*taxPercent;
        //Total price with tax
        finalGlassPrice=totalGlassesCost$+glassesSalesTax;
        //Envelope Cost before tax
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        //Tax on envelopes
        envelopeSalesTax=totalEnvelopeCost$*taxPercent;
        //Total cost of envelopes with tax
        finalEnvelopePrice=totalEnvelopeCost$+envelopeSalesTax;
        //total cost of goods before tax
        costWithoutTax=totalSockCost$+totalEnvelopeCost$+totalGlassesCost$;
        //total tax charged
        totalTax=socksSalesTax+glassesSalesTax+envelopeSalesTax;
        //final payment needed
        finalCost=totalGlassesCost$+totalSockCost$+totalEnvelopeCost$+socksSalesTax+envelopeSalesTax+glassesSalesTax;
    
        //Show sock amounts
        System.out.println("I am buying socks.");
        System.out.println("I want to buy " + nSocks+ " pairs of socks."); //amount of socks desired
        System.out.println("Each pair of socks costs $" +sockCost$+ "."); //cost per pair of socks
        System.out.println("The cost of socks before tax is $" +totalSockCost$+ "."); //cost of all socks together
        System.out.println("The sales tax for the socks is $" +(double)Math.round(socksSalesTax * 100)/100.0+ "."); //sales tax for socks
        System.out.println("The total cost of the socks with tax is $" +(double)Math.round(finalSockPrice * 100)/100.0+ "."); //cost of all socks with tax
        
        //print glass amounts
        System.out.println("I am also buying drinking glasses.");
        System.out.println("I want to buy " + nGlasses+ " glasses."); //state amount of glasses desired
        System.out.println("Each glass costs $" +glassCost$+ "."); //cost per glass
        System.out.println("The cost of the glasses before tax is $" +totalGlassesCost$+ "."); //cost of all glasses combined
        System.out.println("The sales tax for the glasses is $" +(double)Math.round(glassesSalesTax * 100)/100.0+ "."); //sales tax of all glasses
        System.out.println("The total cost of the glasses with tax is $" +(double)Math.round(finalGlassPrice * 100)/100.0+ "."); //cost of glasses with tax
        
        //print envelope amounts
        System.out.println("I also want to buy envelopes."); 
        System.out.println("I want to buy " + nEnvelopes+ " box of envelopes."); //amount of envelopes desired
        System.out.println("Each box costs $" +envelopeCost$+ "."); //cost of each box
        System.out.println("The cost of the envelopes before tax is $" +totalEnvelopeCost$+ "."); //cost of total envelopes
        System.out.println("The sales tax for the envelopes is $" +(double)Math.round(envelopeSalesTax * 100)/100.0+ "."); //sales tax for envelopes
        System.out.println("The total cost of the envelopes with tax is $" +(double)Math.round(finalEnvelopePrice * 100)/100.0+"."); //cost of envelopes with tax
        
        //print total amounts
        //cost of all items before tax
        System.out.println("The cost of all of the items before tax is $" +(double)Math.round(costWithoutTax * 100)/100.0+ ".");
        //total sales tax on items
        System.out.println("The sales tax on all of the items is $" +(double)Math.round(totalTax * 100)/100.0+ "." );
        //final and complete price to pay for the items
        System.out.println("The final amount to be paid for the items is $" +(double)Math.round(finalCost * 100)/100.0+ ".");
    }
}
