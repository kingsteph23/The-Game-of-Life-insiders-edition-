import java.util.*;

public class main{

    public static void  roles(){
        congress techcommittee = new congress();
        regularjoe shareholder = new regularjoe();
    Scanner scan = new Scanner(System.in);
    //title
    System.out.println("-------------------------------------"+
    "\n The Game of life(insiders edition 🇺🇸 🏛️"+
     "\nhit [ENTER] on your keyboard)    "+ 
    "\n--------------------------------------- ");                                       

    scan.nextLine();

    System.out.println("Instructions:"+
    "\nWhen asked to [Enter], press [ENTER] on your keyboard"+
    "\nWhen asked to select a role/ buy or sell a stock , either press (a) or (b) on your keyboard"+
    "\nWhen asked to type the number of shares to buy/sell as a representative, you cannot enter 0 and go higher than 5"+
    "\nWhen asked to type the number of shares to buy/sell as a apple shareholder, you cannot enter 0 and  go higher than 10"+
    "\nHave fun!");

    System.out.println();
    //choosing a role
    System.out.println("Please select a role:"+
    "\n(a) Representative"+
    "\n(b) Average Joe");
    
    String role = scan.nextLine();
    // starts play representative role
    if(role.equals("a")){
       congress.techcommittee();
    
        // starts playing average Joe role.
    }else if(role.equals("b")){
        regularjoe.shareholder();
    }
    
    
    // static void end
    }
    
    
    

public static void main(String[] args){

   
roles();




// fin de la classe
}
}
