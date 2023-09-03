package StudentLogin;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

public class GeneralNotification extends JFrame {
    static GeneralNotification frame;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new GeneralNotification();
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setSize(screenSize.width / 3, screenSize.height / 3);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * 
     * @throws FileNotFoundException
     */
    public GeneralNotification() throws FileNotFoundException {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        Box box = Box.createVerticalBox();

        JLabel lbl1;

        Scanner sc = new Scanner(new File("assets\\gen.txt"));
        while (sc.hasNextLine()) // returns a boolean value
        {
            String line = sc.nextLine();
            lbl1 = new JLabel(line);
            // put next notif in next line - how?
            lbl1.setVisible(true);
            box.add(lbl1);
        }
        box.add(Box.createRigidArea(new Dimension(100, 100)));
        contentPane.add(box);

    }
}
