
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex11 {
    /*
     asks the user for a series of positive numbers ending in
     ends in -1 (sentinel value) and displays whether this series is strictly
     or not. It is assumed that the series contains at least 2 numbers.
    */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in); 
        System.out.println("veuillez entre une série de nombres positif se terminat par -1 ");
        int nombrePrecedent ; 
        int nombreActuelle ; 
        
        
        nombrePrecedent = key.nextInt(); 
         
        if (nombrePrecedent == -1) {
            System.out.println("La série doit contenir au moins deux nombres.");
      
      
        }
        
        
        nombreActuelle = key.nextInt(); 
        if(nombreActuelle == -1){
            System.out.println("la série doit contenir au mois 2 nombres ");
        }
        
        
          boolean estStrictementCroissante = true ; 
          
          // lire les nombres suivants 
          
          while( true ){
              if(nombreActuelle == -1){
                  break ; 
              }
              if(nombreActuelle <= nombrePrecedent ){
                  estStrictementCroissante = false ; 
              }
              
              
              //mettre a jour le nombre précédent 
              
              nombrePrecedent = nombreActuelle; 
              
              
              nombreActuelle = key.nextInt(); 
              
              
              
          }
          
          if(estStrictementCroissante){
              System.out.println("la série est strictement croissante ");
          }else{
              System.out.println("la série n'est pas strcitement croissante ");
          }
          
        
    }
    
}
