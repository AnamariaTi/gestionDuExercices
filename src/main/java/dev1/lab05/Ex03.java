package dev1.lab05;

import java.util.Scanner;

/**
 * This method appends the mentioned string with the existing string. You can
 * also with arguments like boolean, char, int, double, float, etc. *exercises
 * tested in main
 *
 * @author Tirdea Ana-Maria
 */
public class Ex03 {

    public static void main(String[] args) {

        //ask the user for a word and displays whether the all letters is a consonant or not
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un mot: ");
        String mot = scanner.nextLine();

        if (mot.isEmpty()) {
            System.out.println("Le mot ne peut pas être vide.");
        } else {
            StringBuilder consonnesTrouvees = new StringBuilder();

            // Go through each letter of the word
            for (int i = 0; i < mot.length(); i++) {
                char lettre = Character.toLowerCase(mot.charAt(i));

                // Check if the letter is a consonant
                if (lettre >= 'a' && lettre <= 'z' && lettre != 'a' && lettre != 'e' && lettre != 'i'
                        && lettre != 'o' && lettre != 'u' && lettre != 'y') {
                    consonnesTrouvees.append(mot.charAt(i)).append(" ");
                }
            }

            if (consonnesTrouvees.length() > 0) {
                System.out.println("Les consonnes dans le mot sont: " + consonnesTrouvees.toString().trim());
            } else {
                System.out.println("Aucune consonne trouvée dans le mot.");
            }
        }

        scanner.close();
    }
}
