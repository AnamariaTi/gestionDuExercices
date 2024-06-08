package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 *
 * @author Tirdea Ana-Maria
 */
public class Ex04 {

    /*
        asks the user for a word and displays whether the first letter is
        the same as the last or not. For example, if the user enters “java”, the program
         displays that the first and last letters are not equal.
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("entre un mots : ");
        String mots = key.nextLine();

        int longuer = mots.length();
        char premierLettre = mots.charAt(0);
        char dernierLettre = mots.charAt(longuer - 1);

        for (int i = 0; i < mots.length(); i++) {

        }
        if (premierLettre == dernierLettre) {
            System.out.println("les 1er lettre et dernier c'est la même : " + premierLettre);
        } else {
            System.out.println("les 1er lettre " + premierLettre + " et dernier lettre  " + dernierLettre + "sont pas la même ");
        }
    }
}
