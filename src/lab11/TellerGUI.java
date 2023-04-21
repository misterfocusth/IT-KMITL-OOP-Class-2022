package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TellerGUI implements ActionListener {
    private JFrame frame;
    private JPanel panel1, panel2;
    private JButton depositButton, withdrawButton, exitButton;
    private JLabel label1, label2;
    private TextField balanceTextField, amountTextField;
    private Account acct;
    public TellerGUI() {
        acct = new Account(6000, null);

        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(2,1));

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));

        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        balanceTextField = new TextField(String.valueOf(acct.getBalance()));
        balanceTextField.setEditable(false);
        amountTextField = new TextField();

        panel1.add(label1);
        panel1.add(balanceTextField);
        panel1.add(label2);
        panel1.add(amountTextField);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        exitButton = new JButton("Exit");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        exitButton.addActionListener(this);

        panel2.add(depositButton);
        panel2.add(withdrawButton);
        panel2.add(exitButton);

        frame.add(panel1);
        frame.add(panel2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton currentButton = (JButton) e.getSource();

        if (currentButton.equals(depositButton)) {
            handleDeposit();
        } else if (currentButton.equals(withdrawButton)) {
            handleWithdraw();
        } else if (currentButton.equals(exitButton)) {
            System.exit(0);
        }

        this.balanceTextField.setText(String.valueOf(acct.getBalance()));
    }

    private void handleDeposit() {
        this.acct.deposit(Integer.parseInt(amountTextField.getText()));
    }

    private void handleWithdraw() {
        double withdrawAmount = Integer.parseInt(amountTextField.getText());

        if (withdrawAmount > acct.getBalance()) {
            JOptionPane.showMessageDialog(null, "ยอดเงินไม่พอถอน");
        } else {
            this.acct.withdraw(withdrawAmount);
        }
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
