
package dev1.lab06;

/**
 * call method in main 
 * @author Tirdea Ana-Maria
 */
public class Maximum {

    public static int max2(int a, int b) {
        int max = a;
        if (a < b) {
            max = b;
        }
        return max;
    }

    public static int max3(int a, int b, int c) {
        int max = max2(a, b);
        max = max2(max, c);
        return max;
    }

}
