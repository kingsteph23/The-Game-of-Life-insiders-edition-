import java.util.*;
public class stockchartstech {
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
    
    if(choice.equals("A")){
 
        System.out.println("Type in the number of shares you would like to buy:");
        int txnsharessbuy = scan.nextInt();

         double totaltxnvalue = txnmarketprice * txnsharessbuy;

         System.out.println(totaltxnvalue);
       


} else if(choice.equals("B")){
    System.out.println("Type in the number of shares you would like to sell:");
    int txnsharessell = scan.nextInt();
}
    

    
    }

/* 

    // apple

 public static void appleinc(){
    aaplmarketprice = 131.42;
System.out.println("Market Price:" + aaplmarketprice +
"\nVolume: $131.70" +
"\n90 day volume:  86M" +
"\nTodays range: $129.64-$132.42" +
"\n52 week range: $129.04-$182.94" +
"\nPrimary exchange: NASDAQ-NMS" +
"\nPrevious close: $131.86"+
"\nOpen: $130.92");
    
System.out.println("Would you like to buy or sell shares of APPL(Apple Inc)?"+
"\n(A) buy"+
"\n(B) sell");


            }

           
     // meta    
public static void metaplatforms(){
    metamarketprice = 117.43;
    System.out.println("Market Price: " + metamarketprice +
    "\nVolume:17,796,625"+
    "\n90 day volume:  40M"+
    "\nTodays range: $115.54-$118.18"+
    "\n52 week range: $88.09-$352.71"+
    "\nPrimary exchange: NASDAQ-NMS"+
    "\nPrevious close: $118.04"+
    "\nOpen: $116.03");

    System.out.println("Would you like to buy or sell shares of META(Meta Platforms)?"+
    "\n(A) buy"+
    "\n(B) sell");
         }

 // moderna
    public static void modrnainc(){
     mrnamarketprice = 203.54;
System.out.println("Market Price:" + mrnamarketprice + 
"\nVolume: 6,166,010"+
"\n90 day volume: 5M"+
"\nTodays range: $197.56-$208.99"+
"\n52 week range:$115.03-$259.20"+
"\nPrimary exchange: NASDAQ-NMS"+
"\nPrevious close: $199.08"+
"\nOpen: $206.69");
        
        
System.out.println("Would you like to buy or sell shares of MRNA(Moderna inc)?"+
"\n(A) buy"+
"\n(B) sell");
     }


          //portfolio
    public static void portfolio(){
// investment value
 value = txnmarketprice + aaplmarketprice + metamarketprice + mrnamarketprice;

        tickersymbols = new String[] {"TXN","AAPL","META","MRNA"};
System.out.println("Your investments: " + tickersymbols + 
"\nTotal value: " + value +
"\nAccount type: " + accountype +
"\nShares owned: "+ numOfShares +
"\nTodays gain/loss: " + gainandloss);
                        
                                              
        📈 🟢
         📉🔴
         
       }

       
// added settled cash/cash amount
       public static void cashamount(){
                  
       }

//math part on hold
//find way to make portfolio/stock change based on actions
//num of shares in stock portfolio.  num of shares * market price


    // end of class

    */
    }

