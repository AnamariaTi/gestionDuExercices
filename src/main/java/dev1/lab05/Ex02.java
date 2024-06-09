package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * * @author Tirdea Ana-Maria
 */
public class Ex02 {
    //asks the user for a word and displays whether the all letter is a vowel or not

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer un mot: ");
        String mot = scanner.nextLine();

        if (mot.isEmpty()) {
            System.out.println("Le mot ne peut pas être vide.");
        } else {
            char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
            StringBuilder voyellesTrouvees = new StringBuilder();

            // Go through each letter of the word
            for (int i = 0; i < mot.length(); i++) {
                char lettre = Character.toLowerCase(mot.charAt(i));

                // Check if the letter is a vowel
                for (char voyelle : voyelles) {
                    if (lettre == voyelle) {
                        voyellesTrouvees.append(mot.charAt(i)).append(" "); // Ajouter la lettre originale
                        break;
                    }
                }
            }

            if (voyellesTrouvees.length() > 0) {
                System.out.println("Les voyelles dans le mot sont: " + voyellesTrouvees.toString().trim());
            } else {
                System.out.println("Aucune voyelle trouvée dans le mot.");
            }
        }

      
    }


}
