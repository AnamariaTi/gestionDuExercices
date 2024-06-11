
package dev1.lab08;

import java.util.Scanner;

/**
* call method in main
 * @author Tirdea Ana-Maria
 */
public class Lecture {

    public static int lireEntier(String message) {
        Scanner key = new Scanner(System.in);
        System.out.println(message);
        while (!key.hasNextInt()) {
            key.next();
            throw new IllegalArgumentException("Le numero c'est pas un entier ");

        }
        return key.nextInt();
    }

    
    
    
}
