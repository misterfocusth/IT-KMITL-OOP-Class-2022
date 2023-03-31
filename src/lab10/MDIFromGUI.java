package lab10;

import javax.swing.*;
import java.awt.*;

public class MDIFromGUI {
    private JFrame frame;
    private JDesktopPane desktopPane;
    private JInternalFrame internalFrame1, internalFrame2, internalFrame3;
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem subMenu1, menuItem1, menuItem2, menuItem3;
    private JMenuItem subMenuItem1, subMenuItem2;
    public MDIFromGUI() {
        frame = new JFrame("Sub Menu Item Demo");
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.decode("000000"));
        internalFrame1 = new JInternalFrame("Application 01");
        internalFrame2 = new JInternalFrame("Application 02");
        internalFrame3 = new JInternalFrame("Application 03");

        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View");

        subMenu1 = new JMenu("New");
        subMenuItem1 = new JMenuItem("Window");
        subMenuItem2 = new JMenuItem("Message");
        subMenu1.add(subMenuItem1);
        subMenu1.add(subMenuItem2);

        menuItem1 = new JMenuItem("Open");
        menuItem2 = new JMenuItem("Save");
        menuItem3 = new JMenuItem("Edit");

        menu1.add(subMenu1);
        menu1.add(menuItem1);
        menu1.add(new JSeparator());
        menu1.add(menuItem2);
        menu1.add(new JSeparator());
        menu1.add(menuItem3);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        frame.setJMenuBar(menuBar);

        internalFrame1.setSize(250, 250);
        internalFrame2.setSize(350, 350);
        internalFrame3.setSize(450, 450);

        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);
        desktopPane.add(internalFrame3);

        internalFrame1.setVisible(true);
        internalFrame2.setVisible(true);
        internalFrame3.setVisible(true);

        frame.add(desktopPane);
        frame.setMinimumSize(new Dimension(300,300));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
