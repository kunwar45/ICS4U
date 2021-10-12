package github.kunwar45;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DoubleGameWindow extends JFrame implements ActionListener {

    public static Random randomNumber = new Random();

    JButton btnDice1;
    JButton btnDice2;
    JLabel lblInfo;
    JLabel lblDice1;
    JLabel lblDice2;
    JPanel panel;
    JTextField textField;
    int roll1;
    int roll2;

    public DoubleGameWindow(){
        super("Roll Doubles");

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        lblInfo = new JLabel("In this Game you will try to roll doubles, click the buttons to begin!");
        lblInfo.setBounds(150, 20, 300, 25);
        panel.add(lblInfo);

        btnDice1 = new JButton("Roll Dice 1");
        btnDice1.setBounds(10, 400, 150, 25);
        btnDice1.setActionCommand("Dice1");
        btnDice1.addActionListener(this);
        panel.add(btnDice1);


        lblDice1 = new JLabel();
        lblDice1.setBounds(10, 350, 150, 25);
        panel.add(lblDice1);

        btnDice2 = new JButton("Roll Dice 2");
        btnDice2.setBounds(300, 400, 150, 25);
        btnDice2.setActionCommand("Dice2");
        btnDice2.addActionListener(this);
        panel.add(btnDice2);


        lblDice2 = new JLabel();
        lblDice2.setBounds(300, 350, 150, 25);
        panel.add(lblDice2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Dice1":
                roll1 = randomNumber.nextInt(6);
                lblDice1.setText(String.valueOf(roll1));
                break;
            case "Dice2":
                roll2 = randomNumber.nextInt(6);
                lblDice2.setText(String.valueOf(roll2));
                break;
        }
    }

    public static boolean rollDoubles(int dice1, int dice2){
        if (dice1 == dice2){
            return true;
        }
        else {
            return false;
        }
    }
}
