package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 *
 * @author Tirdea Ana-Maria
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner ligne = new Scanner(System.in);
        System.out.println("entre la longueur d'un ligne pour l'affiche : ");
        int longueur = ligne.nextInt();
        for (int i = 1; i <= longueur; i++) {
            System.out.print("-");
        }
        System.out.println();

    }
}
