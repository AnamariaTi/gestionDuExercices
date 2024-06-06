
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Variante3 {
     //sentinel value
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); 
        System.out.println("Entrez les valeurs (termiez par -1");
        int valeur = clavier.nextInt(); 
        int somme = 0 ; 
        int nbValeurs = 0 ; 
        
        while(valeur > -1){
            somme =somme + valeur ; 
            nbValeurs = nbValeurs+1 ; 
            System.out.println("entrez une valeur :  ");
            valeur = clavier.nextInt(); 
        }
        System.out.println("vous avez entre :" + nbValeurs + "valeurs ");
        System.out.println("la somme de toutes ces valeurs :  " + somme );
    }
    
}
