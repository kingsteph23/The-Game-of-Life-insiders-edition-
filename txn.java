import java.util.*;


public class txn {
// portfolio variables
static String[] tickersymbols; 
static double value;
static String accountype;
static int numOfShares;
static double average;
static double gainandloss;

static double marketprice;
static double txnmarketprice;

                
static int numoftxn;
//total value
static double totaltxnvalue;

static Scanner scan = new Scanner(System.in);

public static void texasinstruments() {
    txnmarketprice = 163.42;
    double currentsharesowned = 5;

    
    System.out.println("Market Price: " + txnmarketprice +
    "\n90 day volume: 6M"+
    "\nTodays range: $162.28-$164.80"+
    "\n52 week range: $144.46-$193.28"+
    "\nPrimary exchange: NASDAQ-NMS"+
    "\nPrevious close: $163.03"+
    "\nOpen: 163.03");
    
    //buying or selling
        System.out.println("Would you like to buy or sell shares of TXN(Texas Instruments)?"+
        "\n(A) buy"+
        "\n(B) sell");
        String choice = scan.nextLine();
        // if choice is buy
        
        if(choice.equals("A") && !(choice.equals("0"))){
     
            System.out.println("Type in the number of shares you would like to buy:");
            double txnsharessbuy = scan.nextDouble();
            //current shares(when new shares are bought)
            double newshares = currentsharesowned + txnsharessbuy;
            totaltxnvalue = txnmarketprice * newshares;
    
             System.out.println(" $ " + totaltxnvalue);
           
    
    
    } else if(choice.equals("B") && !(choice.equals("0"))){
        System.out.println("Type in the number of shares you would like to sell:");
        double txnsharessell = scan.nextDouble();
    
    
        double newshares2 =   txnsharessell + currentsharesowned;
        totaltxnvalue = txnmarketprice - newshares2;

        System.out.println("$" +totaltxnvalue);
    }

}

public static void texasinstruments2() {

    double newtxnmarketprice = txnmarketprice + 10.50;
    
       
    System.out.println("Market Price: " +  newtxnmarketprice +
    "\n90 day volume: 8.5M"+
    "\nTodays range:  $171.28-$175.30"+
    "\n52 week range: $144.46-$175.38"+
    "\nPrimary exchange: NASDAQ-NMS"+
    "\nPrevious close: $170.97"+
    "\nOpen: 171.02");
    
    

    //end of class
}}



