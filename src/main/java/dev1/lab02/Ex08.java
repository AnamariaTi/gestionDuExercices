
package dev1.lab02;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex08 {
 
       public static void main(String[] args) {
  
       //ex 8 lab 02 
        System.out.println("Exercice 8 lab 02");
        Scanner seconds = new Scanner(System.in); 
        System.out.println("entre les seconde que vous voulais transforme en minute :  ");
        int minute = seconds.nextInt() ; 
        System.out.println("votre minute sont : " + minute / 60 );
        System.out.println( );

}
}
