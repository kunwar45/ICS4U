package github.kunwar45;

import java.util.ArrayList;
import java.util.Random;

public class HigherLowerWindow {

    public static Random randomNumber = new Random();

    public void higherLower(int[] dice){

        ArrayList<Integer> rolls = new ArrayList<Integer>();
        String guess;
        String truth;
        boolean keepPlaying;

        do {
            rolls.add(dice[randomNumber.nextInt(6)]);
            System.out.println("The dice roll was: " + rolls.get(rolls.size()-1));
            System.out.print("What is your guess for the next roll (Higher or Lower) (quit to stop playing)");
            guess = "hi";
//            guess = input.next();

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
