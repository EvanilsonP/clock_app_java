import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    
    MyFrame() {
        // Shape of the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        setSize(350, 200);
        setResizable(false);

        // Time format
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        timeLabel = new JLabel();

        // Color and details of the Clock 
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        this.add(timeLabel);
        setVisible(true);

        setTime();
    };

    public void setTime() {
        while (true) {
            // Getting the current time and displaying on the frame
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            try {
                // Shows the time and the milliseconds
                Thread.sleep(1000);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
};
