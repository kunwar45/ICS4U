package github.kunwar45;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class HigherLowerWindow extends JFrame implements ActionListener {

    JButton btnHigher;
    JButton btnLower;
    JLabel lblInfo;
    JLabel lblFirst;
    JLabel lblSecond;
    JPanel panel;


    public static Random randomNumber = new Random();

    public HigherLowerWindow(){
        super("Roll Doubles");

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        lblInfo = new JLabel("In this Game you will guess if the next roll will be higher or lower than the previous roll");
        lblInfo.setBounds(100, 20, 400, 25);
        panel.add(lblInfo);

        lblFirst = new JLabel("First Roll: " + (String.valueOf(randomNumber.nextInt(6))));
        lblFirst.setBounds(10, 350, 150, 25);
        panel.add(lblFirst);

        lblSecond = new JLabel();
        lblSecond.setBounds(300, 350, 150, 25);
        panel.add(lblSecond);

        btnHigher = new JButton("Higher");
        btnHigher.setBounds(10, 400, 150, 25);
        btnHigher.setActionCommand("Higher");
        btnHigher.addActionListener(this);
        panel.add(btnHigher);

        btnLower = new JButton("Lower");
        btnLower.setBounds(300, 400, 150, 25);
        btnLower.setActionCommand("Lower");
        btnLower.addActionListener(this);
        panel.add(btnLower);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

//    public Boolean higherLower(){
//
//        ArrayList<Integer> rolls = new ArrayList<>();
//        String guess;
//        String truth;
//        boolean keepPlaying;
//
//        do {
//            rolls.add(randomNumber.nextInt(6));
//            System.out.println("The dice roll was: " + rolls.get(rolls.size()-1));
//            System.out.print("What is your guess for the next roll (Higher or Lower) (quit to stop playing)");
//            guess = "hi";
//
//            if (guess.equals("quit")) {
//                keepPlaying = false;
//                break;
//            }
//            else {
//                keepPlaying = true;
//            }
//
//            rolls.add(randomNumber.nextInt(6));
//
//            if (rolls.get(rolls.size()-1) == rolls.get(rolls.size()-2)){
//                truth = "lower";
//            }
//            else if (rolls.get(rolls.size()-1) > rolls.get(rolls.size()-2)){
//                truth = "higher";
//            }
//            else if (rolls.get(rolls.size()-1) < rolls.get(rolls.size()-2)){
//                truth = "lower";
//            }
//            else {
//                truth = "nah";
//            }
//
//            if (truth.equals(guess)){
//                return true;
//            }
//            else {
//                return false;
//            }
//
//
//        }
//        while (keepPlaying);
//
//    }
}
