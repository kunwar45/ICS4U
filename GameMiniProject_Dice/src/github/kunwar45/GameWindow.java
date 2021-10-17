package github.kunwar45;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameWindow extends JFrame implements ActionListener {

    JLabel lblInfo;
    JLabel lblDealerCards;
    JLabel lblYourCards;

    JButton btnBegin;
    JButton btnPeak;
    JButton btnHit;
    JButton btnStand;

    JPanel pnlInitial;
    JPanel pnlGame;
    JPanel pnlPeak;

    Player player = LoginWindow.player;
    public static Random randomNumber = new Random();
    public static DeckOfCards deck = new DeckOfCards();



    public GameWindow(){
        super("Black Jack");

        initialPanel().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "Begin":
                initialPanel().setVisible(false);
                gamePanel().setVisible(true);
                break;
            case "Peak":
                gamePanel().setVisible(false);
                peakPanel().setVisible(true);
                break;
        }
    }

    public JPanel initialPanel(){
        pnlInitial = new JPanel();
        pnlInitial.setLayout(null);
        add(pnlInitial);


        lblInfo = new JLabel("Okay, " + player.getUsername() + "  you will be playing black jack, and you have \n" +player.getCurrentValue() + " 'begin' to start the game");
        lblInfo.setBounds(100, 20, 400, 50);
        pnlInitial.add(lblInfo);

        btnBegin = new JButton("Begin");
        btnBegin.setBounds(250, 237 , 100, 25);
        btnBegin.setActionCommand("Begin");
        btnBegin.addActionListener(this);
        pnlInitial.add(btnBegin);

        return pnlInitial;
    }

    public JPanel gamePanel(){
        pnlGame = new JPanel();
        pnlGame.setLayout(null);
        add(pnlGame);

        lblDealerCards = new JLabel("The dealers cards are: ");
        lblDealerCards.setBounds(10, 30, 100, 50);
        pnlGame.add(lblDealerCards);

        lblYourCards = new JLabel("Your cards are: ");
        lblYourCards.setBounds(300, 30, 100, 50);
        pnlGame.add(lblYourCards);

        btnHit = new JButton("Hit");
        btnHit.setBounds(10, 237 , 100, 25);
        btnHit.setActionCommand("Hit");
        btnHit.addActionListener(this);
        pnlGame.add(btnHit);

        btnStand = new JButton("Stand");
        btnStand.setBounds(150, 237 , 100, 25);
        btnStand.setActionCommand("Stand");
        btnStand.addActionListener(this);
        pnlGame.add(btnStand);

        btnPeak = new JButton("Peak");
        btnPeak.setBounds(400, 237 , 100, 25);
        btnPeak.setActionCommand("Peak");
        btnPeak.addActionListener(this);
        pnlGame.add(btnPeak);

        return pnlGame;
    }

    public JPanel peakPanel(){

        pnlPeak = new JPanel();
        pnlPeak.setLayout(null);
        add(pnlPeak);

        return pnlPeak;
    }

    public boolean isWon(){
        return true;
    }

}
