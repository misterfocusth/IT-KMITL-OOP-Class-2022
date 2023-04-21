package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField textField;
    private JPanel panel;
    private JButton submitButton, resetButton;
    private String prevChatMessage;

    public ChatDemo() {
        try (
                FileInputStream fileInputStream = new FileInputStream("ChatDemo.dat");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                ) {
            if (new File("ChatDemo.dat").exists()) {
                this.prevChatMessage = (String) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        this.frame = new JFrame();
        this.frame.setLayout(new BorderLayout());

        this.textArea = new JTextArea(20, 45);
        this.textArea.setEditable(false);
        this.textArea.setText(prevChatMessage);

        this.textField = new JTextField(45);

        this.submitButton = new JButton("Submit");
        this.resetButton = new JButton("Reset");

        this.submitButton.addActionListener(this);
        this.resetButton.addActionListener(this);

        this.panel = new JPanel();
        this.panel.setLayout(new FlowLayout());
        this.panel.add(submitButton);
        this.panel.add(resetButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,0));
        bottomPanel.add(textField);
        bottomPanel.add(panel);

        frame.add(this.textArea, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.addWindowListener(this);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(submitButton)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String newMessage = dtf.format(LocalDateTime.now()) + " " + this.textField.getText();
            textArea.append("\n" + newMessage);
        } else if (e.getSource().equals(resetButton)) {
            textArea.setText("");
            textField.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("ChatDemo.dat");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(textArea.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
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

    public static void main(String[] args) {
        new ChatDemo();
    }
}
