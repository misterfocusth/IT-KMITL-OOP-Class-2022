package lab10;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3;
    private JLabel label1, label2;
    private TextField tf1, tf2;
    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(2,1));

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));

        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        tf1 = new TextField("6000");
        tf1.setEditable(false);
        tf2 = new TextField();

        panel1.add(label1);
        panel1.add(tf1);
        panel1.add(label2);
        panel1.add(tf2);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);

        frame.add(panel1);
        frame.add(panel2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
