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

static double totalmrnavalue;
static int numofmrna;
static Scanner scan = new Scanner(System.in);

//mrnastock

    public static void modrnainc(){
        double currentsharesowned = 5;
        mrnamarketprice = 210.54;
   System.out.println("Market Price:" + mrnamarketprice + 
   "\nVolume: 8,452,090"+
   "\n90 day volume: 7.9M"+
   "\nTodays range: $206.99-$212.23"+
   "\n52 week range:$193.03-$259.20"+
   "\nPrimary exchange: NASDAQ-NMS"+
   "\nPrevious close: $207.10"+
   "\nOpen: $206.69");
           
           
   System.out.println("Would you like to buy or sell shares of MRNA(Moderna inc)?"+
   "\n(a) buy"+
   "\n(b) sell");

   String choice = scan.nextLine();
   // if choice is buy
   
   if(choice.equals("a") && !(choice.equals("0"))){

       System.out.println("Type in the number of shares you would like to buy:");
       int mrnasharessbuy = scan.nextInt();

       totalmrnavalue = mrnamarketprice * mrnasharessbuy;
       double newshares = currentsharesowned + mrnasharessbuy;
       totalmrnavalue = mrnamarketprice * newshares;


        System.out.println(" $ " + totalmrnavalue);
      
//selling stock

} else if(choice.equals("b") && !(choice.equals("0"))){
   System.out.println("Type in the number of shares you would like to sell:");
   double mrnasharessell = scan.nextDouble();


   double mp2 = 210.54*5;

if(mrnasharessell == 1){
    mrnasharessell = 210.54;

}else if(mrnasharessell == 2){

    mrnasharessell = 421.08;

}else if(mrnasharessell == 3){
    mrnasharessell = 631.62;;

}else if(mrnasharessell == 4){
    mrnasharessell =  842.16;

}else if(mrnasharessell == 5)
mrnasharessell = 1052.7;



totalmrnavalue = mp2 - mrnasharessell;

   System.out.println("$" +totalmrnavalue);
}





}


// second chart(buy more shares)
public static void modrnainc2(){
mrnamarketprice = 219.33;
System.out.println("Market Price:" + mrnamarketprice + 
"\nVolume: 5,223,010"+
"\n90 day volume: 6.9M"+
"\nTodays range: $216.54-$220.33"+
"\n52 week range:$188.03-$259.20"+
"\nPrimary exchange: NASDAQ-NMS"+
"\nPrevious close: $215.53"+
"\nOpen: $216.54");
        
      

}
//end of class
}