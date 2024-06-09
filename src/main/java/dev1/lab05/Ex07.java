package dev1.lab05;

import java.util.Scanner;

/**
 * *exercises tested in main
 * @author Tirdea Ana-Maria
 */
public class Ex07 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        String texte1 = "Bonjour";
        String texte2 = "Bonjour";
        String texte3 = "Bon ";
        String texte4 = "jour ";
        String texte5 = texte3 + texte4;
        String texte6 = clavier.nextLine(); //Enter  "Bonjour" for the experience 

        System.out.println(texte1 == texte2);// true c, because we're just comparing the text 
        System.out.println(texte1 + "==" + texte2 + "?" + texte1 == texte2);   //put direct false because it compares direct with == and ? 
        System.out.println(texte1 + "==" + texte5 + "?" + (texte1 == texte5));  //false 
        System.out.println(texte1 + "==" + texte6 + "?" + (texte1 == texte6));  // false 
        System.out.println(texte1 + "equals" + texte2 + "? " + texte1.equals(texte2)); // true 
        System.out.println(texte1 + "equals" + texte5 + "? " + texte1.equals(texte5)); // true 
        System.out.println(texte1 + "equals" + texte6 + "? " + texte1.equals(texte6)); // true     

    }
}
