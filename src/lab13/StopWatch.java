package lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

public class StopWatch extends JLabel implements Runnable {

    private int time;
    private boolean paused = false;
    private static final long serialVersionUID = 7221938502976302688L;

    public synchronized void toggleStop() {
        if (!this.paused) {
            this.paused = true;
        } else {
            notify();
            this.paused = false;
        }
    }
    @Override
    public void run() {

            while (true) {
                synchronized (this) {
                    while (paused) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                int sec = time % 60;
                int min = (time / 60) % 60;
                int hour = (time / 3600) % 24;

                try{
                    setFont(new Font("Tahoma", Font.BOLD, 50));
                    setText(String.format("%02d:%02d:%02d", hour, min, sec));
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                time++;
            }
        }



    public synchronized void pauseThread() {
        paused = true;
    }

    public synchronized void resumeThread() {
        paused = false;
        notify();
    }
}
