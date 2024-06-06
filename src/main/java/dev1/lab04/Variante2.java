
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Variante2 {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in); 
        System.out.println("Combien de valuers voulez-vous entrer : ");
        int nbValuersTotal = clavier.nextInt(); 
        int somme = 0 ; 
        int nbValue = 0 ; 
        
        while(nbValue < nbValuersTotal){
            System.out.println("entrer unse valuer : ");
            int valuer = clavier.nextInt(); 
            somme = somme + valuer; 
            nbValue= nbValue+1; 
        }
        System.out.println("vous avez entre : " + nbValuersTotal + "valeurs : ");
        System.out.println(" la somme de toutes ces valeurs "+ somme);
    }
}
