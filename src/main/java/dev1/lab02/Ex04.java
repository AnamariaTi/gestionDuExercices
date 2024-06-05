
package dev1.lab02;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex04 {
 
    public static void main(String[] args) {
  
        //ex 4 lab 02 
        System.out.println("Excerice 4 lab 02");
        Scanner cercle = new Scanner(System.in);
        System.out.println("Entre le rayon d'un cercle ");
        double rayon = cercle.nextDouble();
        System.out.println("Le perimetre du cerc c'est :");
        System.out.println(2 * Math.PI * rayon);
        System.out.println("L'aire du cerc c'est : ");
        System.out.println(Math.PI * rayon * rayon);
        System.out.println();
   
}
}
