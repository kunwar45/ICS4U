package github.kunwar45;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public static Random randomNumber = new Random();
    public static Scanner input = new Scanner(System.in);

    public static boolean sumGame(int[] dice, int[] dice2){
        int sum =  dice[randomNumber.nextInt(6)] + dice2[randomNumber.nextInt(6)];
        System.out.println("Enter guess: ");
        int guess = input.nextInt();

        if (guess == sum){
            return true;
        }
        else {
            return false;
        }


    }

}
