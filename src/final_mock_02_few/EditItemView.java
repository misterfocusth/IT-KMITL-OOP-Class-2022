package final_mock_02_few;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class EditItemView implements ActionListener {
    private ArrayList<Item> data = Data.data;
    private JFrame frame;
    private JTextField idTf, nameTf, priceTf;
    private JButton prevButton, nextButton;
    private JButton deleteButton, updateButton, closeButton;
    private JPanel mainPanel, centerPanel, bottomPanel;
    private int currentIndex = 0;

    public EditItemView() {
        frame = new JFrame();
        frame.setSize(500, 250);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(getCenterPanel(), BorderLayout.CENTER);
        mainPanel.add(getBottomPanel(), BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        showData();
    }

    private JPanel getCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2));

        // Init Component
        JLabel idLabel = new JLabel("Id");
        JLabel nameLabel = new JLabel("Name");
        JLabel priceLabel = new JLabel("Price");
        idTf = new JTextField();
        nameTf = new JTextField();
        priceTf = new JTextField();

        // Add component
        centerPanel.add(idLabel);
        centerPanel.add(idTf);
        centerPanel.add(nameLabel);
        centerPanel.add(nameTf);
        centerPanel.add(priceLabel);
        centerPanel.add(priceTf);

        return centerPanel;
    }

    private JPanel getBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 0));

        // Init Components
        prevButton = new JButton("<<<");
        nextButton = new JButton(">>>");
        deleteButton = new JButton("Delete Item");
        updateButton = new JButton("Update Item");
        closeButton = new JButton("Close Item");

        // Set action listener
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        closeButton.addActionListener(this);

        // First Panel
        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new FlowLayout());
        firstPanel.add(prevButton);
        firstPanel.add(nextButton);
        bottomPanel.add(firstPanel);

        // Second Panel
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new FlowLayout());
        secondPanel.add(deleteButton);
        secondPanel.add(updateButton);
        secondPanel.add(closeButton);
        bottomPanel.add(secondPanel);

        return bottomPanel;
    }

    private void showData() {
        if (data.size() == 0) {
            return;
        }

        Item firstIndexItem = data.get(currentIndex);

        idTf.setText(String.valueOf(firstIndexItem.getId()));
        nameTf.setText(firstIndexItem.getName());
        priceTf.setText(String.valueOf(firstIndexItem.getPrice()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(deleteButton)) {
            data.remove(currentIndex);
            JOptionPane.showMessageDialog(null, "Done it.");
            frame.setVisible(false);
            frame.dispose();
            new DashboardView();
        } else if (e.getSource().equals(updateButton)) {
            int id = Integer.parseInt(idTf.getText());
            String name = nameTf.getText();
            double price = Double.parseDouble(priceTf.getText());
            Date date = new Date();
            Item newItemValue = new Item(id, name, price, date);
            data.set(currentIndex, newItemValue);
            JOptionPane.showMessageDialog(null, "Done it.");
            frame.setVisible(false);
            frame.dispose();
            new DashboardView();
        } else if (e.getSource().equals(closeButton)) {
            frame.setVisible(false);
            frame.dispose();
            new DashboardView();
        }

        if (e.getSource().equals(prevButton)) {
            if (currentIndex != 0) {
                currentIndex -= 1;
                Item itemData = data.get(currentIndex);
                idTf.setText(String.valueOf(itemData.getId()));
                nameTf.setText(itemData.getName());
                priceTf.setText(String.valueOf(itemData.getPrice()));
            }
        } else if (e.getSource().equals(nextButton)) {
            if ((currentIndex + 1) <= (data.size() - 1)) {
                currentIndex += 1;
                Item itemData = data.get(currentIndex);
                idTf.setText(String.valueOf(itemData.getId()));
                nameTf.setText(itemData.getName());
                priceTf.setText(String.valueOf(itemData.getPrice()));
            }
        }
    }
}
