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

//tech commitee methods
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

//callingappleclass
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
//after sell and news story
System.out.println("NYT- Data breach at Meta inc. puts 250-500 millions Facebook users personal information at risk.");
meta.metaplatforms2();



//4th research and committee issue
// moderna health crisis, s more biohealth shares
System.out.println();

System.out.println("In order to  combat said rise in flu cases, the president is expected with a few days to declare a public health emergency."+
                   "\n Which will direct the Health and Human Services, the CDC, and various biotechnology companies to combat this rise via emergency funding for vaccine production. ");

                   System.out.println();

                   //calling moderna class
mrna.modrnainc();

System.out.println();
//after news is released
 mrna.modrnainc2();
//end of method


    System.out.println();
//end of congress storyline
    System.out.println("After making multiple well timed trades which consisted of you having a pattern of trading in the right direction before big moves "+
                        "\nand having a pattern of trading in the right direction before big moves."+
                        "\nAnd due to said market trades, has resulted in a House ethics commitee investigation into you due to suspicion of insider trading."+
                        "\nAfter said investigation: review of the many stock trades and bank transactions, this has led to the ethics commitee believing that you particpated in insider trading "+
                        "\nYet your reasoning consist of a financial advisor making trades for you, despite the many trades consisting of companies in your commitee"+
                        "\nWhich eventually leads to these acusations being dropped, and the investigation being dropped"+
                        "\nAnd back to buisness as usual.... ");


                        System.out.println();
    
                        //annotated biblography links
                        System.out.println("If you are still intrested in the topic of how insider trading is used in the federal government."+
                                           "\nCheck out the following links:"+
                     "\n"+
                            
                    
                        "\nhttps://doi.org/https://www.wsj.com/articles/covid-washington-officials-stocks-trading-mmarkets-stimulus-11666192404?page=1"+
                          "\nWSJ- Discusses insider trading within federal health agencies such as HHS and CDC,and us treasury during the early days of covid 19"+
                                           "\n"+
                              
                        "https://doi.org/https://www.wsj.com/articles/the-regulators-of-facebook-google-and-amazon-also-invest-in-the-companies-stocks-11665670207"+
                          "\nWSJ-Discusses insider trading in the Federal Trade Comission where many senior officals made well timed during high profile/antitrust cases in regards to tech companies"+
                                           "\n"+
                              
                        "\nhttps://www.youtube.com/watch?v=nriHKFF1hUs"+
                        "\nYT video- Discusses the many loopholes founded with the STOCK ACT of 2012, which attempted to combat insder trading in congress."+
                                           "\n"+
                            
                        "\nhttps://doi.org/https://www.wsj.com/articles/burr-senate-colleagues-sold-stock-after-coronavirus-briefings-11584715866"+
                           "\nWSJ-Deep dive on how lawmakers made profit prior to the start of the covid-19 pandemic.In particular,with Senator Richard Burr."+
                                          "\n"+
                              
                               
                         "\nhttps://www.youtube.com/watch?v=TdYqE60-8E8"+
                           "\n YT video- detailed video which describes the process of insider trading in congress. Examples of insider trading in congress during covid19 pandemic and 2008 finacial crisis"+
                                            "\n"+
                            
                               
                         "\nhttps://www.npr.org/2012/02/10/146709359/rep-bachus-investigated-for-insider-trading"+
                         "\nDiscusses how the Chairiman of the House Finacial Services Commitee,Rep  Spencer Bachus was investigated due to betting against US market,"+
                            "\nwhile also understanding what was going on in the financial sector of the United States via closed-door meetings/holdings"+
                             "\n"+
                            
                          "\nhttps://www.youtube.com/watch?v=l3DZh1109W8"+
                         "\nYT video- Discusses how members of congress were able to make profit during the 2008 finacial crises via  the information they gained duringclosed door meetings."+
                                            "\n"+
                            
                          "\nhttps://www.congress.gov/112/plaws/publ105/PLAW-112publ105.html"+
                         "\nCongress bill-The Stock ACT of 2012,and its contents/methods used to prevent insider trading in congress."+
                                            "\n"+
                            
                          "\nhttps://doi.org/https://www.nytimes.com/2022/02/09/us/politics/pelosi-stock-trading-congress.html"+
                          "\nNYT- articles which discusses the bipartisan efforts to not only limit insider trading in congress, but also limit it in the executive/judical branches."+
                             "\n"+
                            
                          "\nhttps://doi.org/https://www.wsj.com/articles/government-officials-invest-in-companies-their-agencies-oversee-11665489653"+
                           "\nDiscusses insider trading within the executive branch, and its departments/agencies. In particular, the Department of Defense, Commerce    department,FDA,and EPA"+
                            
                          "\nhttps://doi.org/https://www.foxnews.com/opinion/pelosi-portfolio-example-congress-policy-investments"+
                          "\nFOX- Opinoated fox piece which discusses the corruption of insider trading , and discusses how Nancy pelosi profited from insider trading."+
                             "\n"+
                    
                                           
                          "\nhttps://doi.org/https://www.nytimes.com/interactive/2022/09/13/us/politics/congress-stock-trading-investigation.html"+
                           "\nNYT- Detailed list of members of congress, their committees, and their stock picckings. Discusses the magnitude of insider trading in congress."+
                             "\n"+
                            
                          "\nhttps://doi.org/http://blogs.luc.edu/compliance/?p=4459"+
                          "\nUniversity of Chicago study which explained the process of insider trading, and legislation proposed/passed to prevent it."+
                          "\nhttps://open.spotify.com/episode/1OSxWv370RvSeN0uakeRdl?si=EVE33TpFRhS8CMNQDySeXA"+
                             "\n"+
                            
                            "\nWSJ- Discusses loopholes used by politicans(in all three branches), to inside trade. Also discusses conflicts/insights in regard to the"+
                            "\nenforcement/regulation of insider trading in congress.");
                    
                        //links
                    }
                    
                    
                    }
                    //end of class
                    
                    
                    