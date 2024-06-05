
package dev1.lab02;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex11 {


  public static void main(String[] args) {

     //ex 11 lab 2 
        System.out.println("Exercice 11 lab 02");
        Scanner products = new Scanner(System.in); 
        System.out.println("entre les prix unitaire d'un produits  hors tva :  ");
        double pro = products.nextDouble(); 
        Scanner htva = new Scanner(System.in); 
        System.out.println("entre les taux de tva  21 , 6 ou 12  :   ");
        int tva = htva.nextInt();
        Scanner quantite = new Scanner(System.in); 
        System.out.println("entre les quantite de produits vendue à un client : ");
        int q = quantite.nextInt(); 
        System.out.println("les prix total a payer avec tva : " + (((pro*q)* tva/100)+(pro*q)));
                

    
}
}
