
package dev1.lab03;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Lab3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); 
        System.out.println("Entrez un nomber entier ");
        int nb = clavier.nextInt(); 
        if(nb>=0){
            System.out.println("ce nomber est positif  ");
             
        }else if(nb < 0){
            System.out.println("ATTENTION !!!! - ce nomber est negatif  ");
        }else{
            System.out.println("ce numbre null ");
        }
    }
}
