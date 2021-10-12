package github.kunwar45;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginWindow extends JFrame implements ActionListener {

    JButton btn;
    JLabel label;
    JPanel panel;
    JTextField textField;

    public LoginWindow(){
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
//        btn.setText("button");
//        btn.setSize(20, 40);
//        btn.setLocation(25, 150);
//        btn.setBackground(Color.GRAY);
//        btn.setActionCommand("UserManual");
//        add(btn);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        DoubleGameWindow myFrame = new DoubleGameWindow();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(600, 500); // set frame size
        myFrame.setVisible(true); // display frame
        this.dispose();
    }
}
