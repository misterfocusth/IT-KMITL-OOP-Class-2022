package lab10;

import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {

    public CalculatorTwoGUI() {
        JFrame frame = new JFrame("My Calculator");
        frame.setSize(750,750);
        frame.setLayout(new BorderLayout());

        JTextField tf = new JTextField();
        frame.add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));
        panel.add(new Button("+"));

        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("-"));

        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("X"));

        panel.add(new Button("0"));
        panel.add(new Button("C"));
        panel.add(new Button("="));
        panel.add(new Button("/"));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
