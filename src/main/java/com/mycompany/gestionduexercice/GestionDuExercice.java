package com.mycompany.gestionduexercice;

import dev1.lab06.Cercle;
import dev1.lab06.Maximum;
import dev1.lab06.Minimum; 
import dev1.lab06.Moyenne; 
import dev1.lab06.Mot; 
import dev1.lab06.ChaineUtil; 
import dev1.lab06.Pair;
import dev1.lab06.MathUtil;
import dev1.lab06.Ligne; 



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
        System.out.println("le max du 2 numero : "+ Maximum.max2(10,6));
        System.out.println("le max du 3 numero : "+ Maximum.max3(10, 6, 19));
        
        
        //dev01.lab06.Minimum
        System.out.println("le min du 2 numero : "+ Minimum.min2(10, 6));
        System.out.println("le min du 3 numero : "+Minimum.min3(10, 6, 19));
        
        //dev01.lab06.Moyenne 
        System.out.println("le moyenne de 2 numero : "+ Moyenne.moyenne(10.5, 15.5));
        
        
        //dev01.lab06.Mot 
        System.out.println("le 1er lettre du mots c'est :" + Mot.premiéreLettre("Java"));
        System.out.println("le 1er lettre du mots c'est :" + Mot.premiéreLettre("programmation"));
        
        //dev01.lab06.ChaineUtil
        System.out.println("le 1er lettre du mots c'est : "+ ChaineUtil.premiereLettre("Dev"));
        System.out.println("le dernier lettre du mots c'est : " + ChaineUtil.dernierLettre("Dev"));
        
        
        //dev01.lab06.Pair
       
        if(Pair.estPair(10)){
            System.out.println("10 est pair ");
        }else{
            System.out.println("10 est impair ");
        }
        
        
        // dev01.lab06.MathUtil
        if(MathUtil.estDivisble(10, 5)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println("la valeur absolue de -4 est : "+ MathUtil.abs(-4));
        
        //dev01.lab06.Ligne
        
        Ligne.afficherLigne(10);
        Ligne.afficherLigne(20);
    }

}
