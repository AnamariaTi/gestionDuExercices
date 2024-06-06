package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 *
 * @author Tirdea Ana-Maria
 */
public class Ex03 {

    public static void main(String[] args) {

        //asks the user for 5 values and displays the sum of these and the average of these values.
        Scanner moyenne = new Scanner(System.in);
        double somme = 0;
        int nbValeurs = 0;
        double moy = 0;
        System.out.println("Entre 5 valeurs : ");
        while (nbValeurs < 5) {
            double valeur = moyenne.nextDouble();
            somme = somme + valeur;
            moy = somme / 5;
            nbValeurs = nbValeurs + 1;
        }
        System.out.println("le somme de toutes ces valeurs :" + somme);
        System.out.println("le moyenne de toutes ces valeurs : " + moy);

    }

}
