package AdminLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Notify extends JFrame {
    static Notify frame;
    private JPanel contentPane;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Notify();
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
     */
    public Notify() {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAdminLoginForm = new JLabel("Send Notification");
        lblAdminLoginForm.setForeground(Color.GRAY);
        lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));
        JPanel panel = new JPanel();

        contentPane.add(panel);

        Box box = Box.createVerticalBox();

        JLabel lbl1 = new JLabel("Select options: ");
        lbl1.setVisible(true);
        lbl1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl1);

        // panel.add(lbl1);

        String[] choices = { "SEND TO ALL STUDENTS", "SMC", "ARUDHRA", "LOP", "N2K", "SAARAL", "NSS", "NSO", "YRC" };

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        cb.setAlignmentX(JComboBox.CENTER_ALIGNMENT);
        box.add(cb);
        // panel.add(cb);

        box.add(Box.createRigidArea(new Dimension(5, 5)));

        panel.add(box);

        Box box1 = Box.createVerticalBox();

        JLabel lbl = new JLabel("Enter message: ");
        lbl.setVisible(true);
        lbl.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box1.add(lbl);
        // contentPane.add(lbl);

        textField = new JTextField();
        textField.setColumns(20);
        textField.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        box1.add(textField);

        // contentPane.add(textField);

        box1.add(Box.createRigidArea(new Dimension(10, 15)));

        JButton btn = new JButton("SEND");
        btn.setAlignmentX(JButton.CENTER_ALIGNMENT);
        box1.add(btn);

        panel.add(box1);

        btn.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                int option = cb.getSelectedIndex();
                String filename;
                if (option == 0)
                    filename = "assets\\gen.txt";
                else{
                    filename = "assets\\" + cb.getSelectedItem() + ".txt";
                    System.out.println(filename);
                }
                try (FileWriter fw = new FileWriter(filename, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw)) {
                    out.println("\n==============================");
                    out.println(textField.getText());
                    out.println("==============================\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    frame.dispose();
                }
            }
        });

    }
}
