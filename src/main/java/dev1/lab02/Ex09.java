
package dev1.lab02;

import java.util.Scanner;

/**
 * *excercice teste en main
 * @author Tirdea Ana-Maria
 */
public class Ex09 {
 
    public static void main(String[] args) {
  
   

       //ex 9 lab 02 
        System.out.println("Exercie 9 lab 02 ");
        Scanner heure = new Scanner(System.in); 
        System.out.println("entre les numereo de heure :  ");
        int h = heure.nextInt(); 
        Scanner min = new Scanner(System.in); 
        System.out.println("entre les numero de minute :  ");
        int m = min.nextInt(); 
        Scanner sec = new Scanner(System.in);
        System.out.println("entre les numero de seconds :");
        int s = sec.nextInt(); 
        System.out.println("les heure en seconds sont : "+ ((h * 60) * 60));
        System.out.println("les minute en seconds sont : "+ (m*60));
        System.out.println("les total de seconds sont : " + (((h * 60) * 60)+(m*60)+s));
        System.out.println( );   
}
}