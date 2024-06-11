
package dev1.lab08;

import java.util.Scanner;

/**
* call method in main
 * @author Tirdea Ana-Maria
 */
public class Lecture {
    
    private static Scanner key = new Scanner(System.in); 

    public static int lireEntier(String message) {
        Scanner key = new Scanner(System.in);
        System.out.println(message);
        while (!key.hasNextInt()) {
            key.next();
            throw new IllegalArgumentException("Le numero c'est pas un entier ");

        }
        return key.nextInt();
    }
    
    
    /*in another way to do the exercise 
    public static int lireEntier(String message){
     while(true){
        try{
      System.out.println(message);
            }catch(NumberFormatException e){
      System.out.println("Veuillez entrer un entier valide"); 
             }
         }
    
    }
    */
    
    
    public static double lireDouble(String message){
        while(true){
            try{
                System.out.println(message );
                return Double.parseDouble(key.nextLine()); 
            }catch(NumberFormatException e){
                System.out.println("veuillez entre un nomber decimal valide ");
            }
        }
    }
    
    
    
    public static int lireEntier(String message , int min , int max ){
        while(true){
            int value = lireEntier(message); 
            if(value >= min && value <= max){
                return value ; 
            }else{
                System.out.println("Veuillez entre un entier entre "+ min + " et "+ max);
            }
        }
    }
    
    
    
    
}
