
package dev1.lab06;

/**
 * call method in main
 * @author Tirdea Ana-Maria
 */
public class Minimum {
   
    public static double min2(double x, double y) {
        double min = x;
        if (x > y ) {
            min = y;
        }

        return min;
    }

    public  static double min3(double x, double y, double z) {
        double min = min2(x, y);
        min = min2(min, z);
        return min;
    }

}
