
package dev1.lab02;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex06 {
     public static void main(String[] args) {
  

       // ex 6 lab 02 
        System.out.println("Exercice 06 lab 02  ");
        Scanner nb = new Scanner(System.in); 
        System.out.println("entre un nomber  : ");
        int numereo = nb.nextInt(); 
        System.out.println("les unités  : ");
        System.out.println(numereo % 10);
        System.out.println("les dizaines  : ");
        System.out.println((numereo/10)% 10);
        System.out.println("les centaines :  ");
        System.out.println((numereo/100)%10);
        System.out.println( ) ;   
}
}