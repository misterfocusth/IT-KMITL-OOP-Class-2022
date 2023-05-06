package final_mock_02_few;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoginView implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel panel;
    private JTextField loginTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        try (FileInputStream fileInputStream = new FileInputStream("jisoo_shop.dat");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            Data.data = (ArrayList<Item>) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        frame = new JFrame();
        frame.setSize(500, 250);
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));

        loginTextField = new JTextField();
        passwordField = new JPasswordField();

        centerPanel.add(new JLabel("Login"));
        centerPanel.add(loginTextField);
        centerPanel.add(new JLabel("Password"));
        centerPanel.add(passwordField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        bottomPanel.add(loginButton);

        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = loginTextField.getText();
        String password = "";

        for (char ch : passwordField.getPassword()) {
            password += ch;
        }

        if (login.equals("jisoo") && password.equals("flower_me")) {
          new DashboardView();
          frame.setVisible(false);
          frame.dispose();
        }
    }

    public static void main(String[] args) {
        new LoginView();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {

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
}
