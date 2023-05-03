package lab13;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                setFont(new Font("Tahoma", Font.BOLD, 50));
                setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
