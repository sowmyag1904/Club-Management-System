package AdminLogin;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class AdminSuccess {
    public static void admin(String name) {
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("CLUB ACTIVITY MANAGEMENT SYSTEM");

        frame.setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon("assets\\images\\bg.jpg");
        image.setImage(image.getImage().getScaledInstance(1835, 1025, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(image));
        frame.setSize(screenSize.width, screenSize.height);
        // frame.setLayout(new FlowLayout());

        /*
         * JLabel head = new JLabel("ADMIN");
         * head.setForeground(Color.WHITE);
         * head.setFont(new Font("Tahoma", Font.BOLD, 50));
         * head.setVerticalTextPosition(JLabel.NORTH);
         * head.setVisible(true);
         * frame.add(head);
         */

        // put a admin heading as a button, try if possile as a JLabel
        JButton head = new JButton("ADMIN");
        head.setFont(new Font("Tahoma", Font.BOLD, 50));
        head.setBackground(Color.WHITE);
        head.setBounds(543, screenSize.height / 4 - 100, 250, 100);
        head.setIcon(new ImageIcon());

        // create a Button and a Label
        JButton notifyButton = new JButton("SEND NOTIFICATION");
        notifyButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        notifyButton.setBackground(Color.WHITE);

        // place and size for components
        // setBounds(x position, y position, width, height)
        notifyButton.setBounds(143, screenSize.height / 4 + 200, 250, 100);
        notifyButton.setIcon(new ImageIcon());

        // create a Button and a Label
        JButton addLoginButton = new JButton("ADD LOGIN");
        addLoginButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        addLoginButton.setBackground(Color.WHITE);

        // place and size for components
        // setBounds(x position, y position, width, height)
        addLoginButton.setBounds(543, screenSize.height / 4 + 200, 250, 100);
        addLoginButton.setIcon(new ImageIcon());

        // create a Button and a Label
        JButton studListButton = new JButton("STUDENT DETAILS");
        studListButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        studListButton.setBackground(Color.WHITE);

        // place and size for components
        // setBounds(x position, y position, width, height)
        studListButton.setBounds(943, screenSize.height / 4 + 200, 250, 100);
        studListButton.setIcon(new ImageIcon());

        // add components to JFrame f
        frame.add(head);
        frame.add(notifyButton);
        frame.add(addLoginButton);
        frame.add(studListButton);

        // add event listener for button click
        notifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Notify.main(new String[] {});
            }
        });

        addLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddLogin.main(new String[] {});
            }
        });

        studListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    StudentList.admin(name);
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        // make the frame visible
        frame.setVisible(true);
    }
}
