
package dev1.lab07;

/**
  * call method in main
 * @author Tirdea Ana-Maria
 */
public class Calendrier {

    public static String nomMois(int mois) {
        String nom;
        switch (mois) {
            case 1:
                nom = "Janvier ";
                break;
            case 2:
                nom = "Fevrier ";
                break;
            case 3:
                nom = "Mars ";
                break;
            case 4:
                nom = "Avril";
                break;
            case 5:
                nom = "Mai";
                break;
            case 6:
                nom = "Juin";
                break;
            case 7:
                nom = "Juillet";
                break;
            case 8:
                nom = "Août";
                break;
            case 9:
                nom = "Septembre ";
                break;
            case 10:
                nom = "Octombre";
                break;
            case 11:
                nom = "Novembre ";
                break;
            case 12:
                nom = "Decembre";
                break;
            default:
                throw new IllegalArgumentException("Numero du mois impossible " + mois);

        }
        return nom;
    }

    public static void afficherTitre(int mois, int annee) {
        System.out.println("================================");
        System.out.println("           " + nomMois(mois) + " " + annee);
        System.out.println("================================");

    }
    public static void afficherFinal() {
        System.out.println("================================");
        System.out.println();
        System.out.println("================================");
    }

    public static void afficherEntete() {
       System.out.println("Lu   Ma   Me   Je   Ve   Sa   Di");

    }

    public static void afficherMois(int decalage, int nombreJours) {
        for (int i = 0; i < decalage; i++) {
            System.out.print("     ");
        }

        for (int jour = 1; jour <= nombreJours; jour++) {
            if (jour < 10) {
                System.out.print("0" + jour + "   ");
            } else {
                System.out.print(jour + "   ");
            }
            if ((jour + decalage) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println();

    }

    public static boolean estBissextile(int annee) {
        return (((annee % 4) == 0) && ((annee % 100 != 0) || (annee % 400 == 0)));
    }

    public static int nombreJours(int mois, int annee) {
        int nbJours = 31;
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            nbJours = 30;
        } else if (mois == 2) {
            if (estBissextile(annee)) {
                nbJours = 29;
            } else {
                nbJours = 28;
            }
        }

        return nbJours;
    }

    public static int numeroJour(int jour, int mois, int annee) {
        /*
         Calcul basé sur la congruence de Zeller
         https://en.wikipedia.org/wiki/Zeller's_congruence
         */

        int anneeCorrige = annee;
        int m = mois;
        int q = jour;

        if (mois == 1 || mois == 2) {
            anneeCorrige = annee - 1;
            m = mois + 12;
        }

        int j = anneeCorrige / 100;
        int k = anneeCorrige % 100;

        return (q + ((m + 1) * 13) / 5 + k + k / 4 + j / 4 + 5 * j + 5) % 7;
    }
}
