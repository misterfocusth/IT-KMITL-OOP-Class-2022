package final_mock_02_few;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class AddItemView implements ActionListener {
    private ArrayList<Item> data = Data.data;
    private JFrame frame;
    private JTextField idTf, nameTf, priceTf;
    private JButton insertButton;
    private JPanel mainPanel;

    public AddItemView() {
        frame = new JFrame();
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(getCenterPanel(), BorderLayout.CENTER);
        mainPanel.add(getBottomPanel(), BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel getCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2));

        // Init Components
        idTf = new JTextField();
        nameTf = new JTextField();
        priceTf = new JTextField();

        centerPanel.add(new JLabel("Id"));
        centerPanel.add(idTf);
        centerPanel.add(new JLabel("Name"));
        centerPanel.add(nameTf);
        centerPanel.add(new JLabel("Price"));
        centerPanel.add(priceTf);

        return centerPanel;
    }

    private JPanel getBottomPanel() {
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        // Init Component
        insertButton = new JButton("Insert Button");
        insertButton.addActionListener(this);

        bottomPanel.add(insertButton);
        return bottomPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int id = Integer.parseInt(idTf.getText());
        String name = nameTf.getText();
        double price = Double.parseDouble(priceTf.getText());
        Date date = new Date();

        Item newItem = new Item(id, name, price, date);
        data.add(newItem);

        JOptionPane.showMessageDialog(null, "Done it.");

        frame.setVisible(false);
        frame.dispose();
        new DashboardView();
    }
}
