package fi.tuni.tamk.tiko.tamminenjoonas;

import fi.tuni.tamk.tiko.tamminenjoonas.util.*;

/**
 * Main class of the Lotto app.
 * 
 * App that asks lottery numbers from user, and tells how long it will take to win in Finnish Lotto. 
 * Tells user how long it took to get different amount of numbers right. 
 * 
 * @author Joonas Tamminen
 */

public class Main {

    public static final int MIN = 1;
    public static final int MAX = 40;
    public static final String ERRORNUM = "Please give a number.";
    public static final String ERRORMINMAX = "Please give unique number between 1 and 40";

    public static void main(String[] args) {
        
        int[] userLotto = new int[7];
        int weeks = 1;
        int years = 0;
        int best = 0;

        boolean wonLotto = false;

        for(int i = 0; i < userLotto.length; i++) {

            System.out.println("Please give unique number between 1 and 40");

            int input = MyConsole.readInt(MIN, MAX, ERRORNUM, ERRORMINMAX);

            if(Arrays.contains(input, userLotto)) {
                i--;
                System.out.println("Not unique numbers!");
            } else {
                userLotto[i] = input;
            }
        }

        while(!wonLotto) {

            int[] randomLotto = calculateLotto();

            int right = Arrays.containsSameValues(randomLotto, userLotto);

            if(right > best) {
                best = right;
                if(weeks < 52) {
                    System.out.println("Got " + right + " right! Took " + weeks + " week(s)");
                } else {
                    years = weeks / 52;
                    int weeksLeft = weeks % 52;
                    System.out.println("Got " + right + " right! Took " + years + " year(s) and " + weeksLeft + " week(s)");
                }
            }
            if (right == 7) {
                wonLotto = true;
                System.out.println("You won!");
            }

            weeks++;
        }
    }

    /**
     * Calculates random lotto numbers
     * 
     * 7 random numbers between 1 and 40 are put in a random lotto array.
     * @return returns random lotto numbers in an array. 
     */

    private static int[] calculateLotto() {

        int[] aiLotto = new int[7];

        for(int i = 0; i < aiLotto.length; i++) {
            int number = fi.tuni.tamk.tiko.tamminenjoonas.util.Math.getRandom(1, 40);

            if(Arrays.contains(number, aiLotto)) {
                i--;
            } else {
                aiLotto[i] = number;
            }
        }

        return aiLotto;
    }

}
