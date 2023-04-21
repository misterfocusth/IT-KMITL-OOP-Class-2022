package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorOneGUI implements ActionListener {
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

         btn1.addActionListener(this);
         btn2.addActionListener(this);
         btn3.addActionListener(this);
         btn4.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            showResult("+");
        } else if (e.getSource().equals(btn2)) {
            showResult("-");
        } else if (e.getSource().equals(btn3)) {
            showResult("*");
        } else if (e.getSource().equals(btn4)) {
            showResult("/");
        }
    }

    private void showResult(String operator) {
        double result = 0;
        double num1 = Double.parseDouble(tf1.getText());
        double num2 = Double.parseDouble(tf2.getText());
        if (operator.equals("+")) {
            result =  num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            result = num1 / num2;
        }
        tf3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
