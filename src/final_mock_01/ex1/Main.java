package final_mock_01.ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main implements ActionListener {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenuItem, openMenuItem, saveMenuItem, closeMenuItem;
    private JFrame frame;
    private JTextArea textArea;
    private File selectedFile;

    public Main() {
        frame = new JFrame("My Text Editor");
        frame.setSize(500, 500);

        frame.setJMenuBar(getMenuBar());

        textArea = new JTextArea(200, 20);

        frame.add(textArea);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JMenuBar getMenuBar() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        closeMenuItem = new JMenuItem("Close");

        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        closeMenuItem.addActionListener(this);

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(new JSeparator());
        fileMenu.add(closeMenuItem);

        menuBar.add(fileMenu);
        return menuBar;
    }

    private void handleSaveFile() {
        try (FileOutputStream fileOutputStream  = new FileOutputStream(selectedFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
             ) {
            objectOutputStream.writeObject(textArea.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void handleOpenFile() {
        try (FileInputStream fileInputStream = new FileInputStream(selectedFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            String savedString = (String) objectInputStream.readObject();
            textArea.setText(savedString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(newMenuItem)) {
            textArea.setText("");
            selectedFile = null;
        } else if (e.getSource().equals(openMenuItem)) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(frame);
            selectedFile = fileChooser.getSelectedFile();
            handleOpenFile();
        } else if (e.getSource().equals(saveMenuItem)) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showSaveDialog(frame);
            selectedFile = fileChooser.getSelectedFile();
            handleSaveFile();
        } else if (e.getSource().equals(closeMenuItem)) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
