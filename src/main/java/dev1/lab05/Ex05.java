
package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex05 {
    /*
     asks the user for a word and displays its mirror. 
     For example, if the user enters “java”, the program displays avaj

    */
     public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("entre un mots : ");
        String mots = key.nextLine();

        int longuer = mots.length();

        for (int i = mots.length() - 1; i >= 0; i = i - 1) {
            System.out.print(mots.charAt(i));

        }

    }
}
