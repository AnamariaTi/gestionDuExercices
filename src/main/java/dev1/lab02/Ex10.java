
package dev1.lab02;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex10 {
 
    public static void main(String[] args) {
           
        //ex 10 lab 02
        System.out.println("Exercice 10 lab 02 ");
        Scanner interes  = new Scanner(System.in); 
        System.out.println("Entre les montant pour affiche les interes apres 1 ans  : ");
        double montant = interes.nextDouble(); 
        System.out.println("les du 2% du interes sont apres un annee : " + (montant *0.02)+ " euro ");
        System.out.println();
           
}
}