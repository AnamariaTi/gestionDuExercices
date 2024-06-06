package dev1.lab04;

import java.util.Scanner;

/**
 * exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex06 {

    public static void main(String[] args) {
        /*
          asks the user the number n of values to be entered to enter, reads these n values from 
        keyboard and displays the number of positive , negative values and the number of zero values.
        */
        Scanner nomberValue = new Scanner(System.in);
        Scanner values = new Scanner(System.in);
        System.out.println("Entre combien du valuer voulais ajoute : ");
        int noValue = nomberValue.nextInt();
        int positifs = 0;
        int negatifs = 0;
        int nuls = 0;

        for (int i = 0; i < noValue; i++) {
            System.out.println("entrez le " + noValue + " values demande , les value " + (i + 1) + ":");
            double v = values.nextDouble();

            if (v > 0) {
                positifs++;
            } else if (v < 0) {
                negatifs++;
            } else {
                nuls++;
            }
        }

        System.out.println("positifs numero sont : " + positifs);
        System.out.println("negatifs numero sont : " + negatifs);
        System.out.println("nuls numero sont : " + nuls);

    }

}
