package final_mock_01.ex2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookAdd implements ActionListener {
    private JLabel nameLabel, priceLabel, typeLabel;
    private JComboBox typeComboBox;
    private JTextField nameTextField, priceTextField;
    private JButton addButton;
    private JFrame frame;
    private JPanel centerPanel, bottomPanel;

    public BookAdd() {
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(500, 250);

        addButton = new JButton("Insert");
        addButton.addActionListener(this);

        frame.add(getCenterPanel(), BorderLayout.CENTER);
        frame.add(addButton, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText();
        double price = Double.parseDouble(priceTextField.getText());
        String type = (String) typeComboBox.getSelectedItem();
        if (e.getSource().equals(addButton)) {
            Book newBook = new Book(name, price, type);
            BookDatabase.bookList.add(newBook);
            JOptionPane.showMessageDialog(null, "Done it.");
            frame.setVisible(false);
            frame.dispose();
        }
    }
}
