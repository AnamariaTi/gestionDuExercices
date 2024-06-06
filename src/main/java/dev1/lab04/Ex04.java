package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 *
 * @author Tirdea Ana-Maria
 */
public class Ex04 {

    public static void main(String[] args) {

        //asks the user for 10 whole numbers, and for each of these displays, as it goes along, whether it is odd or even.
        Scanner nomber = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez 10 numero  " + (i + 1) + ":");
            double no = nomber.nextDouble();

            System.out.println("les numero sont : " + no);
            if (no % 2 == 0) {
                System.out.println("les numero c'est pair sont  : " + no);
            } else {
                System.out.println("les nhumero c'est impair  sont " + no);
            }

        }
    }
}
