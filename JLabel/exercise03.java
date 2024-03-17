package JLabel;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class exercise03 {

    exercise03() {
        JFrame frame = new JFrame("Dynamic Label");
        JLabel label = new JLabel("Click the button");
        JButton button = new JButton("Click me");

        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Button clicked");
                }
            });

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);

    };

    public static void main(String[] args) {
        new exercise03();
    }
}

// Create a JLabel that initially displays "Click the button", and change the text to "Button clicked" when a button is clicked.