package AdminLogin;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.*;

public class StudentList {
    public static void admin(String name) throws FileNotFoundException {
        // A JFrame is a window where we can design our UI
        JPanel contentPane = new JPanel();
        JFrame frame = new JFrame("CLUB ACTIVITY MANAGEMENT SYSTEM");

        frame.setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setContentPane(contentPane);
        frame.setSize(screenSize.width / 3, screenSize.height / 3);
        // frame.setLayout(new FlowLayout());

        Box box = Box.createVerticalBox();
        JLabel lbl1;

        Scanner sc = new Scanner(new File("assets\\stud_details.csv"));
        String head = sc.nextLine();
        String[] head_arr = head.split(",");
        lbl1 = new JLabel(head_arr[0] + "              " + head_arr[1]);
        lbl1.setVisible(true);
        box.add(lbl1);
        int no = 0;
        for (int i = 2; i < 10; i++) {
            if (head_arr[i].equals(" " + name))
                no = i;
        }

        while (sc.hasNextLine()) // returns a boolean value
        {
            String line = sc.nextLine();
            String[] line_arr = line.split(",");
            if (line_arr[no].equals(" Yes")) {
                lbl1 = new JLabel(line_arr[0] + "                   " + line_arr[1]);
                lbl1.setVisible(true);
                box.add(lbl1);
            }
        }
        box.add(Box.createRigidArea(new Dimension(100, 100)));
        contentPane.add(box);

        // make the frame visible
        frame.setVisible(true);
    }
}
