package github.kunwar45;

import java.util.Random;

public class SumGameWindow {

    public static Random randomNumber = new Random();
    static int guess;

    public static boolean sumGame(int[] dice, int[] dice2){
        int sum =  dice[randomNumber.nextInt(6)] + dice2[randomNumber.nextInt(6)];
        System.out.println("Enter guess: ");
        guess = 4;
//        int guess = input.nextInt();

        if (guess == sum){
            return true;
        }
        else {
            return false;
        }


    }
}
