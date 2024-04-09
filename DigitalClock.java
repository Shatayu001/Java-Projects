import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DigitalClock extends JFrame {
    private JLabel timeLabel;
    public DigitalClock() {
        setTitle("Clock");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setResizable(false);
        setLocationRelativeTo(null);
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        updateTime();
        add(timeLabel);
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
        setVisible(true);
    }
    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        Date currentTime = new Date(System.currentTimeMillis());
        timeLabel.setText(dateFormat.format(currentTime));
    }
    

    public static void main(String[] args) {
        new DigitalClock();
    }
}
