package github.kunwar45;

import javax.swing.*;


public class Main {

    public static int[] dice1 = {1, 2, 3, 4, 5, 6};
    public static int[] dice2 = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {


	    LoginWindow myFrame = new LoginWindow();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame



    }
}
