package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex10 {

    /*
    asks the user for a word and displays the number of vowels and consonants in the word.
    For example, if the user enters “programming”, the program displays “5 vowels and 8 consonants".
     */
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Veuillez entrer un mot: ");
        String mot = scanner.nextLine();


        // Initialize vowel and consonant counters
        int voyelles = 0;
        int consonnes = 0;

        // Convert word to lower case to simplify comparisons
        mot = mot.toLowerCase();

       
        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);

            // check whether the character is a vowel 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                voyelles++;
            } else if (c >= 'a' && c <= 'z') {
                // If it's a letter but not a vowel, it's a consonant
                consonnes++;
            }
        }

       
        System.out.println(voyelles + " voyelles et " + consonnes + " consonnes");

    }
}
    
    

      
    /* another kind of result 
     asks the user for a word and displays the number of vowels and consonants in the word.
    For example, if the user enters “programming”, the program displays “the vowels and the consonants".


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("entre un mots : ");
        String mots = key.nextLine();

        if (mots.isEmpty()) {
            System.out.println("Le mot ne peut pas être vide.");
        } else {
            char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};

            StringBuilder voyellesTrouvees = new StringBuilder();
            StringBuilder consonnesTrouvees = new StringBuilder();

            // Go through each letter of the word
            for (int i = 0; i < mots.length(); i++) {
                char lettre = Character.toLowerCase(mots.charAt(i));

                // Check if the letter is a vowel
                for (char voyelle : voyelles) {
                    if (lettre == voyelle) {
                        voyellesTrouvees.append(mots.charAt(i)).append(" "); // Ajouter la lettre originale

                    }
                }
                // Check if the letter is a consonant
                if (lettre >= 'a' && lettre <= 'z' && lettre != 'a' && lettre != 'e' && lettre != 'i'
                        && lettre != 'o' && lettre != 'u' && lettre != 'y') {
                    consonnesTrouvees.append(mots.charAt(i)).append(" ");

                }
            }

            if (voyellesTrouvees.length() > 0) {
                System.out.println("Les  voyelles dans le mot sont: " + voyellesTrouvees.toString().trim());
            }
            if (consonnesTrouvees.length() > 0) {
                System.out.println("les  consone dans le mot sont : " + consonnesTrouvees.toString().trim());
            }
        }
    }
}
*/