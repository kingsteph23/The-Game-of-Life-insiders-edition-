

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
    static double aaplmarketprice;
    static double metamarketprice;
    static double mrnamarketprice;
                    
    static int numofmrna; 
    static int numofmeta; 
    static int numofaapl; 
    static int numoftxn;
    //total value
    static double totaltxnvalue;
    
    static Scanner scan = new Scanner(System.in);
   
   
   
   
    public static void texasinstruments() {
   
       txnmarketprice = 163.42;
       
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
               int txnsharessbuy = scan.nextInt();
       
               totaltxnvalue = txnmarketprice * txnsharessbuy;
       
                System.out.println(" $ " + totaltxnvalue);
              
       
       
       } else if(choice.equals("B") && !(choice.equals("0"))){
           System.out.println("Type in the number of shares you would like to sell:");
           int txnsharessell = scan.nextInt();
       
           totaltxnvalue = txnmarketprice / txnsharessell;
           System.out.println("$" +totaltxnvalue);
       }}
   
   
   
   
   
       public static void texasinstruments2() {
   
           double newtxnmarketprice = txnmarketprice + 10.50;
           System.out.println("Market Price: " + newtxnmarketprice  +
           "\n90 day volume: 8.5M"+
           "\nTodays range: $171.28-$175.30"+
           "\n52 week range: $144.46-$175.38"+
           "\nPrimary exchange: NASDAQ-NMS"+
           "\nPrevious close: $170.97"+
           "\nOpen: 171.02");
               
           System.out.println("Would you like to buy or sell shares of TXN(Texas Instruments)?"+
           "\n(A) buy"+
           "\n(B) sell");
           String choice2 = scan.nextLine();
           // if choice is buy
           
           if(choice2.equals("A") && !(choice2.equals("0"))){
           
               System.out.println("Type in the number of shares you would like to buy:");
               int txnsharessbuy = scan.nextInt();
           
               totaltxnvalue = txnmarketprice * txnsharessbuy;
           
                System.out.println(" $ " + totaltxnvalue);
              
               }else if(choice2.equals("B") && !(choice2.equals("0"))){
                System.out.println("Type in the number of shares you would like to sell:");
                int txnsharessell = scan.nextInt();
            
                totaltxnvalue = txnmarketprice / txnsharessell;
                System.out.println("$" +totaltxnvalue);
       
           //end of class
       }
   
      
   }}
   

