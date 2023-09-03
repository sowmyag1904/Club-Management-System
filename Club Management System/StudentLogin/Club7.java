package StudentLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Club7 {
    public static <ActionEvent> void main(String[] args) {
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("CLUB ACTIVITY MANAGEMENT SYSTEM");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon("assets\\images\\bg.jpg");
        image.setImage(image.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(image));
        frame.setSize(screenSize.width, screenSize.height);
        frame.setLayout(new FlowLayout());

        Box box = Box.createVerticalBox();
        JLabel head = new JLabel("NSO");
        head.setFont(new Font("Tahoma", Font.BOLD, 40));
        // head.setHorizontalAlignment(JLabel.TOP);
        box.add(head);
        box.add(Box.createRigidArea(new Dimension(10, 20)));
        JLabel desc = new JLabel("NSO - National Sports Organization");
        desc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        box.add(desc);

        box.add(Box.createRigidArea(new Dimension(10, 50)));
        JButton notificationButton = new JButton("NOTIFICATIONS");
        notificationButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        notificationButton.setBackground(Color.WHITE);

        // place and size for components
        // setBounds(x position, y position, width, height)
        notificationButton.setBounds(1000, screenSize.height / 4 + 100, 400, 200);
        notificationButton.setPreferredSize(new Dimension(900, 200));
        box.add(notificationButton);

        frame.add(box);

        notificationButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    ClubNotification.action("NSO");
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        frame.setVisible(true);

    }
}
