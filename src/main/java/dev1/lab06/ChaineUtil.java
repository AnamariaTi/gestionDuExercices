
package dev1.lab06;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class ChaineUtil {

    public static char premiereLettre(String mot) {
        return mot.charAt(0);

    }

    public static char dernierLettre(String mot) {
        int longuer = mot.length();

        return mot.charAt(longuer - 1);
    }

    public static int nombreVoyelles(String mot) {
        int count = 0;

        for (int i = 0; i < mot.length(); i++) {
            char c = Character.toLowerCase(mot.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }

        }

        return count;
    }

    public static int nombreConsonne(String mot) {
        int count = 0;
        for (int i = 0; i < mot.length(); i++) {
            char c = Character.toLowerCase(mot.charAt(i));
            if (Character.isLetter(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')) {
                count++;
            }
        }

        return count;
    }

    public static boolean estPalindrome(String mot) {
        mot = mot.toLowerCase();
        boolean estPali = true;
        for (int i = 0; i < mot.length() / 2; i++) {
            if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
                estPali = false;
                break;
            }

        }
        return estPali;



    }
}

