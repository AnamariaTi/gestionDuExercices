package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex08 {

    /*
    Write a program that prompts the user to enter text. If the text is OK IS,
    the program responds I'm listening! If not, it displays I haven't understood! understood!
     */

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("entre un texte : ");
        String texte = key.nextLine();
        String texteAdmis = "OK ESI";
        String texteAdmisPetit = "ok esi";

        int longeur = texte.length();

        if (texte.isEmpty()) {
            System.out.println("vous pouvez pas laisse vide");
        } else {
            for (int i = 0; i < longeur; i++) {

            }

            if (texte.equals(texteAdmis) || texte.equals(texteAdmisPetit)) {
                System.out.println("Je vous écoute");
            } else {
                System.out.println("je n'ai pas compris ");
            }

        }
    }

}
