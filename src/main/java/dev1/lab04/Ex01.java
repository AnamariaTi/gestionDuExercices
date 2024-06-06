
package dev1.lab04;

import java.util.Scanner;

/**
 * *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex01 {
     public static void main(String[] args) {
        Scanner nomber = new Scanner(System.in);
        System.out.println("Entrez un number : ");
        int n = nomber.nextInt();
        //nombers from 1 to n 
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println();

        //even numbers between 1 and n
        int y = 1;
        while (y <= n) {

            System.out.println(y + 1);
            y = y + 2;
        }
        System.out.println();

        //numbers from -n to n 
        for (int x = -n; x <= n; x++) {
            System.out.println(x);
        }
        
        System.out.println();
        //multiples of 5 between 1 and n 
        
      
        int z = 5; 
        while(z <= n ){
            System.out.println(z);
            z = z + 5 ; 
        }
        System.out.println();

        
        
        //multiples of n between 1 and 100
        for(int a = 1 ; a <= 100 ; a++){
          
            System.out.println(a*n);
        }
        
        
    }
}
