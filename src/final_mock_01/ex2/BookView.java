package final_mock_01.ex2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BookView implements ActionListener, WindowListener {
    private JFrame frame;
    private JButton prevButton, nextButton;
    private JButton addButton, updateButton, deleteButton;
    private JTextField currentBookNoTextField, nameTextField, priceTextField;
    private JComboBox typeComboBox;
    private JLabel nameLabel, priceLabel, typeLabel;
    private JPanel centerPanel, bottomPanel;
    private int currentBookNo;

    public BookView() {
        frame = new JFrame();
        currentBookNo = 0;
        frame.setSize(500, 250);
        frame.setLayout(new BorderLayout());

        frame.add(getCenterPanel(), BorderLayout.CENTER);
        frame.add(getBottomPanel(), BorderLayout.SOUTH);

        ArrayList<JButton> buttons = new ArrayList<>(List.of(addButton, updateButton, deleteButton, prevButton, nextButton));
        for (JButton button : buttons) {
            button.addActionListener(this);
        }

        frame.addWindowListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel getCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,2));

        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");

        nameTextField = new JTextField();
        priceTextField = new JTextField();
        typeComboBox = new JComboBox(new String[] {"General", "Computer", "Math&Sci", "Photo"});

        centerPanel.add(nameLabel);
        centerPanel.add(nameTextField);

        centerPanel.add(priceLabel);
        centerPanel.add(priceTextField);

        centerPanel.add(typeLabel);
        centerPanel.add(typeComboBox);

        return centerPanel;
    }

    private JPanel getBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,0));

        prevButton = new JButton("<<<");
        nextButton = new JButton(">>>");
        currentBookNoTextField = new JTextField(String.valueOf(currentBookNo));

        JPanel childTopPanel = new JPanel();
        childTopPanel.setLayout(new FlowLayout());
        childTopPanel.add(prevButton);
        childTopPanel.add(currentBookNoTextField);
        childTopPanel.add(nextButton);

        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        JPanel childBottomPanel = new JPanel();
        childBottomPanel.setLayout(new FlowLayout());
        childBottomPanel.add(addButton);
        childBottomPanel.add(updateButton);
        childBottomPanel.add(deleteButton);

        bottomPanel.add(childTopPanel);
        bottomPanel.add(childBottomPanel);

        return bottomPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = "";
        String type = "General";
        double price = 0.0;

        try {
            name = nameTextField.getText();
            price = Double.parseDouble(priceTextField.getText());
            type = (String) typeComboBox.getSelectedItem();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }

        if (e.getSource().equals(addButton)) {
            new BookAdd();
        } else if (e.getSource().equals(updateButton)) {
            Book book = new Book(name, price, type);
            BookDatabase.bookList.set(currentBookNo, book);
            JOptionPane.showMessageDialog(null, "Done it.");
        } else if (e.getSource().equals(deleteButton)) {
            BookDatabase.bookList.remove(currentBookNo);
            JOptionPane.showMessageDialog(null, "Done it.");
        } else if (e.getSource().equals(prevButton)) {
            if ((currentBookNo - 1) >= 0) {
                currentBookNo -= 1;
                currentBookNoTextField.setText(String.valueOf(currentBookNo));
                Book book = BookDatabase.bookList.get(currentBookNo);
                nameTextField.setText(book.getName());
                priceTextField.setText(String.valueOf(book.getPrice()));
                typeComboBox.setSelectedItem(book.getType());
            }
        } else if (e.getSource().equals(nextButton)) {
            if ((BookDatabase.bookList.size() - 1) >= (currentBookNo + 1)) {
                currentBookNo += 1;
                Book book = BookDatabase.bookList.get(currentBookNo);
                currentBookNoTextField.setText(String.valueOf(currentBookNo));
                nameTextField.setText(book.getName());
                priceTextField.setText(String.valueOf(book.getPrice()));
                typeComboBox.setSelectedItem(book.getType());
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fis = new FileInputStream("Book.data");
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            LinkedList<Book> list = (LinkedList<Book>) ois.readObject();
            if (new File("Book.data").exists()) {
                System.out.println(list.toArray());
                System.out.println(list.size());
                if (list != null) {
                    BookDatabase.bookList = list;
                    Book firstBook = BookDatabase.bookList.get(0);
                    nameTextField.setText(firstBook.getName());
                    priceTextField.setText(String.valueOf(firstBook.getPrice()));
                    typeComboBox.setSelectedItem(firstBook.getType());
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fis = new FileOutputStream("Book.data");
             ObjectOutputStream ois = new ObjectOutputStream(fis);) {
            ois.writeObject(BookDatabase.bookList);
        } catch (Exception ex) {
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
        new BookView();
    }
}
