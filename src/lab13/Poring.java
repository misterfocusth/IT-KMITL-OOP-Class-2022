package lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Poring implements MouseListener {
    private final String poringImageURI = "PORING_IMAGE.jpeg";

    private JFrame frame;
    private JLabel poringIconLabel, poringCountLabel;


    public Poring(int poringCount) {

        frame = new JFrame();
        frame.setLayout(new FlowLayout());

        poringIconLabel = new JLabel();
        poringIconLabel.setIcon(new ImageIcon(poringImageURI));
        poringIconLabel.addMouseListener(this);

        poringCountLabel = new JLabel(String.valueOf(poringCount));

        frame.add(poringIconLabel);
        frame.add(poringCountLabel);

        frame.pack();
        frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.frame.setVisible(false);
        this.frame.dispose();
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

