package final_mock_02_few;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class DashboardView implements ActionListener, WindowListener {
    private ArrayList<Item> data = Data.data;
    private JButton addButton, editButton, logoutButton;
    private JTable table;
    private JFrame frame;
    private JPanel panel, northPanel, centerPanel;
    private JScrollPane scrollPane;

    public DashboardView() {

        frame = new JFrame();
        frame.setSize(750, 500);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(getNorthPanel(), BorderLayout.NORTH);
        panel.add(getCenterPanel(), BorderLayout.CENTER);

        // Load Data to table
        showTableData();

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(this);
        frame.setVisible(true);
    }

    private JPanel getNorthPanel() {
        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 0));

        // Init Components
        JLabel headerLabel = new JLabel("Welcome to Jisoo Marketplace");
        addButton = new JButton("Add Item");
        editButton = new JButton("Edit Item");
        logoutButton = new JButton("Logout");

        // Bottom Flow Layout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(logoutButton);

        // Add Button Listener
        addButton.addActionListener(this);
        editButton.addActionListener(this);
        logoutButton.addActionListener(this);

        // Add To Main north panel
        JPanel topHeaderPanel = new JPanel();
        topHeaderPanel.setLayout(new FlowLayout());
        topHeaderPanel.add(headerLabel);
        northPanel.add(topHeaderPanel);
        northPanel.add(buttonPanel);

        return northPanel;
    }

    private JPanel getCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        // Init Components
        table = new JTable();

        scrollPane = new JScrollPane();
        scrollPane.setBounds(50,50, 500, 100);
        scrollPane.setViewportView(table);

        // Add component to panel
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        return centerPanel;
    }

    private void showTableData() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Created_On");

        if (data.size() != 0) {
            for (int currentIdx = 0; currentIdx <= (Data.data.size() - 1); currentIdx++) {
                int id = data.get(currentIdx).getId();
                String name =  data.get(currentIdx).getName();
                double price = data.get(currentIdx).getPrice();
                Date created_on = data.get(currentIdx).getCreated_on();

                int day = created_on.getDay();
                int month = created_on.getMonth();
                int year = created_on.getYear() + 1900;
                String dateString = day + "/" + month + "/" + year;

                System.out.println(id + name + price + dateString);

                model.addRow(new Object[] {id, name, price, dateString});
            }
        }
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addButton)) {
            new AddItemView();
            frame.setVisible(false);
            frame.dispose();
        } else if (e.getSource().equals(editButton)) {
            new EditItemView();
            frame.setVisible(false);
            frame.dispose();
        } else if (e.getSource().equals(logoutButton)) {
            try (FileOutputStream fileOutputStream = new FileOutputStream("jisoo_shop.dat");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ) {
                objectOutputStream.writeObject(data);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            new LoginView();
            frame.setVisible(false);
            frame.dispose();
        }
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
