package JLabel;

import javax.swing.*;

public class exercise01 {

    exercise01() {
        JFrame frame = new JFrame("Hello World!");
        JLabel label = new JLabel("Hello World!");

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.setVisible(true);
    };
    public static void main(String[] args) {
        new exercise01();
    };
};

// Create a JLabel that displays the text "Hello, World!".
