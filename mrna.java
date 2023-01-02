import java.util.*;


public class mrna {


    // portfolio variables
static String[] tickersymbols; 
static double value;
static String accountype;
static int numOfShares;
static double average;
static double gainandloss;

static double marketprice;
static double mrnamarketprice;
                
static int numofmrna;

//sell
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


// second chart(buy more shares)
public static void modrnainc2(){
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
//end of class
}