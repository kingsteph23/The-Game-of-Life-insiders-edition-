import java.util.*;

public class main{

    public static void  roles(){
        congress techcommittee = new congress();
        regularjoe shareholder = new regularjoe();
    Scanner scan = new Scanner(System.in);
    //title
    System.out.println("-------------------------------------"+
    "\n The Game of life(insiders edition 🇺🇸 🏛️)    "+ 
    "\n---------------------------------------                         ");                                       
    
    scan.nextLine();
    //choosing a role
    System.out.println("Please select a role:" +
    "\n(A) Representative"+
    "\n(B) Average Joe");
    
    String role = scan.nextLine();
    // starts play representative role
    if(role.equals("A")){
       congress.techcommittee();
    
        // starts playing average Joe role.
    }else if(role.equals("B")){
        regularjoe.shareholder();
    }
    
    
    // static void end
    }
    
    
    

public static void main(String[] args){

   
roles();




// fin de la classe
}
}
