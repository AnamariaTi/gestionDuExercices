
package dev1.lab03;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex06 {
       public static void main(String[] args) {
        Scanner no1 = new Scanner(System.in);
        Scanner no2 = new Scanner(System.in);
        Scanner no3 = new Scanner(System.in);
        System.out.println("entre un numero : ");
        double a = no1.nextDouble();
        System.out.println("entre a 2eme numero : ");
        double b = no2.nextDouble();
        System.out.println("entre a 3eme numero : ");
        double c = no3.nextDouble();

        if (a < b
                && b > c) {
            System.out.println("les max c'est : " + b);
        } else if (a > b && b > c) {
            System.out.println("les max c'est : " + a);
        } else {
            System.out.println("les max c'est : " + c);
        }

    }

}
