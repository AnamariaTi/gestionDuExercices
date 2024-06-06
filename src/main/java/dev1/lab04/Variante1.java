
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Variante1 {
    public static void main(String[] args) {
     
        
        
        //enter the values and then calculate them 
        Scanner clavier = new Scanner(System.in);
        int somme = 0 ;
        int nbValeurs = 0 ; 
        
        System.out.println("Entrez 10 valeurs :  ");
        while(nbValeurs < 10){
            int valeur = clavier.nextInt(); 
            somme = somme + valeur ; 
            nbValeurs = nbValeurs + 1 ; 
        }
        System.out.println("la somme de toutes ces valeurs : "+ somme);
        
        
        
    }
}
