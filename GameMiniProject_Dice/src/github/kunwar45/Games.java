package github.kunwar45;

import java.util.ArrayList;
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

    public static boolean rollDoubles(int[] dice1, int[] dice2){
        if (dice1[randomNumber.nextInt(6)] == dice2[randomNumber.nextInt(6)]){
            return true;
        }
        else {
            return false;
        }
    }

    public void higherLower(int[] dice){

        ArrayList<Integer> rolls = new ArrayList<Integer>();
        String guess;
        String truth;
        boolean keepPlaying;

        do {
            rolls.add(dice[randomNumber.nextInt(6)]);
            System.out.println("The dice roll was: " + rolls.get(rolls.size()-1));
            System.out.print("What is your guess for the next roll (Higher or Lower) (quit to stop playing)");
            guess = input.next();

            if (guess.equals("quit")) {
                keepPlaying = false;
                break;
            }
            else {
                keepPlaying = true;
            }

            rolls.add(dice[randomNumber.nextInt(6)]);

            if (rolls.get(rolls.size()-1) == rolls.get(rolls.size()-2)){
                truth = "lower";
            }
            else if (rolls.get(rolls.size()-1) > rolls.get(rolls.size()-2)){
                truth = "higher";
            }
            else if (rolls.get(rolls.size()-1) < rolls.get(rolls.size()-2)){
                truth = "lower";
            }
            else {
                truth = "nah";
            }

            if (truth.equals(guess)){

            }


        }
        while (keepPlaying);

    }
}
