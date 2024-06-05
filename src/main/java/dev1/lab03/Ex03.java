
package dev1.lab03;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex03 {
       public static void main(String[] args) {
        Scanner nomber1 = new Scanner(System.in);
        Scanner nomber2 = new Scanner(System.in);
        System.out.println("entre un nomber entier :  ");
        int no1 = nomber1.nextInt();
        System.out.println("entre a 2 eme nomber entier :");
        int no2 = nomber2.nextInt();
        if (no1 < no2) {
            System.out.println("le max c'est : " + no1);
        } else {
            System.out.println("le max c''est : " + no2);
        }

    }
}
