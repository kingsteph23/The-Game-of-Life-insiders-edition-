import java.util.*;


public class congress {
    //calling tech company methods
    public static  void techcompanies(){
        txn texasinstruments = new txn();
        txn texasinstruments2 = new txn();
        appl appleinc = new appl();
        appl appleinc2 = new appl();
        meta metaplatforms = new meta();
        meta metaplatforms2 = new meta();
        mrna modernainc = new mrna();
        mrna modernainc2 = new mrna();
        

}

public static void techcommittee(){
   int cashbalance = 10000;
    Scanner scan = new Scanner(System.in);
//intro as a Representative


System.out.println("Congratulations Representative on your recent election!"+
                   "\nBased on your previous experience with working in the tech sector, biohealth, and financial sector....."+
                   "\nWe've decided to place you on the  House science Space and technology commitee."+
                   "\nIn particular, the: Research and Technology and Investigations and oversight ");

scan.nextLine();

//first research and tech subcommittee issue
System.out.println(" As a member of the research and technology subcommittee, you deal with all maters related to science policy."+
                  "\n While on committee, you eventually to deal with your first commitée hearing."+
                  "\nWhich consist legislation to aid and subsidies for the Semiconductor companies in order to "+
                   "\nincrease American dominance in semiconductor industry ");
    
    
System.out.println();
// txn stock, buy or sell more shares of txn stock. Show 

txn.texasinstruments();

//wsj news
System.out.println("Wall Street Journal-  United States House of Representives passes semiconductor bill "+
                    "\nWhich will provide aid and subsidies for the Semiconductor companies in order to increase semiconductor production in the US."+
                    "\nThis bill will also continue to assist companies such as AMD, Texas Instruments, Intel, Sun Microsystems, and others will this production as well.");


                  scan.nextLine();
//second chart

txn.texasinstruments2();

//SPACE
System.out.println();


//second research and tech subcommittee issue


// AAPL stock. Incentives from states with expanding silicon chip development/5g. 
 //More jobs in states. not so much china. Tech in the USA
System.out.println(" In order to reshore many technology manufacturing jobs back to the USA, as well as increase silicon engineering and 5g technology innovation in the US."+
                    "The state governments of Massachusetts, California, Texas, and North Carolina. As well as the federal government has decided to create a program which gives subsidies to"+
                    "technology companies that can assist in accomplishing these national goals.");

scan.nextLine();
appl.appleinc();

//after news is public
appl.appleinc2();
scan.nextLine();


//3rd research and committee issue
// meta data breach, more news on privacy issues. Sell meta stock
System.out.println("On your 3rd issue as a member of the  House science Space and technology investigations committee"+
"\nYou are assigned to investigate a recent Data Breach with Meta inc databases. Which is  believed to originate from Russian Hack group."+
"\nThis data breach is estimated to have affected between 250-500 million users. As well as leading to millions of accounts personal info(ranging from email adresses to financial info), being leaked."+
 "\nAs expected, this event will negatively affect the company, and might potentially  lead to a potential commitée hearing.");

 // sell meta stock
meta.metaplatforms();
 

//after sell
meta.metaplatforms2();



//4th research and committee issue
// moderna health crisis, s more biohealth shares


System.out.println("As a result of the ongoing surge of flu nationwide, there is ongoing fear that this would eventually negatively impact "+
                   "\nthe general public, and trigger an economic downturn(especially market downturn) that is expected to last for some time.");

scan.nextLine();
mrna.modrnainc();
//new sell mrna shares

//buy mrna shares
System.out.println("In order to  combat said rise in flu cases, the president is expected with a few days to declare a public health emergency."+
                   "\n Which will direct the Health and Human Services, the CDC, and various biotechnology companies to combat this rise via emergency funding for vaccine production. ");
 mrna.modrnainc2();
//end of method
}


                    

/* 
                        
FIx selling
making market price 
                                              
        📈 🟢
         📉🔴
         

    
*/

}
//end of class


