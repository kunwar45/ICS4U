package github.kunwar45;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Window extends JFrame{

    JButton btn;
    JFrame frame;
    JLabel label;

    public Window(){
        super("Casino");
        label = new JLabel("label", SwingConstants.CENTER);

        add(label);
        btn = new JButton();

        btn.setText("button");
        btn.setSize(20, 40);
        btn.setLocation(25, 150);
        btn.setBackground(Color.GRAY);
        btn.setActionCommand("UserManual");


        add(btn);
    }

}
