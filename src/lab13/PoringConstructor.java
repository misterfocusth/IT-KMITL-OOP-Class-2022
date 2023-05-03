package lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoringConstructor implements ActionListener {
    private int poringCount = 0;
    private JFrame frame;
    private JButton addButton;

    public PoringConstructor() {
        frame = new JFrame();
        frame.setSize(150, 150);
        frame.setLayout(new FlowLayout());

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        frame.setLocationRelativeTo(null);
        frame.add(addButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        poringCount += 1;
        new Poring(poringCount);
    }
}
