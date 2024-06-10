
package dev1.lab08;

import java.util.Scanner;

/**
* call method in main
 * @author Tirdea Ana-Maria
 */
public class Saisie {
 
    public static int saisieEntier(String message) {
        Scanner key = new Scanner(System.in);
        System.out.println(message);
        while (!key.hasNextInt()) {  ///if the input is not an integer 
            key.next();           //we don't do anything with it , we just wait for new entry 

            System.out.println("le nombre saisi n'est pas un entier ");
            System.out.println(message);
        }

        return key.nextInt();

    }
}
