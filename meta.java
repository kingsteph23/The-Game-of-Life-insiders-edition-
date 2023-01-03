import java.util.*;


public class meta {

    // portfolio variables
static String[] tickersymbols; 
static double value;
static String accountype;
static int numOfShares;
static double average;
static double gainandloss;

static double marketprice;
static double metamarketprice;
                 
static int numofmeta; 
static double totalmetavalue;

static Scanner scan = new Scanner(System.in);

//sell
    public static void metaplatforms(){
        double currentsharesowned = 5;
        metamarketprice = 128.44;
        System.out.println("Market Price: " + metamarketprice +
        "\nVolume:17,796,625"+
        "\n90 day volume:  40M"+
        "\nTodays range: $123.4-$129.01"+
        "\n52 week range: $110.45-$243.3"+
        "\nPrimary exchange: NASDAQ-NMS"+
        "\nPrevious close: $122.20"+
        "\nOpen: $123.01");
    
        System.out.println("Would you like to buy or sell shares of META(Meta Platforms)?"+
        "\n(A) buy"+
        "\n(B) sell");

        String choice = scan.nextLine();
        // if choice is buy
        
        if(choice.equals("A") && !(choice.equals("0"))){
     
            System.out.println("Type in the number of shares you would like to buy:");
            int metasharessbuy = scan.nextInt();
            double newshares = currentsharesowned + metasharessbuy;
            totalmetavalue = metamarketprice * newshares;
    
             System.out.println(" $ " + totalmetavalue);
            
    

    
    } else if(choice.equals("B") && !(choice.equals("0"))){
        System.out.println("Type in the number of shares you would like to sell:");
        int metasharessell = scan.nextInt();
    
        totalmetavalue = metamarketprice / metasharessell;
        System.out.println("$" + totalmetavalue);
    }
}

public static void metaplatforms2(){
    //buy
//second chart
metamarketprice = 105.43;
System.out.println("Market Price: " + metamarketprice +
"\nVolume:17,796,625"+
"\n90 day volume:  45m"+
"\nTodays range: $115.54-$118.18"+
"\n52 week range: $105.43-$243.3"+
"\nPrimary exchange: NASDAQ-NMS"+
"\nPrevious close: $107.32"+
"\nOpen: $106.41");

}
//end of class
}