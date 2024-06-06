
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex08 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une série de nombres positifs (terminez par -1):");

        int max = -1; //Set maximum to a value that is not possible for numbers entered
        int nombre;
        
        //Input loop until -1 is entered
        do {
            nombre = scanner.nextInt();
            if (nombre != -1 && nombre > max) {
                max = nombre;
            }
        } while (nombre != -1);

        if (max != -1) {

            System.out.println("maximu " + max);
        } else {
            System.out.println("aucun nombre valide n'a été saisi ");
            ;
        }


    
    }
}
