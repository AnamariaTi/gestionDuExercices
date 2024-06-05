
package  dev1.lab02;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex05 {
    
    public static void main(String[] args) {
  
       
        //ex 5 lab 2
        System.out.println("Exercice 05 lab 02");
        Scanner nomber = new Scanner(System.in); 
        System.out.println("Entrez un no entier ");
        int no1 =nomber.nextInt(); 
        System.out.println("Entre a 2eme no entier ");
        int no2 = nomber.nextInt(); 
        System.out.println("les valeur sont : ");
        System.out.println(" no1 + no2 =  " + (no1 + no2) );
        System.out.println("no1 - no2 =  "+ (no1 - no2) );
        System.out.println("no1  *  no2 = " + (no1* no2));
        System.out.println("no1 / no2 = "+ (no1/no2 ));
        System.out.println("no1 modulo no2 = " + (no1 % no2 ));
        System.out.println("no1 * no1 + no2 * no2 = " + (no1*no1+no2*no2));
        System.out.println();

    }
}
