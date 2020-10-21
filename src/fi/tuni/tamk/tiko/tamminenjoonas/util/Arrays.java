package fi.tuni.tamk.tiko.tamminenjoonas.util;

/**
 * The class Arrays contains functions that handle arrays.
 * 
 * @author Joonas Tamminen
 * 
 */
public class Arrays {

    /**
     * Turns a String array to an int array. 
     * 
     * Can only be used if the String array contains only numbers. Does not check if there is only numerical values in the 
     * String array. 
     * 
     * @param array String array to be turned to int array. 
     * @return int array containing same values as given String array. 
     */

    public static int[] toIntArray(String[] array) {
        int[] intArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        return intArray;
    }
    /**
     * Checks if an array contains a given value. 
     * 
     * 
     * @param value an integer to be checked
     * @param array the array that is being checked
     * @return true if array contains the value, false if it doesn't
     */
    public static boolean contains(int value, int[] array) {

        boolean found = false;

        for (int i = 0; i < array.length && !found; i++) {
            if (array[i] == value) {
                found = true;
            }
        }
        return found;
    }
    /**
     * Checks how many same values two arrays contain. 
     * 
     * Assumes that either array1 is longer than array2 or that they are of same length. 
     * 
     * @param array1 first array to be checked
     * @param array2 second array to be checked
     * @return amount of same values in the two arrays
     */
    public static int containsSameValues(int[] array1, int[] array2) {
        int same = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    same++;
                }
            }
        }
        return same;
    }
}
