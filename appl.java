import java.util.*;



public class appl {
    // portfolio variables
static String[] tickersymbols; 
static double value;
static String accountype;
static int numOfShares;
static double average;
static double gainandloss;

static double marketprice;
static double aaplmarketprice;
                
 
static int numofaapl; 

    
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


//second chart

public static void appleinc2(){
    aaplmarketprice = 141.12;
    System.out.println("Market Price:" + aaplmarketprice +
    "\nVolume: 75M" +
    "\n90 day volume:  86M" +
    "\nTodays range: $139.92-$141.24" +
    "\n52 week range: $129.04-$182.94" +
    "\nPrimary exchange: NASDAQ-NMS" +
    "\nPrevious close: $140.82"+
    "\nOpen: $139.94");
        
    System.out.println("Would you like to buy or sell shares of APPL(Apple Inc)?"+
    "\n(A) buy"+
    "\n(B) sell");
    
}




}
