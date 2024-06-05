
package dev1.lab02;

import java.util.Scanner;

/**
 *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex07 {
 
    public static void main(String[] args) {
  


        //ex  7 lab 2 
        System.out.println("Exercie 07 lab 02 ");
        Scanner mirror = new Scanner(System.in);
        System.out.println("entre un numero du 100 et 999 : ");
        int  cifre = mirror.nextInt(); 
        if(cifre > 99 &&  cifre < 1000 ){
            System.out.println(cifre %10);
            System.out.println((cifre/10)%10 );
            System.out.println((cifre/100)%10 );
        }else{
            System.out.println("les chifre c'est pas entre 100 et 999 ");
        }
        System.out.println( );
           
}
}