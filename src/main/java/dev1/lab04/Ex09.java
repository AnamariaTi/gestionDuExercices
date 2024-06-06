package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 *
 * @author Tirdea Ana-Mariat
 */
public class Ex09 {

    /*
    asks the user for the number n of values to be entered to enter,
    reads these n values from the keyboard and displays the maximum and minimum values.
    Note that values may be negative.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer le nombre de valeurs que vous voulez introduire: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Le nombre de valeurs doit être supérieur à 0.");
            return;
        }

        System.out.println("Veuillez entrer " + n + " valeurs:");

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        // Read n values and find the maximum and minimum
        for (int i = 0; i < n; i++) {
            int valeur = scanner.nextInt();

            if (valeur > maximum) {
                maximum = valeur;
            }

            if (valeur < minimum) {
                minimum = valeur;
            }
        }

        System.out.println("maximum : " + maximum);
        System.out.println("minimum : " + minimum);

        scanner.close();
    }

}
