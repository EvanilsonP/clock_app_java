import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JPanel timeLabel;
    String time;
    
    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        setSize(350, 200);
        setResizable(false);


        setVisible(true);
    };
};
