
package dev1.lab02;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Lab2 {
     public static void main(String[] args) {
   
     
  
        
        //lab 2 
        System.out.println("Lab 02");
        int longueur = 12;
        int largeur = 4;
        System.out.println("l'aire du rectangles est : ");
        System.out.println(longueur * largeur);
        System.out.println();
   
        
        
    
        //lecture au clavier lab 02
        System.out.println("Lecture au clavier lab 02 ");
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longeur de rectangle : ");
        int log = clavier.nextInt();
        System.out.println("Entre la largeur du rectangle : ");
        int lag = clavier.nextInt();
        System.out.println("l'aire du rectangle vaut : ");
        System.out.println(log * lag);
        System.out.println();

        
}
}