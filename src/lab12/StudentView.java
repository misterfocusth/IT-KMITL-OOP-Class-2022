package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener, WindowListener {
    private JLabel idLabel, nameLabel, moneyLabel;
    private JTextField idTextField, nameTextField, moneyTextField;
    private JButton depositButton, withdrawButton;

    private int currentMoney = 100;
    private Student student;

    public StudentView() {
        try (FileInputStream fileInputStream = new FileInputStream("StudentM.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            if (new File("StudentM.dat").exists()) {
                this.student = (Student) objectInputStream.readObject();
            } else {
                this.student = new Student("Sila Pakdeewong", 65070219, 100);
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        idLabel = new JLabel("ID: ");
        nameLabel = new JLabel("Name: ");
        moneyLabel = new JLabel("Money: ");

        idTextField = new JTextField(String.valueOf(student.getID()));
        nameTextField = new JTextField(student.getName());
        moneyTextField = new JTextField(String.valueOf(student.getMoney()));
        moneyTextField.setEnabled(false);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        JFrame frame = new JFrame();
        frame.setSize(new Dimension(350, 150));
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(3, 2));
        topPanel.add(idLabel);
        topPanel.add(idTextField);
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);
        topPanel.add(moneyLabel);
        topPanel.add(moneyTextField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(depositButton);
        bottomPanel.add(withdrawButton);

        frame.add(topPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.addWindowListener(this);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(depositButton)) {
            this.student.setMoney(this.student.getMoney() + 100);
            moneyTextField.setText(String.valueOf(this.student.getMoney()));
        } else if (e.getSource().equals(withdrawButton)) {
            if ((this.student.getMoney() - 100) >= 100) {
                this.student.setMoney(this.student.getMoney() - 100);
                moneyTextField.setText(String.valueOf(this.student.getMoney()));
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("[INFO]: WindowClosing");
        try (FileOutputStream fileInputStream = new FileOutputStream("StudentM.dat");
             ObjectOutputStream objectInputStream = new ObjectOutputStream(fileInputStream);
             ) {
            objectInputStream.writeObject(this.student);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String[] args) {
        new StudentView();
    }
}
