package BF_maker;

import javax.swing.*;
import java.awt.*;

public class Button {
    public static JButton newb(String text, int x, int y, int w, int h) {
        JButton Button = new JButton(text);
        Button.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Button.setBackground(Color.WHITE);
        Button.setBounds(x, y, w, h);
        Button.setIcon(new ImageIcon());
        return Button;
    }

    public static JButton newb(String text, int x, int y, int w, int h, ImageIcon i) {
        JButton Button = new JButton(text);
        Button.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Button.setBackground(Color.WHITE);
        Button.setBounds(x, y, w, h);
        Button.setIcon(i);
        return Button;
    }

    public static JButton newb(String text, int x, int y, int w, int h, String bg_path) {
        JButton Button = new JButton(text);
        Button.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Button.setBackground(Color.WHITE);
        Button.setBounds(x, y, w, h);
        Button.setIcon(new ImageIcon(bg_path));
        return Button;
    }
}
