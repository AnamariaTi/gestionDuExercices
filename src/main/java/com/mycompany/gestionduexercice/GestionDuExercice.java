package com.mycompany.gestionduexercice;

import dev1.lab06.Cercle;
import dev1.lab06.Maximum; 

import java.util.Scanner;

/**
 *
 * @author Tirdea Ana-Maria
 */
public class GestionDuExercice {

    public static void main(String[] args) {
        
        //dev01.lab06.Cercle
        System.out.println("le périmetre d'un cercle de rayon : " + Cercle.perimetre(10));
        System.out.println("le aire d'un cercle de rayon : "+ Cercle.aireCercle(5));
       
        
        //dev01.lab06.Maximum 
        System.out.println(Maximum.max2(10,6));
        System.out.println(Maximum.max3(10, 6, 19));
    }

}
