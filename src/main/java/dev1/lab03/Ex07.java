
package dev1.lab03;

import java.util.Scanner;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex07 {
    
        public static void main(String[] args) {
        Scanner cote1 = new Scanner(System.in);
        Scanner cote2 = new Scanner(System.in);
        Scanner cote3 = new Scanner(System.in);
        System.out.println("entre la longuer des 1er  cote du triangle");
        double a = cote1.nextDouble();
        System.out.println("entre la longuer des 2eme  cote du triangle");
        double b = cote2.nextDouble();
        System.out.println("entre la longuer des 3eme cote du triangle");
        double c = cote3.nextDouble();
        
        if(a == b && a == c ){
            System.out.println("triangle equilateral ");
        }else if(a == b || a == c || b == c ){
            System.out.println("triangle isocele ");
        }else {
            System.out.println("triangle quelconque ");
        }
    }
    
}
