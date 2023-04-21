package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class CalculatorTwoGUI implements ActionListener {

    private JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    private JButton plusButton, subtractButton, multiplyButton, divindeButton;
    private JButton clearButton, equalButton;
    private final JTextField tf;
    private int result;
    private double currentNum, prevNum;
    private String operator;

    public CalculatorTwoGUI() {
        JFrame frame = new JFrame("My Calculator");
        frame.setSize(750,750);
        frame.setLayout(new BorderLayout());

        tf = new JTextField();
        frame.add(tf, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        this.num0 = new JButton("0");
        this.num1 = new JButton("1");
        this.num2 = new JButton("2");
        this.num3 = new JButton("3");
        this.num4 = new JButton("4");
        this.num5 = new JButton("5");
        this.num6 = new JButton("6");
        this.num7 = new JButton("7");
        this.num8 = new JButton("8");
        this.num9 = new JButton("9");

        this.plusButton = new JButton("+");
        this.subtractButton = new JButton("-");
        this.multiplyButton = new JButton("x");
        this.divindeButton = new JButton("/");
        this.clearButton = new JButton("C");
        this.equalButton = new JButton("=");

        this.num0.addActionListener(this);
        this.num1.addActionListener(this);
        this.num2.addActionListener(this);
        this.num3.addActionListener(this);
        this.num4.addActionListener(this);
        this.num5.addActionListener(this);
        this.num6.addActionListener(this);
        this.num7.addActionListener(this);
        this.num8.addActionListener(this);
        this.num9.addActionListener(this);

        this.plusButton.addActionListener(this);
        this.subtractButton.addActionListener(this);
        this.multiplyButton.addActionListener(this);
        this.divindeButton.addActionListener(this);
        this.clearButton.addActionListener(this);
        this.equalButton.addActionListener(this);

        panel.add(this.num7);
        panel.add(this.num8);
        panel.add(this.num9);
        panel.add(plusButton);

        panel.add(this.num4);
        panel.add(this.num5);
        panel.add(this.num6);
        panel.add(subtractButton);

        panel.add(this.num1);
        panel.add(this.num2);
        panel.add(this.num3);
        panel.add(multiplyButton);

        panel.add(this.num0);
        panel.add(clearButton);
        panel.add(equalButton);
        panel.add(divindeButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> operators = new ArrayList<>(Arrays.asList("+", "-", "x", "/"));
        JButton currentButton = (JButton) e.getSource();

        if (operators.contains(currentButton.getText())) {
            prevNum = Double.parseDouble(tf.getText());
            operator = currentButton.getText();
            tf.setText("");
        } else if (currentButton.getText().equals("=")) {
            currentNum = Double.parseDouble(tf.getText());
            switch (operator) {
                case "+" -> tf.setText(String.valueOf(prevNum + currentNum));
                case "-" -> tf.setText(String.valueOf(prevNum - currentNum));
                case "x" -> tf.setText(String.valueOf(prevNum * currentNum));
                case "/" -> tf.setText(String.valueOf(prevNum / currentNum));
            }
        } else if (currentButton.getText().equals("C")) {
            prevNum = 0;
            currentNum = 0;
            operator = "";
            tf.setText("");
        } else {
            tf.setText(currentButton.getText());
        }


    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
