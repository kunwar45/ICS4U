package github.kunwar45;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SumGameWindow extends JFrame implements ActionListener {

    public static Random randomNumber = new Random();
    static int guess;

    JButton btn;
    JLabel label;
    JPanel panel;
    JTextField textField;

    public SumGameWindow(){
        super("Casino");

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        label = new JLabel("Enter Your Username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        textField = new JTextField(20);
        textField.setBounds(100, 20, 165, 25);
        panel.add(textField);

        btn = new JButton("Login");
        btn.setBounds(10, 80, 80, 25);
        btn.addActionListener(this);
        panel.add(btn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DoubleGameWindow myFrame = new DoubleGameWindow();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame
        this.dispose();
    }

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
