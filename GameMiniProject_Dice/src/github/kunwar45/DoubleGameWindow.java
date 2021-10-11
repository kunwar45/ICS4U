package github.kunwar45;

import java.util.Random;

public class DoubleGameWindow {

    public static Random randomNumber = new Random();

    public static boolean rollDoubles(int[] dice1, int[] dice2){
        if (dice1[randomNumber.nextInt(6)] == dice2[randomNumber.nextInt(6)]){
            return true;
        }
        else {
            return false;
        }
    }
}
