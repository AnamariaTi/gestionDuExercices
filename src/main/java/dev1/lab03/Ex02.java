
package dev1.lab03;

import java.util.Scanner;

/**
 * *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex02 {
     public static void main(String[] args) {
       Scanner nomber = new Scanner(System.in); 
        System.out.println("entre un numero entier ");
        int no = nomber.nextInt(); 
        if(no % 2 == 0){
            System.out.println("Votre numero c'est pair ");
        }else {
            System.out.println("Votre numero c'est impair ");
        }
    }
}
