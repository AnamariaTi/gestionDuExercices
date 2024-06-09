package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex10 {

    /*
    asks the user for a series of positive numbers ending in
    ends with -1 (sentinel value). The program displays one of the following messages :
     The first is less than the last
     First is equal to last
     First is greater than last
     The series is empty (if the first number entered is -1)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une série de nombres positifs se terminant par -1:");

        // Variables pour stocker le premier et le dernier nombre
        int premierNombre = -1;
        int dernierNombre = -1;

        // Variable to read user input
        int nombre;

        // Read numbers until -1 is entered
        while (true) {
            nombre = scanner.nextInt();

            if (nombre == -1) {
                break;
            } else if (nombre >= 0) {
                // If this is the first number, assign it to firstNumber
                if (premierNombre == -1) {
                    premierNombre = nombre;
                }
                // Always assign to lastNumber (will be the last number read before -1)
                dernierNombre = nombre;
            } else {
                System.out.println("Veuillez entrer un nombre positif ou -1 pour terminer.");
            }
        }

        // Check and display the result according to the numbers entered
        if (premierNombre == -1) {
            System.out.println("La série est vide.");
        } else {
            if (premierNombre < dernierNombre) {
                System.out.println("Le premier est inférieur au dernier.");
            } else if (premierNombre == dernierNombre) {
                System.out.println("Le premier est égal au dernier.");
            } else {
                System.out.println("Le premier est supérieur au dernier.");
            }
        }
    }
}
