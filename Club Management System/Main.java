import javax.swing.*;

import BF_maker.Button;
import BF_maker.Frame;

import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        // A JFrame is a window where we can design our UI
        JFrame frame = Frame.large("CLUB ACTIVITY MANAGEMENT SYSTEM",
                "assets\\images\\bg.jpg", 1400, 800);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // create a Button and a Label
        ImageIcon image1 = new ImageIcon("assets\\images\\login.jpg");
        image1.setImage(image1.getImage().getScaledInstance(860, 400,
                Image.SCALE_DEFAULT));
        JButton loginButton = Button.newb("", 400, screenSize.height / 2 - 150, 500, 267,
                image1);

        // add components to JFrame f
        frame.add(loginButton);

        // add event listener for button click
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Login.login();
            }
        });

        // make the frame visible
        frame.setVisible(true);
    }
}