package StudentLogin;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class registerbtn {
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

        JLabel lblAdminLoginForm = new JLabel("Student Club Register Form");
        lblAdminLoginForm.setForeground(Color.GRAY);
        lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
        JPanel panel = new JPanel();

        contentPane.add(panel);

        Box box = Box.createVerticalBox();

        JLabel lbl1 = new JLabel("Select options: ");
        lbl1.setVisible(true);
        lbl1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl1);

        String[] choices = { "SMC", "ARUDHRA", "LOP", "N2K", "SAARAL", "NSS", "NSO", "YRC" };

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        cb.setAlignmentX(JComboBox.CENTER_ALIGNMENT);
        box.add(cb);

        box.add(Box.createRigidArea(new Dimension(50, 50)));

        JButton btn = new JButton("REGISTER/UNREGISTER");
        btn.setAlignmentX(JButton.CENTER_ALIGNMENT);
        box.add(btn);

        JLabel lbl = new JLabel("Registration status");
        lbl.setVisible(true);
        lbl.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl);

        panel.add(box);

        btn.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {

                int option = cb.getSelectedIndex();
                try {
                    if (registration.status(option + 1, name) == 1) {
                        registration.unregister(option + 1, name);
                        lbl.setText("Registration status: Unregistered");

                    } else {
                        registration.register(option + 1, name);
                        lbl.setText("Registration status: Registered");
                    }

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
