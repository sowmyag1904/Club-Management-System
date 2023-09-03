package StudentLogin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ClubNotification {
    public static void main(String[] args) {
        try {
            action("null");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void action(String name) throws IOException {
        // A JFrame is a window where we can design our UI
        JFrame frame = new JFrame("CLUB ACTIVITY MANAGEMENT SYSTEM");

        frame.setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon("assets\\images\\bg.jpg");
        image.setImage(image.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(image));
        frame.setSize(screenSize.width, screenSize.height);
        // frame.setLayout(new FlowLayout());

        frame.setBounds(100, 100, 450, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPane);

        JPanel panel = new JPanel();

        contentPane.add(panel);

        Box box = Box.createVerticalBox();

        JLabel lbl;

        Scanner sc = new Scanner(new File("assets\\" + name + ".txt"));
        while (sc.hasNextLine()) // returns a boolean value
        {
            String line = sc.nextLine();
            lbl = new JLabel(line);
            lbl.setVisible(true);
            box.add(lbl);
        }
        panel.add(box);
        

        // make the frame visible
        frame.setVisible(true);
    }
}