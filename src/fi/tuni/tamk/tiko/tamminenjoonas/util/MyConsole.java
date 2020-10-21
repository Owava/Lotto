package fi.tuni.tamk.tiko.tamminenjoonas.util;

import java.io.Console;

/**
 * The class MyConsole contains of functions to read values from end user. 
 * 
 * Easier to use functions to read integers than java.io.Console. 
 * Possibility to read integers from between two values. 
 * 
 * @author Joonas Tamminen
 * 
 */
public class MyConsole {

    /**
     * Reads an integer from user
     * 
     * Continues asking input until an integer is give. 
     * @param errorMessage error message to be shown if non-numerical value is given
     * @return returns the integer user has given
     */

    public static int readInt(String errorMessage) {

        Console c = System.console();
        boolean notCorrect = true;

        int input = 0;

        while (notCorrect) {

            try {
                input = Integer.parseInt(c.readLine());
                notCorrect = false;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }

        return input;
    }

    /**
     * Reads integer from user, that is between two given values. 
     * 
     * Continues asking until user gives a correct value, that is between given min and max and is numerical. 
     * @param min minimum value wanted
     * @param max maximum value wanted
     * @param errorMessageNonNumeric error message if user gives non-numerical input
     * @param errorMessageNonMinAndMax error message if user gives integer input that isn't between min and max values
     * @return returns the integer user has given
     */

    public static int readInt(int min, int max, String errorMessageNonNumeric, String errorMessageNonMinAndMax) {

        boolean notCorrect = true;
        int input = 0;

        while (notCorrect) {
            input = readInt(errorMessageNonNumeric);

            if (input < min || input > max) {
                System.out.println(errorMessageNonMinAndMax);
            } else {
                notCorrect = false;
            }
        }

        return input;
    }

}
