package lab10;

import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    private TextField tf1, tf2, tf3;
    private JButton btn1, btn2, btn3, btn4;
    private JPanel panel;
    public CalculatorOneGUI() {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(4,0));

        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();

        frame.add(tf1);
        frame.add(tf2);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

         btn1 = new JButton("บวก");
         btn2 = new JButton("ลบ");
         btn3 = new JButton("คูณ");
         btn4 = new JButton("หาร");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        frame.add(panel);
        frame.add(tf3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
