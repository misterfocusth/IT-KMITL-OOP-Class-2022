package lab13;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public MyFrame() {
        JFrame frame = new JFrame();
        MyClock myClock = new MyClock();

        Thread t = new Thread(myClock);
        t.start();

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.add(myClock, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
