
package dev1.lab04;

import java.util.Scanner;

/**
  * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Lab4 {
    
    
    public static void main(String[] args) {
        
          //Loop - in progress while 
        int y = 1 ; 
        while(y <=10){
            System.out.println(y);
           y = y +1 ; 
        }
        
           //Reading multiple data
         Scanner temperature = new Scanner(System.in); 
        int jours = 30; 
        double somme = 0 ; 
        
      // Requires the user to enter the temperatures to be displayed each day 
        for( int i = 0 ; i < jours   ; i++){
              System.out.println("entre la temperature de chaque jour " + (i+1) + ":");
               double temp = temperature.nextDouble(); 
            System.out.println(somme += temp );
        }
        
       double moyenne = somme /jours ; 
        System.out.println("le temperature moyen du mois est : " +  moyenne);
    }
        
        
        
    
}
