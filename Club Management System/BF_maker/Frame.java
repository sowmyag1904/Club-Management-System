package BF_maker;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static JFrame large(String text, String bg_path, int x, int y) {
        JFrame f = new JFrame(text);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon(bg_path);
        image.setImage(image.getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        f.setContentPane(new JLabel(image));
        f.setSize(screenSize.width, screenSize.height);
        return f;
    }

    public static JFrame small(String text, String bg_path) {
        JFrame f = new JFrame(text);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon image = new ImageIcon(bg_path);
        image.setImage(image.getImage().getScaledInstance(1535, 825,
                Image.SCALE_DEFAULT));
        f.setContentPane(new JLabel(image));
        f.setSize(screenSize.width, screenSize.height);
        return f;
    }

    public static JFrame small(String text) {
        JFrame f = new JFrame(text);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        f.setSize(screenSize.width / 3, screenSize.height / 3);
        f.setBounds(100, 100, 450, 300);
        return f;
    }

}
