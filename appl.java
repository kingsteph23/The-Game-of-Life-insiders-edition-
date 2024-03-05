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
"\n(a) buy"+
"\n(b) sell");

String choice = scan.nextLine();
// if choice is buy
double currentsharesowned = 5;
if(choice.equals("a") && !(choice.equals("0"))){

    System.out.println("Type in the number of shares you would like to buy:");
    int applsharessbuy = scan.nextInt();

    totalaaplvalue = aaplmarketprice * applsharessbuy;

    double newshares = currentsharesowned + applsharessbuy;
    totalaaplvalue = aaplmarketprice * newshares;
    
             System.out.println(" $ " + totalaaplvalue);
   


} else if(choice.equals("b") && !(choice.equals("0"))){
System.out.println("Type in the number of shares you would like to sell:");
double applsharessell = scan.nextDouble();
double mp2 = 131.42*5;

if(applsharessell == 1){
    applsharessell = 131.42;

}else if(applsharessell == 2){

    applsharessell = 262.84;

}else if(applsharessell == 3){
    applsharessell = 394.26;;

}else if(applsharessell == 4){
    applsharessell =  525.68;

}else if(applsharessell == 5)
applsharessell = 657.10;



totalaaplvalue = mp2 - applsharessell;


    

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
        

}
}
