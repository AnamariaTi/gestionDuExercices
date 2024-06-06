
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une série de nombres positifs (terminez par -1):");

        int premier = -1;
        int dernier = -1;
        int nombre;

        // Input loop until -1 is entered
        while ((nombre = scanner.nextInt()) != -1) {
            if (premier == -1) {
                //If it's the first number, we record it
                premier = nombre;
            }
            // At each iteration, the last number is updated
            dernier = nombre;
        }

        if (premier != -1) {
            System.out.println("premier : " + premier);
            System.out.println("dernier : " + dernier);
        } else {
            System.out.println("Aucun nombre valide n'a été saisi.");
        }
    
    }
}
