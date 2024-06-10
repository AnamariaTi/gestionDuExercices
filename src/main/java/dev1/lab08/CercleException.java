package dev1.lab08;

/**
 * call method in main
 *
 * @author Tirdea Ana-Maria
 */
public class CercleException {

    /**
     * Calculates and returns the perimeter of a cricle of given radius
     *
     * @param rayon the radius of the circle
     * @return the perimeter of the circle with radius
     */
    public static double perimetre(double rayon) {
        if (rayon <= 0) {
            throw new IllegalArgumentException("Le rayon doit etre positif " + rayon);
        }
        return 2 * Math.PI * rayon;
    }

}
