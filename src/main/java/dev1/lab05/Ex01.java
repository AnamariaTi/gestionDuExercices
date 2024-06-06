
package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("entre un numero : ");
        int n = key.nextInt();

        //numbers from 1 to n 
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        //even numbers between 1 and n 
        for (int y = 0; y <= n; y++) {

            if (y % 2 == 0) {
                System.out.print(y + " ");
            }

        }
        System.out.println();

        //multiples of 5 between 1 and n
        for (int x = 1; x <= n; x++) {
            if (x % 5 == 0) {
                System.out.print(x + " ");
            }

        }
        System.out.println();

        //multiples of n between 1 and 100
        for (int z = 1; z <= 100; z++) {
            if (z % n == 0) {
                System.out.print(z + " ");
            }
        }

    }

}
