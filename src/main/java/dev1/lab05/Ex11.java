
package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex11 {
    public static void main(String[] args) {
        /*
         asks the user for a word and displays whether this word is a palindrome or not
        */
        
        Scanner key = new Scanner(System.in); 
        
        System.out.println("Veuilles entre un mot : ");
        String texte = key.nextLine(); 
        
        texte = texte.toLowerCase(); 
        
        
        boolean estPalindrome =  true ; 
        int longueur = texte.length(); 
        
        for(int i = 0 ; i < longueur /2 ; i++){
            if(texte.charAt(i) != texte.charAt(longueur-1-i )){
                estPalindrome = false ; 
                break ; 
            }
        }
        
        if(estPalindrome){
            System.out.println(texte + "est un palindrome ");
        }else{ 
            System.out.println(texte + "n'est pas un palindrome ");
        }
        
        
    }
}
