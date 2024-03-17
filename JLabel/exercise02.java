package JLabel;

import javax.swing.*;

public class exercise02 {

    exercise02() {
        JFrame frame = new JFrame("Hello World!");
        JLabel label = new JLabel();
        
        ImageIcon icon = new ImageIcon("image.jpg");
        label.setIcon(icon);

        frame.add(label);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);

    };
    public static void main(String[] args) {
        new exercise02();
    };
};

// Create a JLabel to display an image.

