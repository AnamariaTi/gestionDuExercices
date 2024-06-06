
package dev1.lab05;

import java.util.Scanner;

/**
  * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Lab5 {
    // character strings 
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in); 
        String texte = key.nextLine(); 
        
        System.out.println("les texte entre est : " + texte );
        
         int longueur = texte.length(); 
         System.out.println("la longueur du texte est :  "+ longueur );
    
         
         char premiereLettre = texte.charAt(0); 
         char dernierLettre = texte.charAt(longueur-1); 
         System.out.println(premiereLettre);
         System.out.println(dernierLettre);
         
         for(int i = 0 ; i < texte.length(); i++){
             System.out.println(texte.charAt(i));
                     
         }
         
         System.out.println();
         for(int i = texte.length()-1; i >= 0 ; i--){
             System.out.println(texte.charAt(i));
         }
         
         
        
    }
    
    
    
    
    
    
}
