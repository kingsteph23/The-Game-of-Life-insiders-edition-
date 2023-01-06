import java.util.*;

public class appleshareholder {
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
static double currentsharesowned = 10;

//storyline 1
    public static void scenario1(){

 //buy share
 aaplmarketprice = 152.65;
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
 //scenario 1
 if(choice.equals("a") && !(choice.equals("0"))){
 
     System.out.println("Type in the number of shares you would like to buy:");
     double applsharessbuy = scan.nextDouble();
 
     totalaaplvalue = aaplmarketprice * applsharessbuy;
 
     double newshares = currentsharesowned + applsharessbuy;
     totalaaplvalue = aaplmarketprice * newshares;
     
              System.out.println(" $ " + totalaaplvalue);
    
 
 
 } else if(choice.equals("b") && !(choice.equals("0"))){
 System.out.println("Type in the number of shares you would like to sell:");
 double applsharessell = scan.nextDouble();
 double mp2 = 152.65 * currentsharesowned;

if(applsharessell == 1){
    applsharessell = 131.42;

}else if(applsharessell == 2){

    applsharessell = 305.30;

}else if(applsharessell == 3){
    applsharessell = 457.95;;

}else if(applsharessell == 4){
    applsharessell =  610.6;

}else if(applsharessell == 5){
applsharessell = 763.25;

}else if(applsharessell == 6){
applsharessell = 915.9;

}else if(applsharessell == 7){
applsharessell = 1070.3;

}else if(applsharessell == 8){
applsharessell = 1221.20;

}else if(applsharessell == 9){
applsharessell = 1373.85;

}else if(applsharessell == 10){
applsharessell = 1576.10;

}

totalaaplvalue = mp2 - applsharessell;

System.out.println("$" + totalaaplvalue);

}
    }



//scenario 2
public static void scenario2(){
    //buy share
    aaplmarketprice = 126.23;
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
    
    if(choice.equals("a") && !(choice.equals("0"))){
 
        System.out.println("Type in the number of shares you would like to buy:");
        double applsharessbuy = scan.nextDouble();
    
        totalaaplvalue = aaplmarketprice * applsharessbuy;
    
        double newshares = currentsharesowned + applsharessbuy;
        totalaaplvalue = aaplmarketprice * newshares;
        
                 System.out.println(" $ " + totalaaplvalue);
       
       
    
    
    } else if(choice.equals("B") && !(choice.equals("0"))){
    System.out.println("Type in the number of shares you would like to sell:");
    double applsharessell = scan.nextDouble();
    double mp2 = 126.23 * currentsharesowned;
   

if(applsharessell == 1){
    applsharessell = 126.23;

}else if(applsharessell == 2){

    applsharessell = 252.46;

}else if(applsharessell == 3){
    applsharessell = 457.95;

}else if(applsharessell == 4){
    applsharessell =  504.92;

}else if(applsharessell == 5){
applsharessell = 631.5;

}else if(applsharessell == 6){
applsharessell = 757.38;

}else if(applsharessell == 7){
applsharessell = 883.61;

}else if(applsharessell == 8){
applsharessell =1009.84;

}else if(applsharessell == 9){
applsharessell =1136.07;

}else if(applsharessell == 10){
applsharessell = 1262.30;

}

totalaaplvalue = mp2 - applsharessell;

System.out.println("$" + totalaaplvalue);
}
       }
   
   
    


//storyline 3
    public static  void scenario3(){
 
 aaplmarketprice = 111.34;
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
 
 if(choice.equals("a") && !(choice.equals("0"))){
 
     System.out.println("Type in the number of shares you would like to buy:");
     double applsharessbuy = scan.nextDouble();
 
     totalaaplvalue= aaplmarketprice * applsharessbuy;
 
     double newshares = currentsharesowned + applsharessbuy;
     totalaaplvalue = aaplmarketprice * newshares;
     
              System.out.println(" $ " + totalaaplvalue);
    
 
 
 } else if(choice.equals("b") && !(choice.equals("0"))){
 System.out.println("Type in the number of shares you would like to sell:");
 double applsharessell = scan.nextDouble();
 double mp2 = 111.34 * currentsharesowned;

if(applsharessell == 1){
    applsharessell =111.34;

}else if(applsharessell == 2){

    applsharessell = 222.68;

}else if(applsharessell == 3){
    applsharessell = 334.02;

}else if(applsharessell == 4){
    applsharessell =  445.36;

}else if(applsharessell == 5){
applsharessell = 556.70;

}else if(applsharessell == 6){
applsharessell = 668.04;

}else if(applsharessell == 7){
applsharessell = 779.38;

}else if(applsharessell == 8){
applsharessell = 890.72;

}else if(applsharessell == 9){
applsharessell = 1002.06;

}else if(applsharessell == 10){
applsharessell = 1113.40;
}


totalaaplvalue = mp2 - applsharessell;

System.out.println("$" + totalaaplvalue);
 }

    }



//storyline 4
    public static void scenario4(){
 
 aaplmarketprice = 131.34;
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
 if(choice.equals("a") && !(choice.equals("0"))){
 
    System.out.println("Type in the number of shares you would like to buy:");
    double applsharessbuy = scan.nextDouble();

    totalaaplvalue = aaplmarketprice * applsharessbuy;

    double newshares = currentsharesowned + applsharessbuy;
    totalaaplvalue = aaplmarketprice * newshares;
    
             System.out.println(" $ " + totalaaplvalue);
   
    
 
 
 } else if(choice.equals("b") && !(choice.equals("0"))){
    System.out.println("Type in the number of shares you would like to sell:");
    double applsharessell = scan.nextDouble();
    double mp2 = 111.34 * currentsharesowned;


if(applsharessell == 1){
    applsharessell =131.34;

}else if(applsharessell == 2){

    applsharessell = 262.68;

}else if(applsharessell == 3){
    applsharessell = 394.02;

}else if(applsharessell == 4){
    applsharessell =  525.36;

}else if(applsharessell == 5){
applsharessell =   656.70;

}else if(applsharessell == 6){
applsharessell = 788.04;

}else if(applsharessell == 7){
applsharessell = 919.38;

}else if(applsharessell == 8){
applsharessell = 1050.72;

}else if(applsharessell == 9){
applsharessell = 1182.06;

}else if(applsharessell == 10){
applsharessell = 1313.40;
}


totalaaplvalue = mp2 - applsharessell;

System.out.println("$" + totalaaplvalue);
 }

 }






//end of class
}
