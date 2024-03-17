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
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;

    String time;
    String day;
    String date;
    
    MyFrame() {
        // Shape of the Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        setSize(350, 200);
        setResizable(false);

        // Time and Day Format
        timeFormat = new SimpleDateFormat("hh:mm:ss");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Color and details of the Date Label
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));

        // Color and details of the Time Label 
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        // Color and details of the Date Label
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));

        // Adding labels to the frame
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);

        setVisible(true);
        setTime();
    };

    public void setTime() {
        while (true) {
            // Getting the current time and day and displaying on the frame
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

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
