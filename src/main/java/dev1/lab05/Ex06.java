
package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("entre un mots : ");
        String mots = key.nextLine();
        if (mots.isEmpty()) {
            System.out.println("les mots il peut pas etre empty ");
        } else {
            char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
            /* fr: 
            Cette classe permet de produire une chaîne de caractères nécessitant d'agréger une grande quantité d'informations.
            Concaténer des chaînes de caractères (via les opérateurs + ou +=) dans des boucles peut s'avérer très couteûx en temps.
            De nombreux objets temporaires (de type String) sont produits, ce qui fait forcer le garbage collector, et les recopies 
            des caractères d'une chaîne à l'autre vont être nombreuses et couteûses. Plutôt que d'utiliser des concaténations, 
            il vous est suggéré d'utiliser un StringBuilder qui permet de limiter les allocations mémoire et les recopies de chaînes. 
            Une fois toutes les informations injectées dans votre builder, vous pourrez produire la chaîne finale en invoquant la
            méthode toString.
            
            en : 
             This class can be used to produce a character string requiring the aggregation of a large quantity of information.
            Concatenating strings (using + or += operators) in loops can be very time-consuming.
            Numerous temporary objects (of type String) are produced, forcing garbage collection, and recopying 
            from one string to another. Rather than using concatenations, 
            we suggest you use a StringBuilder to limit memory allocation and string copying. 
            Once all the information has been injected into your builder, you can produce the final string by invoking the
            toString method.
             */
            StringBuilder voyellesTrouvees = new StringBuilder(); //concatenates strings in an optimized way

            int longuer = mots.length();

            for (int i = 0; i < mots.length(); i++) {
                char lettre = Character.toLowerCase(mots.charAt(i));

                // Check if the letter is a vowel
                for (char voyelle : voyelles) {
                    if (lettre == voyelle) {
                        voyellesTrouvees.append(mots.charAt(i)).append(" "); // Ajouter la lettre originale
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
