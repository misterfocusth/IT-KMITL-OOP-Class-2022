package lab13;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

public class WatchConstructor implements MouseListener {
    private TimerClock timerClock;
    private StopWatch stopWatch;
    public static boolean isPaused = false;
    private Thread t2;

    public WatchConstructor() {
        this.timerClock = new TimerClock();
        Thread t1 = new Thread(timerClock);
        t1.start();

        JFrame frame1 = new JFrame("Timer Clock");
        frame1.setLayout(new BorderLayout());
        frame1.setSize(500,500);
        frame1.add(timerClock, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // frame1.setVisible(true);

        this.stopWatch = new StopWatch();
        t2 = new Thread(stopWatch);
        t2.start();

        JFrame frame2 = new JFrame("Timer Stop Watch");
        frame2.addMouseListener(this);
        frame2.setLayout(new BorderLayout());
        frame2.setSize(500,500);
        frame2.add(stopWatch, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }

    public static void main(String[] args) {
        new WatchConstructor();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        stopWatch.toggleStop();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
