package fi.tuni.tamk.tiko.tamminenjoonas.util;

/**
 * The class Math contains some mathematical functions. 
 * 
 * 
 * @author Joonas Tamminen
 * 
 */

public class Math {

    /**
     * Returns a number between two given numbers.
     * 
     * @param min the minimum number the random number can be
     * @param max the maximum number the random number can be
     * @return a random integer between min and max
     */

    public static int getRandom(int min, int max) {
        return min + (int) (java.lang.Math.random() * ((max - min) + 1));
    }
    
}
