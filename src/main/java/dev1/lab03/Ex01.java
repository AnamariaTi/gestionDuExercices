
package dev1.lab03;

import java.util.Scanner;

/**
  *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in); 
        System.out.println("Entre votre age ");
        int ages = age.nextInt() ; 
        if(ages > 17){
            System.out.println("Vous êtes majour ");
            
        }else if( ages > 0 && ages < 18 ){
             System.out.println("Vous êtes mineur ");
        }else {
            System.out.println(" votre age c'est pas correct  ");
        }
    }
}
