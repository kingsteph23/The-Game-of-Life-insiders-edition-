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
static double totalaaplvalue;


static Scanner scan = new Scanner(System.in);

 public static void appleinc(){
    //buy share
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

String choice = scan.nextLine();
// if choice is buy
double currentsharesowned = 5;
if(choice.equals("A") && !(choice.equals("0"))){

    System.out.println("Type in the number of shares you would like to buy:");
    int applsharessbuy = scan.nextInt();

    totalaaplvalue= aaplmarketprice * applsharessbuy;

    double newshares = currentsharesowned + applsharessbuy;
    totalaaplvalue = aaplmarketprice * newshares;
    
             System.out.println(" $ " + totalaaplvalue);
   


} else if(choice.equals("B") && !(choice.equals("0"))){
System.out.println("Type in the number of shares you would like to sell:");
int applsharessell = scan.nextInt();

totalaaplvalue = aaplmarketprice / applsharessell;
System.out.println("$" +totalaaplvalue);
}

}


//second chart
//sell shares

public static void appleinc2(){
    aaplmarketprice = 147.43;
    System.out.println("Market Price:" + aaplmarketprice +
    "\nVolume: 85M" +
    "\n90 day volume:  86M" +
    "\nTodays range: $144.42-$147.58" +
    "\n52 week range: $129.04-$182.94" +
    "\nPrimary exchange: NASDAQ-NMS" +
    "\nPrevious close: $142.3"+
    "\nOpen: $144.42");
        


//update cash
//buy and share if statements(copy n paste from txn.java)

}
}
