
package dev1.lab03;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex05 {
    
    public static void main(String[] args) {
        Scanner nomber1 = new Scanner(System.in);
        Scanner nomber2 = new Scanner(System.in);
        Scanner nomber3 = new Scanner(System.in);
        System.out.println("entre 1er nomber entier : ");
        int a = nomber1.nextInt();
        System.out.println("entre a 2eme nomber entier :  ");
        int b = nomber2.nextInt();
        System.out.println("entre a 3eme nomber entier : ");
        int c = nomber3.nextInt();
        if (a % 2 == 0) {
            System.out.println("a est divisible  par 2 c'est-a dire a est pair");
        }
        if (a % 2 == 1) {
            System.out.println("a est impair");
        }
        if (a % b == 0) {
            System.out.println("a est divibil par b ");
        }
        if (a < b) {
            System.out.println("a plus petit que b ");
        }
        if ((a <= b) && (a <= c)) {
            System.out.println("a est le minimum ");
        }
        if ((a < b && b < c) || (a > b && b > c)) {
            System.out.println("b est strictement compris entre a et c ");

        }

    }

}
