import java.util.*;


public class congress {
    //calling tech company methods
    public static  void techcompanies(){
        appl appleinc = new appl();
        appl appleinc2 = new appl();
        meta metaplatforms = new meta();
        meta metaplatforms2 = new meta();
        mrna modernainc = new mrna();
        mrna modernainc2 = new mrna();
        

}

public static void techcommittee(){
   
    Scanner scan = new Scanner(System.in);
//intro as a Representative


System.out.println("Congratulations Representative on your recent election!"+
                   "\nBased on your previous experience with working in the tech sector, biohealth, and financial sector....."+
                   "\nWe've decided to place you on the  House science Space and technology commitee."+
                   "\nIn particular, the: Research and Technology and Investigations and oversight"+
                   "\nPress [ENTER] on your keyboard");

                   scan.nextLine();
                   

//second research and tech subcommittee issue


// AAPL stock. Incentives from states with expanding silicon chip development/5g. 
 //More jobs in states. not so much china. Tech in the USA
System.out.println(" In order to reshore many technology manufacturing jobs back to the USA, as well as increase silicon engineering and 5g technology innovation in the US."+
                    "\nThe state governments of Massachusetts, California, Texas, and North Carolina. As well as the federal government has decided to create a program which gives subsidies to"+
                    "\ntechnology companies that can assist in accomplishing these national goals."+
                    "\nPress [ENTER] on your keyboard");


appl.appleinc();
System.out.println();

//after news is public
System.out.println("WSJ- US Congress passes technology  bill which will increase incentives for technology companies"+
                     "\ncontributing to silicon engineering and 5g technology innovation in the US");
appl.appleinc2();
scan.nextLine();


//3rd research and committee issue
// meta data breach, more news on privacy issues. Sell meta stock
System.out.println("On your 3rd issue as a member of the  House science Space and technology investigations committee"+
"\nYou are assigned to investigate a recent Data Breach with Meta inc databases. Which is  believed to originate from Russian Hack group."+
"\nThis data breach is estimated to have affected between 250-500 million users. As well as leading to millions of accounts personal info(ranging from email adresses to financial info), being leaked."+
 "\nAs expected, this event will negatively affect the company, and might potentially  lead to a potential commitée hearing.");

 System.out.println();
 // sell meta stock
meta.metaplatforms();
 
System.out.println();
//after sell
System.out.println("NYT- Data breach at Meta inc. puts 250-500 millions Facebook users personal information at risk.");
meta.metaplatforms2();



//4th research and committee issue
// moderna health crisis, s more biohealth shares
System.out.println();

System.out.println("In order to  combat said rise in flu cases, the president is expected with a few days to declare a public health emergency."+
                   "\n Which will direct the Health and Human Services, the CDC, and various biotechnology companies to combat this rise via emergency funding for vaccine production. ");

                   System.out.println();
mrna.modrnainc();

System.out.println();
//buy mrna sh
 mrna.modrnainc2();
//end of method


    System.out.println();

    System.out.println("After making multiple well timed trades which consisted of you having a pattern of trading in the right direction before big moves "+
                        "\nand having a pattern of trading in the right direction before big moves."+
                        "\nAnd due to said market trades, has resulted in a House ethics commitee investigation into you due to suspicion of insider trading."+
                        "\nAfter said investigation: review of the many stock trades and bank transactions, this has led to the ethics commitee believing that you particpated in insider trading "+
                        "\nYet your reasoning consist of a financial advisor making trades for you, despite the many trades consisting of companies in your commitee"+
                        "\nWhich eventually leads to these acusations being dropped, and the investigation being dropped"+
                        "\nAnd back to buisness as usual.... ");

}

                    
/* 
                        
FIx selling
making market price 
                                              
        📈 🟢
         📉🔴
         

    
*/

}
//end of class


