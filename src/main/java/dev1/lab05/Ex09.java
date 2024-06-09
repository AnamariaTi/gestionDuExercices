
package dev1.lab05;

import java.util.Scanner;


/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex09 {
 /*
    asks the user for a sentence and displays whether the first letter
    letter is a capital letter and the last a period.
 */
    
    
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in); 
        System.out.println("eVeuillez entre une phrase : ");
        String phrase = key.nextLine(); 
        
        // Check that the sentence is not empty 
        if(phrase.isEmpty()){ // (phrase.length() > 0 ) is the same 
            System.out.println("Vous n'avez pas entre de phrase !");
        }else {
            //Check that the first letter is capitalized 
            boolean firstLettreUpperCase = Character.isUpperCase(phrase.charAt(0)); 
            //Check if the sentence ends with a period 
            boolean endsWithPeriod = phrase.endsWith("."); 
            
            
            if(firstLettreUpperCase && endsWithPeriod ){
                System.out.println("c'est une phrase. ");
            }else {
                System.out.println("ce n'est pas une phrase. ");
            }
            
            
            
        }
    }
   
}
