
package dev1.lab06;

/**
* call method in main
 * @author Tirdea Ana-Maria
 */
public class MathUtil {
 
    public static boolean estDivisble(int a, int b) {
        return a % b == 0;
    }

    public static int abs(int number) {
        return Math.abs(number);

    }

    public static int unite(int nb) {
        return nb % 10;
    }

    public static int dizaine(int nb) {
        return (nb / 10) % 10;

    }

    public static int centaine(int nb) {
        return (nb / 100) % 10;
    }

    
   public static int miroir(int nb){
       int unit = unite(nb); 
       int ten = dizaine(nb); 
       int hundred = centaine(nb); 
       
       return unit*100 +ten *10 + hundred; 
       
   }
    
    
}
