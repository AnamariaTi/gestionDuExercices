package com.mycompany.gestionduexercice;

import java.util.Scanner;

/**
 *
 * @author Tirdea Ana-Maria
 */
public class GestionDuExercice {

    public static void main(String[] args) {
     
        //asks the user for 10 whole numbers, and for each of these displays, as it goes along, whether it is odd or even.
        Scanner nomber = new Scanner(System.in); 
       // int nbValue = 0  ; 
       for(int i = 0 ; i  < 10 ; i ++){
            System.out.println("Entrez 10 numero  " + (i+1) + ":" );
            double no = nomber.nextDouble(); 
         //    nbValue = nbValue +1 ; 
            System.out.println("les numero sont : " + no );
            if(no % 2 == 0){
                System.out.println("les numero c'est pair sont  : "+ no);
            }else {
                System.out.println("les nhumero c'est impair  sont "+  no );
            }
         
        }
          
        
        
    }
}

    
    
    
    
    
        
      
        
    


