import javax.swing.border.EmptyBorder;

import AdminLogin.AdminSuccess;

import javax.swing.*;
import java.io.IOException;
import java.awt.event.*;
import java.awt.*;
import StudentLogin.StudentSuccess;

import BF_maker.Frame;

public class Login extends JFrame {

        private static JPanel contentPane;
        private static JTextField textField;
        private static JPasswordField passwordField;

        public static void login() {
                JFrame frame = Frame.small("");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                frame.setContentPane(contentPane);

                JLabel lblAdminLoginForm = new JLabel("Login Form");
                lblAdminLoginForm.setForeground(Color.GRAY);
                lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));

                Box box = Box.createVerticalBox();

                JLabel lblEnterName = new JLabel("Enter Name:");
                lblEnterName.setVisible(true);
                lblEnterName.setAlignmentX(JLabel.CENTER_ALIGNMENT);
                box.add(lblEnterName);

                textField = new JTextField();
                textField.setColumns(10);
                textField.setAlignmentX(JTextField.CENTER_ALIGNMENT);
                box.add(textField);

                box.add(Box.createRigidArea(new Dimension(5, 5)));

                JLabel lblEnterPassword = new JLabel("Enter Password:");
                lblEnterPassword.setVisible(true);
                lblEnterPassword.setAlignmentX(JLabel.CENTER_ALIGNMENT);
                box.add(lblEnterPassword);

                passwordField = new JPasswordField();
                passwordField.setColumns(10);
                passwordField.setAlignmentX(JTextField.CENTER_ALIGNMENT);
                box.add(passwordField);

                box.add(Box.createRigidArea(new Dimension(10, 15)));

                JButton btnLogin = new JButton("Login");
                btnLogin.setAlignmentX(JButton.CENTER_ALIGNMENT);
                box.add(btnLogin);

                btnLogin.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String name = textField.getText();
                                String password = String.valueOf(passwordField.getPassword());
                                System.out.println(name + " " + password);

                                if (account.validate(name, password) == 1) {
                                        AdminSuccess.admin(name);
                                        frame.dispose();
                                } 
                                else if (account.validate(name, password) == 2) {
                                        try {
                                                StudentSuccess.Student(name);
                                        } catch (IOException e1) {
                                                e1.printStackTrace();
                                        }
                                        frame.dispose();
                                } else {
                                        JOptionPane.showMessageDialog(frame, "Sorry, Username or Password Error",
                                                        "Login Error!", JOptionPane.ERROR_MESSAGE);
                                        textField.setText("");
                                        passwordField.setText("");
                                }
                        }
                });
                contentPane.add(box);
        }
}
