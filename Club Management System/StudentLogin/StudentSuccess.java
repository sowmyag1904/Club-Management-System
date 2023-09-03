package StudentLogin;

import javax.swing.*;

import BF_maker.Button;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class StudentSuccess {
    public static void Student(String name) throws IOException {
        
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("CLUB ACTIVITY MANAGEMENT SYSTEM");

        frame.setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon("assets\\images\\bg.jpg");
        image.setImage(image.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(image));
        frame.setSize(screenSize.width, screenSize.height);
        // frame.setLayout(new FlowLayout());

        JButton Club1Button = Button.newb("SSN MUSIC CLUB", 35, screenSize.height / 4 - 100, 250, 100);
        JButton Club2Button = Button.newb("ARUDHRA", 385, screenSize.height / 4 - 100, 250, 100);
        JButton Club3Button = Button.newb("LIGHTS OUT PLEASE", 735, screenSize.height / 4 - 100, 250, 100);
        JButton Club4Button = Button.newb("N2K", 1085, screenSize.height / 4 - 100, 250, 100);
        JButton Club5Button = Button.newb("SAARAL", 35, screenSize.height / 4 + 100, 250, 100);
        JButton Club6Button = Button.newb("NSS", 385, screenSize.height / 4 + 100, 250, 100);
        JButton Club7Button = Button.newb("NSO", 735, screenSize.height / 4 + 100, 250, 100);
        JButton Club8Button = Button.newb("YRC", 1085, screenSize.height / 4 + 100, 250, 100);

        JButton notificationButton = new JButton("NOTIFICATIONS");
        notificationButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        notificationButton.setBackground(Color.WHITE);
        notificationButton.setBounds(385, screenSize.height / 4 + 300, 250, 100);
        notificationButton.setIcon(new ImageIcon());

        JButton registerButton = new JButton("REGISTERATIONS");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        registerButton.setBackground(Color.WHITE);
        registerButton.setBounds(735, screenSize.height / 4 + 300, 250, 100);
        registerButton.setIcon(new ImageIcon());

        frame.add(Club1Button);
        frame.add(Club2Button);
        frame.add(Club3Button);
        frame.add(Club4Button);
        frame.add(Club5Button);
        frame.add(Club6Button);
        frame.add(Club7Button);
        frame.add(Club8Button);
        frame.add(notificationButton);
        frame.add(registerButton);
        
        // add event listener for button click
        Club1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club1.main(new String[] {});
            }
        });

        Club2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club2.main(new String[] {});
            }
        });

        Club3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club3.main(new String[] {});
            }
        });

        Club4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club4.main(new String[] {});
            }
        });

        Club5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club5.main(new String[] {});
            }
        });

        Club6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club6.main(new String[] {});
            }
        });

        Club7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club7.main(new String[] {});
            }
        });

        Club8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Club8.main(new String[] {});
            }
        });

        notificationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GeneralNotification.main(new String[] {});
            }
        });

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    registerbtn.action(name);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        

        // make the frame visible
        frame.setVisible(true);
    }
}
