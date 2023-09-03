package AdminLogin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.*;

public class AddLogin extends JFrame {
    static AddLogin frame;
    private JPanel contentPane;
    private JTextField textField, textField1, passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AddLogin();
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
    public AddLogin() {
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        Box box = Box.createVerticalBox();

        JLabel lbl = new JLabel("Enter username:");
        lbl.setVisible(true);
        lbl.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl);
        textField = new JTextField();
        textField.setColumns(10);
        textField.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        box.add(textField);

        box.add(Box.createRigidArea(new Dimension(5, 5)));

        JLabel lbl2 = new JLabel("Enter department: ");
        lbl2.setVisible(true);
        lbl2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl2);
        textField1 = new JTextField();
        textField1.setColumns(10);
        textField1.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        box.add(textField1);

        box.add(Box.createRigidArea(new Dimension(5, 5)));

        JLabel lbl1 = new JLabel("Enter password:");
        lbl1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        box.add(lbl1);
        lbl1.setVisible(true);
        passwordField = new JPasswordField();
        passwordField.setColumns(10);
        passwordField.setAlignmentX(JPasswordField.CENTER_ALIGNMENT);
        box.add(passwordField);

        box.add(Box.createRigidArea(new Dimension(10, 15)));
        JButton btn = new JButton("CREATE");
        btn.setAlignmentX(JButton.CENTER_ALIGNMENT);
        box.add(btn);

        contentPane.add(box);

        btn.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                try (FileWriter fw = new FileWriter("assets\\username_pwd_stu.csv", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw)) {
                    String st=textField.getText();
                    st=st+",";
                    st=st+passwordField.getText();
                    out.println(st);
                    frame.dispose();
                } catch (IOException e1) {
                    // exception handling left as an exercise for the reader
                }
                try (FileWriter f = new FileWriter("assets\\stud_details.csv", true);
                        BufferedWriter b = new BufferedWriter(f);
                        PrintWriter o = new PrintWriter(b)) {
                    o.println(textField.getText() + ", " + textField1.getText() + ", "
                            + "No, No, No, No, No, No, No, No");
                    frame.dispose();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

        });

    }
}
